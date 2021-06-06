package ContenedorEje3;

import java.util.ArrayList;
import java.util.Collections;

public class BarajaFrancesa{
    private String nombreBaraja; 

    public BarajaFrancesa(){  //Asi se hace un constructor, obtiene el nombre por defecto
        this.nombreBaraja = "Baraja Francesa";
    }

    public void setNombre(String nombreBaraja){
        this.nombreBaraja = nombreBaraja;
    }

    public String getNombre(){
        return nombreBaraja;
    }

    public ArrayList cargarBaraja(){

        ArrayList lista = new ArrayList(12);
        int cont = 2;
        for(int i=0; i < 9; i++){
            lista.add(cont+i); // Añadimos valores del 2 al 10 2, 3, 4, 5, 6, 7, 8, 9, 10
        }
        lista.add('J');
        lista.add('Q');
        lista.add('K');
        lista.add('A');

    
        return lista; //Devuelve la baraja de cartas en una lista
    }

    public void getBaraja(ArrayList lista){
        for(int i=0; i < lista.size(); i++){
            System.out.print(lista.get(i));
            System.out.print(" - ");
        }

    }

    public void getBarajaRev(ArrayList lista){
        System.out.println(" ");
        for(int i=12; i>-1; i--){
            System.out.print(lista.get(i));
            System.out.print(" - ");
        }
    }

    public void desordenarBaraja(ArrayList lista){
       Collections.shuffle(lista);
       System.out.println(" ");
       for(int i=0; i < lista.size(); i++){
        System.out.print(lista.get(i));
        System.out.print(" - ");
        }
    }

    public ArrayList ordenarBaraja(ArrayList lista){
        System.out.println(" ");
        lista = new ArrayList(12);
        int cont = 2;
        for(int i=0; i < 9; i++){
            lista.add(cont+i); // Añadimos valores del 2 al 10 2, 3, 4, 5, 6, 7, 8, 9, 10
        }
        lista.add('J');
        lista.add('Q');
        lista.add('K');
        lista.add('A');

        return lista;
    }   
    



}