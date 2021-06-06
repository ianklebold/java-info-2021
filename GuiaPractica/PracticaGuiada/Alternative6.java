package PracticaGuiada;
import java.util.*;
import PracticaGuiada.Ejercicio2;
import PracticaGuiada.Ejercicio3;
import PracticaGuiada.Ejercicio4S1;
import PracticaGuiada.Ejercicio5;

/*

Tratar de mejorar el código de los ejercicios 2, 3, 4 y 5. 
Donde realizaremos una vez la operación y 
luego preguntaremos si continuar con otro cálculo. 
Caso contrario, finaliza el programa. 

*/ 
public class Alternative6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);    
        int operacion;
        do{
            
            System.out.println("Ingrese porfavor la operacion a realizar ");
            System.out.println("1. Imprimir tres numeros ");
            System.out.println("2. Evaluacion de calificacion ");
            System.out.println("3. Evaluacion del dia de la semana ");
            System.out.println("4. Sumatoria y multiplicacion ");
            System.out.println("0. Para cerrar ");
            operacion = scan.nextInt();
            
            if (operacion <= 4 && operacion >= 0){
                if(operacion == 1){
                    System.out.println(" ");
                    System.out.println("Ingresa 3 numeros ");
                    int a = scan.nextInt(); //Usamos a scan como receptor de la proxima entrada y lo guardamos en a
                    int b = scan.nextInt();
                    int c = scan.nextInt();
                    Ejercicio2.eje2(a, b, c);
                }else if(operacion == 2){
                    System.out.println(" ");
                    int nota = scan.nextInt();
                    Ejercicio3.eje3(nota);

                }else if (operacion == 3){
                    System.out.println(" ");
                    int numero = scan.nextInt();
                    Ejercicio4S1.eje4S1(numero);
                }else if (operacion == 4){
                    System.out.println(" ");
                    int entrada = scan.nextInt(); 
                    Ejercicio5.eje5(entrada);
                }else{
                    System.out.println(" ");
                    System.out.println("Adios!");
                }
               
            }
            System.out.println(" ");
            
        }while(operacion != 0);
        scan.close();
    }
    
}
