import javax.script.*;
import java.util.*;

public class MyVisitor<T> extends interpreterBaseVisitor<T>{
    HashMap<String, Object> table = new HashMap<>();

    @Override public T visitForstatement(interpreterParser.ForstatementContext ctx){
        visitAsignationstatement(ctx.asignationstatement(0));
        boolean march =  Boolean.valueOf(visitLogicexpr(ctx.logicexpr()).toString());
        while (march) {
            visitBodyblock(ctx.bodyblock());
            visitAsignationstatement(ctx.asignationstatement(1));
            march=Boolean.valueOf(visitLogicexpr(ctx.logicexpr()).toString());
            visitAsignationstatement(ctx.asignationstatement(1));
            System.out.println("Marchando:"+ " "+ ctx.asignationstatement(1).ID());
        }
        System.out.println("TEST"+ctx);
        return null;
    }

    @Override public T visitWhilestatement(interpreterParser.WhilestatementContext ctx){
        boolean ans = Boolean.valueOf(visitLogicexpr(ctx.logicexpr()).toString());
        while (ans) {

            visitBodyblock(ctx.bodyblock());
            System.out.println(table.get(ctx.logicexpr().mathexpr(0).ID()));
            ans = Boolean.valueOf(visitLogicexpr(ctx.logicexpr()).toString());
            System.out.println("Pregunta: "+ans);
        }


        return null;
    }

    @Override
    public T visitBodyblock(interpreterParser.BodyblockContext ctx) {

        if (ctx.vardeclaration() != null) {
//            visitVardeclaration(ctx.vardeclaration(0));
            for (interpreterParser.VardeclarationContext declar:ctx.vardeclaration()) {
                visitVardeclaration(declar);
            }
        }

        else if (ctx.asignationstatement() != null) {
            for (interpreterParser.AsignationstatementContext assign:ctx.asignationstatement()) {
                visitAsignationstatement(assign);
            }
        }

        else if (ctx.conditional() != null) {
            visitConditional(ctx.conditional(0));
        }
        else if (ctx.forstatement() != null){
            visitForstatement(ctx.forstatement(0));
            /* for (interpreterParser.ForstatementContext forcall:ctx.forstatement()) {
                visitForstatement(forcall);
            }*/
        }
        else if (ctx.whilestatement() != null){
            visitWhilestatement(ctx.whilestatement(0));
        }
        else {
            return visitChildren(ctx);
        }
        return super.visitBodyblock(ctx);
    }

    @Override
    public T visitConditional(interpreterParser.ConditionalContext ctx) {
        boolean ans = Boolean.valueOf(visitLogicexpr(ctx.logicexpr(0)).toString());

        if (ans) {
            System.out.println("True");
            visitBodyblock(ctx.bodyblock(0));
        }
        else {
            visitBodyblock(ctx.bodyblock(1));
        }

        return null;
    }

    @Override
    public T visitLogicexpr(interpreterParser.LogicexprContext ctx) {
        String op = ctx.ROP().getText();
        Object num1 = visitMathexpr(ctx.mathexpr(0));
        Object num2 = visitMathexpr(ctx.mathexpr(1));
        System.out.println(num1 + " " +op + " "+ num2);
        Object ans = null;

        switch (op) {
            case "<":
                ans = Integer.parseInt(num1.toString()) < Integer.parseInt(num2.toString());
                break;
            case "<=":
                ans = Integer.parseInt(num1.toString()) <= Integer.parseInt(num2.toString());
                break;
            case ">":
                ans = Integer.parseInt(num1.toString()) > Integer.parseInt(num2.toString());
                break;
            case ">=":
                ans = Integer.parseInt(num1.toString()) >= Integer.parseInt(num2.toString());
                break;
//            case "==":
//                ans = Math.abs(num1 - num2) < 0.000000001;
//                break;
//            case "!=":
//                ans = Math.abs(num1 - num2) > 0.000000001;
//                break;
        }

        return (T)ans;
    }

    @Override
    public T visitMathexpr(interpreterParser.MathexprContext ctx) {
        if (ctx.getChildCount() == 1){
            if (ctx.FLOAT() != null){
                Double math_value = new Double(ctx.FLOAT().getText());
//                System.out.println(math_value);
                return (T) math_value;
            } else if (ctx.INTEGER() != null) {
                Integer math_value = Integer.parseInt(ctx.INTEGER().getText());
//                System.out.println(math_value);
                return (T) math_value;
            } else if (ctx.PIZQ() != null) {
                return visitMathexpr(ctx.mathexpr(0));
            } else if (ctx.ID() != null) {
                String name = ctx.ID().getText();
                Object value;

                if ((value = table.get(name)) != null) {
                    System.out.println(value.toString());
                    return (T) value;
                }
            }
        }else {
            String op = (ctx.MULOP() != null ? ctx.MULOP().getText() : ctx.SUMOP().getText());
            Object num1 = visitMathexpr(ctx.mathexpr(0));
            Object num2 = visitMathexpr(ctx.mathexpr(1));
            Object ans = 0;
//            System.out.println(num1);
//            System.out.println(num2);

            switch (op) {
                case "+":
                    ans = Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString());

                    System.out.println(ans);
                    break;
                case "-":
                    ans = Integer.parseInt(num1.toString()) - Integer.parseInt(num2.toString());
                    break;
                case "*":
                    ans = Integer.parseInt(num1.toString()) * Integer.parseInt(num2.toString());
                    break;
                case "/":
                    ans = Integer.parseInt(num1.toString()) / Integer.parseInt(num2.toString());

                    break;
            }
            return (T)ans;

        }
//        System.out.println(ctx.getText());
//        else if () {
//
//        }
        return null;
    }

    @Override
    public T visitAsignationstatement(interpreterParser.AsignationstatementContext ctx) {
//        //System.out.println(ctx.ID());
//          //System.out.println(ctx.mathexpr().getText());
//        visitMathexpr(ctx.mathexpr());
        String variable_value = "";
        if (ctx.mathexpr().getText().matches("[0-9]+(  [.][0-9]+)") || ctx.mathexpr().getText().matches("[0-9]+")){
            System.out.println(ctx.ID().toString()+" asignado "+ ctx.mathexpr().getText());
            table.put(ctx.ID().toString(),ctx.mathexpr().getText());
        }

        else{
            variable_value = get_values_string(ctx.mathexpr().getText());
            ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
            ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
            // JavaScript code from String
            Object ob = null;
            try {
                System.out.println(ob +" "+variable_value);
                System.out.println(scriptEngine.eval(variable_value));
                ob = scriptEngine.eval(variable_value);
            } catch (ScriptException e) {
                throw new RuntimeException(e);
            }
            table.put(ctx.ID().toString(),ob);
            System.out.println(ctx.ID().toString()+ " "+ob);
        }

//        //System.out.println(ctx.mathexpr().getChildCount());
        return null;
    }
    @Override
    public T visitVardeclaration(interpreterParser.VardeclarationContext ctx) {
        String varType = visitDatatypedeclaration(ctx.datatypedeclaration()).toString();
        table.put(ctx.ID().getText(), 1.0);
        System.out.println(ctx.ID().getText());
        return null;
    }

    @Override
    public T visitDatatypedeclaration(interpreterParser.DatatypedeclarationContext ctx) {
        return (T) ctx.getChild(0);
    }


    public String get_values_string(String input){
        List<Character> operator = Arrays.asList(' ','+','-','/','*','(',')');
        System.out.println("cadena "+input);
        String aux = "";
        String variable_value;
        char value;
        int start = 0, end=-1;

        for (int i = 0; i < input.length(); i++) {
           value = input.charAt(i);
           //System.out.println(i);
           if(String.valueOf(value).matches("[a-zA-Z]")){
               start = i;
               while(!operator.contains(value) && i<input.length()-1 ){
                   i++;
                   value = input.charAt(i);
                   //System.out.println(i + " "+ value);
                   //System.out.println(!operator.contains(value));
               }
               end=i--;
               //System.out.println("ahora si"+input.substring(end,end+1));
               if (operator.contains(input.charAt(end))){
                   end--;
               }
               //System.out.println("asd"+i);
               //System.out.println(start);
               //System.out.println("imta " + input.substring(start,end));
               //System.out.println("imta " + input.substring(start,end+1));
               //System.out.println("valo"+String.valueOf(table.get(input.substring(start,end+1))));
               if (String.valueOf(table.get(input.substring(start,end+1))) != null){
                   variable_value = String.valueOf(table.get(input.substring(start,end+1)));

                   if (start!=0){
                       //System.out.println("RARO");
                       aux = aux + variable_value;
                       //System.out.println(aux);
                       start = i+1  ;
                       i = end;
                   }
                   else{
                       aux = aux + variable_value;
                       //System.out.println(aux);
                       start = i+1;
                       i = end;
                   }
               }
               else{
                   //System.out.println("ffff");
               }
            }
           else{
               //System.out.println("gha");
               aux = aux + input.substring(i,i+1);
//               start++;
           }
        }
        //System.out.println(aux);
        //System.out.println("------");
        return aux;
    }
}

