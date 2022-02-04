package ejercicio9_poo;

import ejercicio9_poo.entidades.Matematica;
import ejercicio9_poo.servicios.ServiciosMatematica;

/*En el main se creará el objeto y se usará el Math.random para generar 
los dos números y se guardaran en el objeto con su respectivos set.*/
public class Main9 {

    public static void main(String[] args) {
        ServiciosMatematica sm = new ServiciosMatematica();
        Matematica mate = sm.crearNumeros();
                
        //devolver mayor    
        Double mayor = sm.devolverMayor(mate);
        System.out.println("El mayor es " + mayor);

        //potencia    
        sm.calcularPotencia(mate);

        //raiz
        sm.calcularRaiz(mate);
    }

}
