grammar interpreter;

//Un programa es un bloque de codigo seguido del end of file
//Un bloque es un statement donde cada statement se sigue de una linea nueva
//o EOF
codeblock: statement |EOF;

//lista de statements
statement: (functioncreation)+ maincreation | bodyblock;

//Deben haber bloques por fuera de funciones (cualquier statement)
//por dentro (cualquier statement que no declare funcion o main)
bodyblock: ((vardeclaration)+
     | (inputstatement)+ |(arraydeclaration)+
     |(printstatement)+|(asignationstatement)+|(conditional)+|(forstatement)+|(whilestatement))+  ;
/*[type] array([size]) [identifier]*/
arraydeclaration: datatypedeclaration 'array' PIZQ (INTEGER|'?') PDER ID;
//entrada
//Delaracion de funciones
functioncreation:'Function ' ID '(' params ')' 'returns ' returndt bodyblock;

maincreation:'Function ' 'Main' '(' ')'  'returns ' returndt (ID)? bodyblock;
//parametros funcion
params: datatypedeclaration ID (','datatypedeclaration ID)*;

//tipos de datos que devuelve una funcion
returndt: datatypedeclaration ID? | 'nothing';

//declaracion de variables
vardeclaration: datatypedeclaration ID;

//tipos de datos para variables
datatypedeclaration: 'integer ' | 'float ';

//for
forstatement: 'for ' asignationstatement ';' logicexpr ';' asignationstatement bodyblock;

//while
whilestatement: 'while ' logicexpr bodyblock;

//Impresion
printstatement:'Put ' (ID|STRING|INTEGER|FLOAT|mathexpr) ' to ' 'output';
//Asignacion
asignationstatement: ID '=' mathexpr ;

//IF
conditional : 'if' logicexpr bodyblock ('elseif' logicexpr bodyblock)* ('else' bodyblock)*;
//entrada
inputstatement: ID '=' 'Get' 'next' 'input';
//Desicion expression
logicexpr:(LOGICNOT)? mathexpr ROP mathexpr (LOGIC (LOGICNOT)? logicexpr)*;

//expression test
mathexpr: mathexpr MULOP mathexpr
   |  mathexpr SUMOP mathexpr
   |  FLOAT
   |  PIZQ mathexpr PDER
   |  ID
   | INTEGER
   |'SquareRoot' PIZQ mathexpr PDER
   |'RaiseToPower' PIZQ mathexpr','mathexpr PDER
   | 'AbsoluteValue' PIZQ mathexpr PDER
   ;



//identificador
ID: [a-zA-Z]+[a-zA-Z0-9_]*;
PIZQ   : '(' ;
PDER   : ')' ;
ROP       : ( '<' | '<=' | '>=' | '>' | '==' | '!=' ) ;
SMCOLON : ';' ;
MULOP  : ( '*' | '/' |'%');
SUMOP  : ('+' | '-') ;
LOGIC: ( ' and ' | ' or ' );
LOGICNOT: ('not ');
LINE_COMMENT   : '//' ~[\r\n]* -> skip ;
INTEGER:[-]?[0-9]+;
FLOAT:  [-]?[0-9]+(  [.][0-9]+);
STRING   : '"'[ a-zA-Z0-9_ ]*'"';
WS :  [ \t\r\n ]+ -> skip ;