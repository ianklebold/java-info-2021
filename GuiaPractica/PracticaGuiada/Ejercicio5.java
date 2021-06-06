package PracticaGuiada;
/*
Desarrollar un programa que dado un número
 entero ingresado, 
nos retorne los valores de ese 
número multiplicado 
por 1, 2, 3, … y 10.


*/
public class Ejercicio5 {
    public static void eje5(int entrada){

        //La clase Scanner permite crear un objeto scan, la clase permite que el objeto tengra como entrada
        //Lo que reciba el sistema
        //Basicamente le decimos que la variable será del tipo de la clase Scanner

        
        //Una vez implementada la clase puedo crear una variable del tipo entero (tipo de entrada)
        //Que me permita ejecutar el metodo de la clase Scanner

        for(int i=1; i<= 10; i++){
            //Defino la variable que va a iterar
            //Defino el extremo limite 
            //Defino como se dará la ejecucion del for

            System.out.println("El numero : " + entrada +"*"+i+" = "+ entrada*i);
        }
    }    
}
