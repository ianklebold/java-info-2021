package PracticaGuiada;
import java.util.*;

/*
En base a los ejercicios 2 al 4, modificar los programas para que 
separe la lógica de negocio (cálculo aritmético, procesamiento, etc) en funciones.

*/
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa porfavor 3 numeros");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        tresnumeros(a, b, c);
        System.out.println(" ");

        System.out.println("Ingresa una calificacion a evaluar");
        int nota = scan.nextInt();
        evaluarnota(nota);
        System.out.println(" ");

        System.out.println("Ingresa un dia de la semana");
        int numero = scan.nextInt();
        diasemana(numero);
        System.out.print(" ");

        System.out.println("Programa terminado");

        scan.close();
    }

    //Ejercicio 2
    public static void tresnumeros(int a, int b, int c){
        System.out.println("El primer nro ingresado es: " +  a);
        System.out.println("El segundo nro ingresado es: "+ b);
        System.out.println("El tercer nro ingresado es: "+ c);
    }
    //Ejercicio 3
    public static void evaluarnota(int nota){
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

    public static void diasemana(int numero){
        if (numero == 1){
            System.out.println("Domingo");
        }else if (numero == 2){
            System.out.println("Lunes");
        }else if (numero == 3){
            System.out.println("Martes");
        }else if (numero == 4){
            System.out.println("Miercoles");
        }else if (numero == 5){
            System.out.println("Jueves");
        }else if (numero == 6){
            System.out.println("Viernes");
        }else{
            System.out.println("Sabado");
        }
    }




}
