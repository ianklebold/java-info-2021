package ContenedorEje6;
import java.util.Enumeration;
import java.util.Hashtable;

import ContenedorEje6.Empleado;

public class Ejercicio6 {
    public static void main(String[] args) {
        Hashtable <Integer, Empleado> empleados = new Hashtable<Integer, Empleado>();

         // instancio varios empleados
        int horasDeTrabajo[] = {8,6,6,5,6};
        int valorDeTrabajo[] = {10,13,7,9,8};

        Empleado e1 = new Empleado("Fernandez Ian", 41840491, horasDeTrabajo, valorDeTrabajo);
        empleados.put(e1.getDni(), e1);

        int horasDeTrabajo2[] = {8,5,6,5,6};
        int valorDeTrabajo2[] = {6,6,3,1,6};
        Empleado e2 = new Empleado("Fernandez John", 51232123, horasDeTrabajo2, valorDeTrabajo2);
        empleados.put(e2.getDni(), e2);

        int horasDeTrabajo3[] = {8,8,4,5,6};
        int valorDeTrabajo3[] = {10,5,6,5,6};
        Empleado e3 = new Empleado("Fernandez Johnny", 42780981, horasDeTrabajo3, valorDeTrabajo3);
        empleados.put(e3.getDni(), e3);

        Enumeration<Integer> claves = empleados.keys();

        e1.sueldoPorHoras(empleados, claves);

    }
}
