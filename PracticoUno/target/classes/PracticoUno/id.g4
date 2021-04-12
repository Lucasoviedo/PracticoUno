grammar id;

@header {
    package PracticoUno;
}

fragment DIGITO : [0-9] ;

MESPAR : DIGITO DIGITO '/' DIGITO [02468] '/' DIGITO DIGITO DIGITO DIGITO; //VA BIEN
HORAMENOR : ('0'[89] ':' DIGITO DIGITO)|('1'[012]':'DIGITO DIGITO) ; 
HORAMAYOR : ('18:' [345] DIGITO)|(('19:'|'20:') DIGITO DIGITO)|('21:'[012] DIGITO)|('21:30') ; 

OTRO : . -> skip ;

s: MESPAR {System.out.println("Linea " + $MESPAR.getLine() + " es mes par -> |" + $MESPAR.getText() + "|"); } s 
    | HORAMENOR {System.out.println( "Linea " + $HORAMENOR.getLine() + " es hora menor -> |" + $HORAMENOR.getText() +"|" ); } s 
    | HORAMAYOR {System.out.println( "Linea " + $HORAMAYOR.getLine() + " es hora Mayor -> |" + $HORAMAYOR.getText() +"|" ); } s 
    |
    ;