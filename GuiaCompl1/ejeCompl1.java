import java.util.Scanner;

public class ejeCompl1{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Ingrese porfavor su nombre");
        String entrada = scan.nextLine();

        mostrarNombre(entrada);
        scan.close();



    }

    public static void mostrarNombre( String entrada){

        System.out.println("HOLA " + entrada);

    }
}