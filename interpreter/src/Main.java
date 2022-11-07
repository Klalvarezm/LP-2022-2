import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String [] args) throws Exception{
        interpreterLexer lexer = new interpreterLexer(CharStreams.fromFileName("input/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        interpreterParser parser = new interpreterParser(tokens);
        ParseTree tree = parser.codeblock();

        MyVisitor loader = new MyVisitor();
        loader.visit(tree);
    }
}
