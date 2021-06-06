import java.util.Scanner;

public class ejeCompl5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero a multiplicar");
        int entrada1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero");
        int entrada2 = scan.nextInt();

        multiplicaSumando(entrada1, entrada2);
        scan.close();
    }

    public static void multiplicaSumando(int entrada1, int entrada2){
        int resultado= 0;
        for(int i=1; i <= entrada2; i++){
            resultado = resultado + entrada1; 

        }
        System.out.println(entrada1 + " x " + entrada2 + " = " + resultado);
    }
    
}
