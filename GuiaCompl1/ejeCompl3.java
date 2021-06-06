import java.util.Scanner;


public class ejeCompl3 {
    

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un valor numero para empezar la serie :");
        int numero = scan.nextInt();
        

        serie(numero);
        scan.close();

    }

    public static void serie(int numero){
        int control;
        for (int i=1; i <= numero; i++){
            control = 1;
            while (control <= i){
                System.out.print(control);
                control=control + 1;
            }
            System.out.println("");
        }
    }

    


}
