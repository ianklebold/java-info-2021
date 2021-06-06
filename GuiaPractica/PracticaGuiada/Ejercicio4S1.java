package PracticaGuiada;
public class Ejercicio4S1 {

    /*
    Realizar un programa 
    que dado un número de 
    entrada entre 1 a 7, 
    nos devuelva el dia de la semana 
    */
    public static void eje4S1(int numero){
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
