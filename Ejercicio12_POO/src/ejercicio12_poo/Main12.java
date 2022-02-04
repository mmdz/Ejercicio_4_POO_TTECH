package ejercicio12_poo;

import ejercicio12_poo.entidades.Personas;
import ejercicio_12_poo.servicios.ServiciosPersonas;
import java.util.Scanner;


public class Main12 {

    public static void main(String[] args) {
        //llamo a la clase servicios personas        
        ServiciosPersonas servPersona = new ServiciosPersonas();
        Scanner leer = new Scanner(System.in);
                        
        Personas p = servPersona.crearPersona();
        servPersona.calcularEdad(p);  
        
        System.out.println("Ingrese edad nueva");
        Boolean esMenor = servPersona.menorQue(leer.nextInt(),p);
        System.out.println("Es menor que la persona 1: "+esMenor);
        servPersona.mostrarPersona(p);
        
    }

}
