package ejercicio6_poo_otro;

import ejercicio6_poo_otro.entidades.Cafetera;
import java.util.Scanner;

public class Main6_otro {

    public static void main(String[] args) {
        Cafetera caf = new Cafetera();
        Scanner leer = new Scanner(System.in);
        
        caf = caf.llenarCafetera();
        
        System.out.println("Ingrese taza");
        caf.servirTaza(leer.nextInt());
        
        System.out.println(caf.getCantidadActual());
        caf.vaciarCafetera();

        System.out.println("Agregar cafe");
        caf.agregarCafe(leer.nextInt());
        System.out.println("Hay en cafetera: "+caf.getCantidadActual());
        
        System.out.println(caf);
    }
}
