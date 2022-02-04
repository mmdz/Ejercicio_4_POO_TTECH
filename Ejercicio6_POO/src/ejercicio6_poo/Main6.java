package ejercicio6_poo;

import ejercicio6_poo.entidades.Cafetera; //importo la clase para poder 
import ejercicio6_poo.servicio.ServicioCafetera;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        //creo el objeto
        ServicioCafetera sc = new ServicioCafetera();
        
        //instancio cafetera
        Cafetera cafeTomado = sc.llenarCafetera();
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese tamaño de taza"); //alcanza
        sc.servirTaza(leer.nextInt(),cafeTomado); //le paso x parametro tamaño

        //cambio cafe        
        sc.vaciarCafetera(cafeTomado);

        //agregar cafe
        System.out.println("Cuánto café desea agregar a la cafetera?");
        sc.agregarCafe(leer.nextInt(),cafeTomado);

        System.out.println("Ingrese tamaño de taza");
        sc.servirTaza(leer.nextInt(),cafeTomado); //le paso x parametro tamaño

    }

}
