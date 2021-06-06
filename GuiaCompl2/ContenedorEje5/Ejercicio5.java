package ContenedorEje5;
import java.util.Scanner;
import ContenedorEje5.Empleado;

public class Ejercicio5 {

    public static void main(String[] args) {
        int valorPorHora[] = {0, 0, 0, 0, 0};
        int valor = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese valores por hora segun los dias : ");
        System.out.println(" "); 

        System.out.println("Para Lunes : ");
        valor = scan.nextInt();
        valorPorHora[0] = valor;

        System.out.println("Para Martes : ");
        valor = scan.nextInt();
        valorPorHora[1] = valor;

        System.out.println("Para Miercoles : ");
        valor = scan.nextInt();
        valorPorHora[2] = valor;

        System.out.println("Para Jueves : ");
        valor = scan.nextInt();
        valorPorHora[3] = valor;

        System.out.println("Para Viernes : ");
        valor = scan.nextInt();
        valorPorHora[4] = valor;

        scan.close();

        // Array de empleados
        Empleado[] arrE = new Empleado[4]; //Aqui cargo la cantidad de objetos
        
        int valorE[] = {2,3,4,5,6};
        arrE[0] = new Empleado(1,"Ian", "Fernandez", valorE);
        int valorE1[] = {2,8,4,5,6};
        arrE[1] = new Empleado(2,"Juan", "Fernandez", valorE1);
        int valorE2[] = {2,3,8,8,10};
        arrE[2] = new Empleado(3,"John", "Fernandez", valorE2);
        int valorE3[] = {5,5,6,5,6};
        arrE[3] = new Empleado(4,"Johnny", "Fernandez", valorE3);
        

        arrE[0].sueldoPorHoras(arrE[0].getHorasTrabajadas(), valorPorHora);
        arrE[1].sueldoPorHoras(arrE[1].getHorasTrabajadas(), valorPorHora);
        arrE[2].sueldoPorHoras(arrE[2].getHorasTrabajadas(), valorPorHora);
        arrE[3].sueldoPorHoras(arrE[3].getHorasTrabajadas(), valorPorHora);

    }
    
}
