package PracticaGuiada;
import java.util.*;
/*

Debemos realizar un programa que nos realizará una 
pregunta si queremos realizar una operación dada o si 
deseamos salir/terminar el programa.
Utilizaremos en este caso una simple 
operación que nos pide un número y 
luego lo imprime.


*/
public class Ejercicio6S1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int respuesta = 1; //Asignamos 1 para que entre al bucle while
        
        while(respuesta == 1){
            System.out.println("Ingresa un numero : ");
            int numero = scan.nextInt();
            System.out.println("El numero ingresado es : "+ numero);

            System.out.println("¿Desea volver a ingresar un numero?");
            respuesta = scan.nextInt();

        }
        scan.close();
    }
}
