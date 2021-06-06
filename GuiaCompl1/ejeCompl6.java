import java.util.Scanner;

public class ejeCompl6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un primer numero ");
        int entrada1 = scan.nextInt();

        System.out.println("Ingrese la potencia");
        int entrada2 = scan.nextInt();

        potencia(entrada1, entrada2);
        scan.close();
    }

    public static void potencia(int entrada1, int entrada2){
        int resultado= 0;
        for(int i=1; i <= entrada2; i++){
            resultado = resultado + entrada1 * entrada2; 
        }
        System.out.println(entrada1 + " Elevado a " + entrada2 + " = " + resultado);
    }
    
}
