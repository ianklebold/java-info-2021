package ContenedorEje4;
import java.util.ArrayList;
import java.util.Scanner;
import ContenedorEje4.Alumnos;
import ContenedorEje4.Cursos;


public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        

        String nombreA = new String();
        String apellidoA = new String();
        String edadA = new String();

        String nombreC = new String();
        String aulaC = new String();
        String nombreP = new String();


        System.out.println("Ingresemos unos cuantos alumnos");
        System.out.println(" ");
        
        ArrayList <Alumnos> alumnos = new ArrayList <>();

        Alumnos alumno = new Alumnos("Ian", "Fernandez", "21");
        alumnos.add(alumno);
        Alumnos alumno2 = new Alumnos("Jorge", "Haddad", "21");
        alumnos.add(alumno2);
        Alumnos alumno3 = new Alumnos("Miguel", "Angel", "20");
        alumnos.add(alumno3);
        Alumnos alumno4 = new Alumnos("Alan", "Kalbermatter", "21");
        alumnos.add(alumno4);
        Alumnos alumno5 = new Alumnos("Jose", "Alegre", "21");
        alumnos.add(alumno5);
        Alumnos alumno6 = new Alumnos("Joel", "Orban", "21");
        alumnos.add(alumno6);
        Alumnos alumno7 = new Alumnos("Luciana", "Bolo", "21");
        alumnos.add(alumno7);
        Alumnos alumno8 = new Alumnos("Luciana", "Campestrini", "21");
        alumnos.add(alumno8);
        Alumnos alumno9 = new Alumnos("Mateo", "Gomez", "23");
        alumnos.add(alumno9);
        Alumnos alumno10 = new Alumnos("Kike", "Gomez", "23");
        alumnos.add(alumno10);
        Alumnos alumno11 = new Alumnos("Fede", "Pacheco", "23");
        alumnos.add(alumno11);
        Alumnos alumno12 = new Alumnos("Eddie", "Garcia", "23");
        alumnos.add(alumno12);

        System.out.println("Creemos algunos cursos :");
        System.out.println(" ");

        ArrayList <Cursos> cursos = new ArrayList <>();
        
        Cursos curso = new Cursos("Analisis 1", "Aula 2.1", "Mazzferro");
        cursos.add(curso);
        Cursos curso2 = new Cursos("Analisis 2", "Aula 2.3", "Flores");
        cursos.add(curso2);
        Cursos curso3 = new Cursos("Java", "Aula 2.5", "Eduardo");
        cursos.add(curso3);

        scan.close();

        curso.mostrarCursosDisponibles(cursos);
        System.out.println(" ");
        curso.particionarCursos(cursos, alumnos);

    }
    
}
