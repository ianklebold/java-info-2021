import java.util.Scanner;

public class ejeCompl8 {
    private String nombreApellido;
    private String edad;
    private String direccion;
    private String ciudad;


    // Estos son los setters
    // Los setters por lo general son publicos

    public void setNombreApellido(String nombreApellido){
        this.nombreApellido = nombreApellido;
    }

    public void setEdad(String edad){
        this.edad = edad;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }


    public String getNombreApellido(){
        return nombreApellido;
    }

    

    public String getCiudad(){
        return ciudad;
    }

    public String getEdad(){
        return edad;
    }

    public String getDireccion(){
        return direccion;
    }

    public static void main(String[] args) {
        System.out.print("Ingresaremos los datos para crear una persona : ");
        ejeCompl8 persona = new ejeCompl8();    

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese porfavor su nombre y apellido");
        String entrada = scan.nextLine();
        persona.setNombreApellido(entrada);

        System.out.println("Ingrese porfavor su ciudad");
        entrada = scan.nextLine();
        persona.setCiudad(entrada);

        System.out.println("Ingrese porfavor su direccion");
        entrada = scan.nextLine();
        persona.setDireccion(entrada);

        

        System.out.println("Ingrese porfavor su edad");
        entrada = scan.nextLine();
        persona.setEdad(entrada);

        scan.close();
        

        System.out.println("Datos de la persona creada");

        System.out.println(persona.getNombreApellido());
        System.out.println(persona.getEdad());
        System.out.println(persona.getDireccion());
        System.out.println(persona.getCiudad());
        
    }


}
