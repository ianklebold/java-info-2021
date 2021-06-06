import java.util.Scanner;

public class ejeCompl9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese porfavor la cadena de texto:");
        String cadena = scan.nextLine();

        System.out.println("Ingrese porfavor un caracter a analizar:");
        String letra = scan.nextLine();
        scan.close();

        cantLetra(cadena, letra);


    }

    public static void cantLetra(String cadena, String letra){
        char caracter = letra.charAt(0); //Convertimos el string a caracter
        int AsciiValue = (int) caracter;    
        int contador = 0;
        for(int i=1; i < cadena.length(); i++){

            if(AsciiValue == ((int)(cadena.charAt(i)))) {
                contador = contador +1;
            }
        }

        System.out.println(cadena);
        System.out.println(letra);
        System.out.println("Se encontraron : "+contador+" ocurrencias");

    }
}
