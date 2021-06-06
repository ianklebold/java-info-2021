import java.util.*;

public class ejeCompl4 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para realizar su factorial");
        int entrada = scan.nextInt();

        factorial(entrada);

        scan.close();
    }

    public static void factorial(int numero){
        int control = 1;

        for(int i=1; i <= numero; i++){
            control = control*i;
        }
        System.out.println("El factorial de : " + numero + " es: " + control);
            

    }
    
}
