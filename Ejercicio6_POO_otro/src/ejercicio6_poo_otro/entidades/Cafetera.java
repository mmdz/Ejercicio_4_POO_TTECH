package ejercicio6_poo_otro.entidades;

import java.util.Scanner;

public class Cafetera {
//atributos
    private Integer capacidadMaxima;
    private Integer cantidadActual;
//constructores
    public Cafetera() {
    }

    public Cafetera(Integer capacidadMaxima, Integer cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
//getter y setter
    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Integer getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(Integer cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

    //• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
    //máxima.

    public Cafetera llenarCafetera() {
        
        Cafetera caf = new Cafetera();

        System.out.println("Ingrese cantidad maxima");
        Scanner leer = new Scanner(System.in);
        
        caf.setCapacidadMaxima(leer.nextInt());
        caf.setCantidadActual(caf.getCapacidadMaxima());
         
        return caf;

    }

    //• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
    
    public void servirTaza(int taza ) {
        double porcentaje = 0.0;
                
        if (getCantidadActual() >= taza) {
            System.out.println("Se lleno la taza");
            setCantidadActual(getCantidadActual() - taza);

        } else {
            System.out.println("No alcanza");            
            porcentaje = (getCantidadActual() * 100) / taza;            
            vaciarCafetera(); //sirvo lo q hay
            System.out.println("Se sirvió " + porcentaje + "% de la taza");
        }
    }

    //• Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera() {
        setCantidadActual(0);

    }

    //• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada
    public void agregarCafe(int cafe) {
        setCantidadActual(cantidadActual + cafe);
    }
}
