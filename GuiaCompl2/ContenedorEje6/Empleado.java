package ContenedorEje6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.Map;

public class Empleado {
    private String nombreYApellido; 
    private int dni;
    private int horasTrabajadas[] = {0, 0, 0, 0, 0};
    private int valorPorHora[] = {0, 0, 0, 0, 0};
    


    public Empleado(String nombreYApellido, int dni, int[] horasTrabajadas, int[] valorPorHora) {
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }
    
    public String getNombreYApellido() {
        return nombreYApellido;
    }
    public int[] getValorPorHora() {
        return valorPorHora;
    }
    public void setValorPorHora(int valorPorHora[]) {
        this.valorPorHora = valorPorHora;
    }
    public int[] getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas[]) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public Integer sueldoPorHoras(){
        int total = 0;

        for(int i=0; i < this.horasTrabajadas.length; i++){
            total = total + (this.horasTrabajadas[i] * this.valorPorHora[i]);
        }

        return total; 
    }


    public void sueldoPorHoras(Hashtable<Integer, Empleado> empleados, Enumeration<Integer> claves){
        Map<Integer, Integer> listSueldos = new HashMap<Integer, Integer>();

        /*
            obtengo una enumeracion de las clave existentes en la tabla, 
            // la recorro y por cada una accedo al elemento asociado para 
            // mostrar "clave = valor"
            String aux; Enumeration<String> keys = tabla.keys(); 
            while( keys.hasMoreElements() ) 
                { aux = keys.nextElement(); 
                System.out.println(aux+" = "+tabla.get(aux)); }
        
        */
        //El map o diccionario no es una coleccion, porque tiene un atributo clave y dato tiene una estructura distinta
        
        Object aux;
        Empleado aux2;
        int sueldoCalculado;

        while(claves.hasMoreElements()){
            
            aux = claves.nextElement();
            aux2 = (Empleado) ((Map) empleados).get(aux);
            sueldoCalculado = aux2.sueldoPorHoras();


            listSueldos.put(aux2.getDni(), sueldoCalculado);

        }


         /*
        * Para recorrerlo nos apoyaremos sobre un Iterator que será el 
        * puntero encargado en recorrer los elementos del mapa. 
        *Obtendremos un iterador sobre la estructura invocando 
        *los métodos .entrySet() e .iterator(). 
        *Usar iteradores permite separar la lógica de la clase de la lógica de la iteración. 
        *Los iteradores tienen un comportamiento similar a los enumerados.
        */

        Iterator it = listSueldos.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry objeto = (Map.Entry)it.next();
            System.out.println("DNI : "+ objeto.getKey() + " " 
                                + "Sueldo total " + objeto.getValue());
            System.out.println(" ");
        }
    }

  }
