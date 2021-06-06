/*
Tendremos un sistema que debe clasificar 
el resultado de una evaluación. 
Como dato de entrada tendremos un entero 
y como resultado un String de la clasificación 


*/ 
package PracticaGuiada;

public class Ejercicio3 {
    public static void eje3(int nota){

        if (nota > 92){
            System.out.println("Excelente");
        }else if(nota > 84){
            System.out.println("Sobresaliente");
        }else if(nota > 74){
            System.out.println("Distinguido");
        }else if(nota > 59){
            System.out.println("Bueno");
        }else{
            System.out.println("Desaprobado");
        }
    }

}
// Otros operadores a tener en cuenta
/*

== IGUALDAD
!= DISTINTO(NO IGUAL)
> MAYOR
>= MAYOR O IGUAL
< MENOR
<= MENOR O IGUAL

*/ 
