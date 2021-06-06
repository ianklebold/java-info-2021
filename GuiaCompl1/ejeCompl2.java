import java.util.*;

public class ejeCompl2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese porfavor el primer numero");
        int numero1 = scan.nextInt();


        System.out.println("Ingrese porfavor el segundo numero");
        int numero2 = scan.nextInt();
        
        suma(numero1, numero2);
        resta(numero1, numero2);
        multiplicacion(numero1, numero2);
        division(numero1, numero2);
        resto(numero1, numero2);

        scan.close();
    }

    public static void suma(int entero1, int entero2){
        System.out.println(String.valueOf(entero1) + " + " + String.valueOf(entero2)+" = " + (entero1+entero2));
    }

    public static void resta(int entero1, int entero2){
        System.out.println(String.valueOf(entero1) + " - " + String.valueOf(entero2)+" = " + (entero1-entero2));
    }

    public static void multiplicacion(int entero1, int entero2){
        System.out.println(String.valueOf(entero1) + " * " + String.valueOf(entero2)+" = " + (entero1*entero2));
    }

    public static void division(int entero1, int entero2){
        System.out.println(String.valueOf(entero1) + " / " + String.valueOf(entero2)+" = " + (entero1/entero2));
    }

    public static void resto(int entero1, int entero2){
        System.out.println(String.valueOf(entero1) + " % " + String.valueOf(entero2)+" = " + (entero1%entero2));

    }


}
