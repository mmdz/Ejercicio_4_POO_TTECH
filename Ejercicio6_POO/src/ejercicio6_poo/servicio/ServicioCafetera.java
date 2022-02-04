package ejercicio6_poo.servicio;

import ejercicio6_poo.entidades.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {

    Scanner leer = new Scanner(System.in);

    /*Método llenarCafetera(): hace que la cantidad actual sea igual 
    a la capacidad máxima.*/
    public Cafetera llenarCafetera() {
        Cafetera cafe = new Cafetera();
        System.out.println("Ingrese capacidad máxima: ");
        cafe.setCapacidadMaxima( leer.nextInt());
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        return cafe;
    }

    /*• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
    Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
    El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza.*/
    public void servirTaza(Integer tamanioTaza,Cafetera cafe) {
        double porcentaje;

        if (cafe.getCantidadActual() == tamanioTaza) {
            System.out.println("Taza llena");// = 10-10-> llena
            vaciarCafetera(cafe); //cantidad queda en cero, llamo a otro metodo

        } else {
            if (cafe.getCantidadActual() > tamanioTaza) { // 3 = 10 - 7
                System.out.println("Taza llena");
                cafe.setCantidadActual(-tamanioTaza); //resto lo q servi
            } else {
                System.out.println("No alcanza");
                porcentaje = (double) (cafe.getCantidadActual()*100) / tamanioTaza;
                vaciarCafetera(cafe); //sirvo lo q hay

                System.out.println("Se sirvió " + porcentaje + "% de la taza");
            }
        }
    }


    /*• Método vaciarCafetera(): pone la cantidad de café actual en cero.*/
    public void vaciarCafetera(Cafetera cafe) {
        cafe.setCantidadActual(0);
    }

    /*• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    recibe y se añade a la cafetera la cantidad de café indicada*/
    public void agregarCafe(Integer cantidad,Cafetera cafe) {
        cafe.setCantidadActual(-cantidad);
    }

}
