import java.util.Scanner;

public class ejeCompl7 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la cadena de texto : ");
        String cadena = scan.nextLine();

        todoAmayuscula(cadena);
        scan.close();
        

        
    }

    public static void todoAmayuscula(String cadena){
        int entero = cadena.length(); //Conozco la longitud de la cadena
        StringBuilder cadenaNueva = new StringBuilder(); //Es un constructor de strings, lo construye a partir de caracteres
        char letra;

        for (int i=0; i< entero; i++ ){
            letra = cadena.charAt(i); //Ingresa a una posicion de la cadena y nos devuelve un char
            
            if((((int) letra >= 97) && ((int) letra <= 122) )){ //Si es minuscula lo convierte a mayuscula
                    int AsciiValue = ((int) letra) - 32;
                    letra = (char) AsciiValue;
                    
            }
            cadenaNueva.append(letra); //Caracteres especiales, mayusculas y espacios solo lo copio
        }
        cadena = cadenaNueva.toString();
        System.out.println(cadena);

        
        
    }
    
}
