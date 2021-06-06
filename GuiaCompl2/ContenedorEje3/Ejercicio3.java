package ContenedorEje3;
import ContenedorEje3.BarajaFrancesa;
import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList baraja1 = new ArrayList();
        BarajaFrancesa lista = new BarajaFrancesa();

        baraja1 = lista.cargarBaraja();
        
        System.out.print("Nombre de baraja : ");
        System.out.println(lista.getNombre()); //Por defecto tiene nombre de baraja francesa, pero podemos cambiarlo

        System.out.println("Mostrar baraja");
        System.out.println(" ");
        lista.getBaraja(baraja1);
        System.out.println(" ");
        System.out.println("Baraja de de reverso");
        lista.getBarajaRev(baraja1);
        System.out.println(" ");
        System.out.println("Baraja desordenada");
        lista.desordenarBaraja(baraja1);

        System.out.println(" ");
        System.out.println("Baraja ordenada");
        baraja1 = lista.ordenarBaraja(baraja1);

        System.out.println("Mostrar baraja");
        lista.getBaraja(baraja1);


    }
    
}
