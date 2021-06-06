import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        int valor1 = 0;
        int valor2 = 0;
        
        int confValor1;
        int confValor2;
        System.out.println(" ");
        System.out.println("Ingrese porfavor dos valores");
        System.out.println(" * --> * El primer debe ser mayor a cero");
        System.out.println("El segundo debe ser mayor al primero * <-- *");
        System.out.println(" ");

        confValor1 = controlValor1(valor1);
        confValor2 = controlValor2(valor2, valor1);

        fizzBuzzFuncion(confValor1, confValor2);


        



    }

    public static void fizzBuzzFuncion(int confValor1, int confValor2){
        int tamaño = confValor2; 
        String[] resultado = new String[tamaño];
        
        for(int i=1; i < confValor2; i++){
            
            if(  i % 2 == 0 && i % 3 == 0){
                resultado[i] = "FizzBuzz";
            }else if(i % 2 == 0){
                resultado[i] = "Fizz";
            }else if(i % 3 == 0){
                resultado[i] = "Buzz";
            }else{
                resultado[i] = Integer.toString(i);
            }

        }
        System.out.println(" ");
        for(int i=1; i < resultado.length; i++){
            System.out.print(resultado[i]+ " - ");
        }

    }

    public static Integer controlValor1(int valor1){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        valor1 = scan.nextInt();

        while(valor1 <= 0 ){
            System.out.println(" ");
            System.out.println("Te dije que el primero debe ser mayor que 0");
            System.out.println(" ");
            System.out.println("Ingrese el primer numero");
            valor1 = scan.nextInt();
        }
        System.out.println("Excelente :)");
        System.out.println(" ");
        return valor1;
    }

    public static Integer controlValor2(int valor2, int valor1){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el segundo numero");
        valor2 = scan.nextInt();

        while(valor2 < valor1){
            System.out.println(" ");
            System.out.println("Te dije que el segundo debe ser mayor que el primer valor");
            System.out.println(" ");
            System.out.println("Ingrese el segundo numero");
            valor2 = scan.nextInt();
        }
        System.out.println("Vamos a Analizar esto :O");
        scan.close();
        return valor2;
    }
    

    
}
