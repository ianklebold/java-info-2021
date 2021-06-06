package PracticaGuiada;
import java.util.*;

public class Ejercicio6S2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int respuesta = 1; //Asignamos 1 para que entre al bucle while
        
        do{ //En este caso usamos un do while, es decir se ejecuta al menos una vez 
            //Y la evaluacion se realiza al final del bucle
            System.out.println("Ingresa un numero : ");
            int numero = scan.nextInt();
            System.out.println("El numero ingresado es : "+ numero);

            System.out.println("¿Desea volver a ingresar un numero?");
            respuesta = scan.nextInt();

        }while(respuesta == 1);
        scan.close();
    }
    
}
