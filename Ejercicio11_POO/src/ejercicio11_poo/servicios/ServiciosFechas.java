package ejercicio11_poo.servicios;

import ejercicio11_poo.entidades.Fechas;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*Pongamos de lado un momento el concepto de POO, ahora vamos a
trabajar solo con la clase Date. En este ejercicio deberemos
instanciar en el main, una fecha usando la clase Date, para esto 
vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. 
Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar 
cuantos años hay entre esa fecha y la fecha actual, que se puede 
conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();*/
public class ServiciosFechas {

    public Fechas crearFecha() {
        Date fechaIngresada;
       
        Scanner leer = new Scanner(System.in);
        Fechas f = new Fechas();
        
        System.out.println("Ingrese fecha deseada");
        System.out.println("Dia: ");
        f.setDia(leer.nextInt());

        System.out.println("Mes: ");
        f.setMes(leer.nextInt());

        System.out.println("anio: ");
        f.setAnio(leer.nextInt());
        
        f.setFechaIngresada(new Date(f.getAnio()-1900,f.getMes()-1,f.getDia()));
 
        return f;

    }

    public void calcularFecha(Fechas f){

     Date fechaActual = new Date(); //vacio devuelve la fecha actual

    //formateo fecha actual
    SimpleDateFormat aux = new SimpleDateFormat("dd/MM/yyyy");
    String FechaTuneadaAct = aux.format(fechaActual);

    ///formateo fecha ingresada
    SimpleDateFormat aux2 = new SimpleDateFormat("dd/MM/yyyy");
    String FechaTuneada = aux2.format(f.getFechaIngresada());
    //muestro fechas para verificar 
    System.out.println ("Fecha ingresada: " + FechaTuneada);
    System.out.println ("La fecha actual: " + FechaTuneadaAct );

    int aniosDiferencia = (fechaActual.getYear() + 1900) - f.getAnio();

    System.out.println("Años de diferencia: " + aniosDiferencia);
    }
}