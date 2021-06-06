package PracticaGuiada;
import java.util.*;
public class Ejercicio4S2 {
    /*
    Realizar un programa 
    que dado un número de 
    entrada entre 1 a 7, 
    nos devuelva el dia de la semana 
    */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        
        entrada.close();

        switch(numero){
            case 1:
                System.out.println("Domingo");
                break; //Una vez entra a esta condicion, ejecuta su cuerpo y sale
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5: 
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
    }
}
