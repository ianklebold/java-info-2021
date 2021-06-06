import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

   

    private static ArrayList ciudades;

    public static void main(String[] args) {
        ArrayList ciudades = new ArrayList(); //Declaracion de un array list

        cargarCiudades(ciudades);
        listarCiudades(ciudades);    
    }


    public static void cargarCiudades(ArrayList ciudades){
        //Funcion del main que devuelve una lista
        System.out.println("Ingresaremos sus 10 ciudades favoritas");
        Scanner scan = new Scanner(System.in);

        String entrada;
        int contador = 1;
        ciudades.add("Top 10 de las ciudades");

        for(int i=1; i<=10; i++){
            System.out.println("Ingrese porfavor su ciudad favorita en el puesto : " + contador);
            entrada = scan.nextLine();

            ciudades.add(entrada);

            contador = contador + 1;
        }
        scan.close();
    }

    public static void listarCiudades(ArrayList ciudades){
        Ejercicio1.ciudades = ciudades;
        System.out.println(ciudades.get(0));
        for(int i = 1; i < ciudades.size(); i++){
            System.out.println("#"+i+" - "+ciudades.get(i));
        }
    }
    
}