grammar id;

@header {
    package PracticoUno;
}

fragment DIGITO : [0-9] ;
ENTERO : DIGITO+ ;

s: ENTERO {System.out.println("Encontre entero"); } s 
    |
    ;