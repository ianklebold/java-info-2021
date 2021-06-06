package ContenedorEje4;



public class Alumnos{
    public String nombreAlumno;
    public String apellidoAlumno;
    public String edad;

    public Alumnos(String nombreAlumno, String apellidoAlumno, String edad){
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.edad = edad;

    }

    public void setnombreAlumno(String nombreAlumno){
        this.nombreAlumno = nombreAlumno;
    }

    public void setapellidoAlumno(String apellidoAlumno){
        this.apellidoAlumno = apellidoAlumno;
    }

    public void setedadAlumno(String edad){
        this.edad = edad;
    }

    public String getnombreAlumno(){
        return nombreAlumno;
    }

    public String getapellidoAlumno(){
        return apellidoAlumno;
    }

    public String getedadAlumno(){
        return edad;
    }
    
}