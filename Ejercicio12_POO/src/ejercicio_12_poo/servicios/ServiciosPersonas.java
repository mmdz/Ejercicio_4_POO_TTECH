package ejercicio_12_poo.servicios;

import ejercicio12_poo.entidades.Personas;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
public class ServiciosPersonas {

    Scanner leer = new Scanner(System.in);
   
    public Personas crearPersona() {
    Personas p = new Personas();

        System.out.println("Ingrese nombre");
        p.setNombre(leer.next());

        System.out.println("Ingrese fecha de nacimiento");
        System.out.println("Dia: ");
        p.setDia(leer.nextInt());
        System.out.println("Mes: ");
        p.setMes(leer.nextInt());
        System.out.println("anio: ");
        p.setAnio(leer.nextInt());

        p.setFechaNacimiento(new Date(p.getAnio() - 1900, p.getMes() - 1, p.getDia()));

        SimpleDateFormat aux = new SimpleDateFormat("dd/MM/yyyy");
        String FechaTuneada = aux.format(p.getFechaNacimiento());
        System.out.println("FechaNac :" + FechaTuneada);

        return p;
    }

    public void calcularEdad(Personas p) {
        
        Date fechaActual = new Date();

        System.out.println("Fecha actual");

        //lo convierte a este formato ddmmaaaa
        SimpleDateFormat aux = new SimpleDateFormat("dd/MM/yyyy");
        String FechaTuneadaAct = aux.format(fechaActual);
        System.out.println("Fecha actual :" + FechaTuneadaAct);


        p.setEdad((fechaActual.getYear() + 1900) - p.getAnio());
        System.out.println("Edad: " + p.getEdad());
        
    }    
    
    public Boolean menorQue(int edad2, Personas p){
        return edad2 < p.getEdad();  
    }
    
    public void mostrarPersona(Personas p){
        System.out.println("Datos de la persona: \n"+p);
    }

}
