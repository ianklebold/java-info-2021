package ContenedorEje4;
import ContenedorEje4.Alumnos;
import java.util.ArrayList;
import java.util.List;

public class Cursos {
    public String nombreCurso;
    
    public String aulaCurso;
    public String nombreProfesor;

    public Cursos(String nombreCurso, String aulaCurso, String nombreProfesor){
        this.nombreCurso = nombreCurso;
        this.aulaCurso = aulaCurso;
        this.nombreProfesor = nombreProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getAulaCurso() {
        return aulaCurso;
    }

    public void setAulaCurso(String aulaCurso) {
        this.aulaCurso = aulaCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void mostrarCursosDisponibles(ArrayList cursos){
        System.out.println("Listado de cursos");
        System.out.println(" ");
        for(int i=0; i < cursos.size(); i++){
            System.out.println(i +" "+ ((Cursos) cursos.get(i)).getNombreCurso());
        }
    }

    public void particionarCursos(ArrayList cursos, ArrayList alumnos){
        List curso1 = new ArrayList();
        List curso2 = new ArrayList();
        List curso3 = new ArrayList();

        
        curso1 =  alumnos.subList(0, 4);
        curso2 =  alumnos.subList(4, 8);
        curso3 =  alumnos.subList(8, 12);

        mostrarCurso1(curso1);
        mostrarCurso2(curso2);
        mostrarCurso3(curso3);
    }

    public void mostrarCurso1(List curso1){
        System.out.println("Curso 1,  cantidad alumnos : " + curso1.size());
        System.out.println(" ");
        for(int j=0; j<curso1.size(); j++){
            System.out.println(((Alumnos) curso1.get(j)).getnombreAlumno()
            + " " + ((Alumnos) curso1.get(j)).getapellidoAlumno()
            );

        }
    }

    public void mostrarCurso2(List curso2){
        System.out.println("Curso 2, cantidad de alumnos : " + curso2.size());
        System.out.println(" ");
        for(int j=0; j<curso2.size(); j++){
            System.out.println(((Alumnos) curso2.get(j)).getnombreAlumno()
            + " " + ((Alumnos) curso2.get(j)).getapellidoAlumno()
            );
        }
    }

    public void mostrarCurso3(List curso3){
        System.out.println("Curso 3,  cantidad alumnos : " + curso3.size());
        System.out.println(" ");
        for(int j=0; j<curso3.size(); j++){
            System.out.println(((Alumnos) curso3.get(j)).getnombreAlumno()
            + " " + ((Alumnos) curso3.get(j)).getapellidoAlumno()
            );
        }
    }


    
}
