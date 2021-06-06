import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        ArrayList numeros = new ArrayList(5);

        ingresarEnteros(numeros);  

    }

    public static void ingresarEnteros(ArrayList numeros){

        Scanner scan = new Scanner(System.in);
        

        for(int i=1; i < 5; i++){
            System.out.println("Ingrese porfavor un numero en la posicion : " + i);
            int entrada = scan.nextInt();
            numeros.add(entrada);
        }

        int sizeAnt;
        sizeAnt = numeros.size();

        System.out.print("Ingresemos un elemento en la primera posicion");
        int entrada = scan.nextInt();

        numeros.add(0, entrada); //Ingresar elemento en la primer posicion
        
        System.out.print("Ahora un elemento en la ultima posicion");
        entrada = scan.nextInt();

        numeros.add(entrada);

        scan.close();

        System.out.println("Listado de numeros");
        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        System.out.println(" ");
        System.out.println("Antes de cargar el primer y ultimo elemento");
        System.out.println("El tamaño de la lista era : " + sizeAnt);

        System.out.println("Ahora tiene un tamaño de : " + numeros.size());
    }
}
