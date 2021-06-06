package ContenedorEje5;
public class Empleado {
    
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private int horasTrabajadas[] = {0, 0, 0, 0, 0};
    private int codigoEmpleado;

    
    
    public Empleado(int codigoEmpleado, String nombreEmpleado, 
                   String apellidoEmpleado, int horasTrabajadas[]) {

        this.setCodigoEmpleado(codigoEmpleado);
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    //Set y Reset
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    //Static nos indica que podemos implementar el metodo sin crear un objeto de la clase.
    
    public int[] getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas[]) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }
    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void sueldoPorHoras(int horasTrabajadas[], int valorPorHora[]){
        int total = 0;
        System.out.println("Total del empleado : " 
        + this.nombreEmpleado + " " + this.apellidoEmpleado);
        System.out.println(" ");
        for(int i=0; i < this.horasTrabajadas.length; i++){

            System.out.print(this.horasTrabajadas[i] * valorPorHora[i] +" - ");
            total = total + this.horasTrabajadas[i] * valorPorHora[i];

        }
        System.out.println(" ");
        System.out.println("Total : " + total);

    }



}
