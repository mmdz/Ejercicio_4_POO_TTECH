package ejercicio5_poo;

import ejercicio5_poo.entidades.Cuenta;
import ejercicio5_poo.servicio.ServicioCuenta;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        ServicioCuenta sc = new ServicioCuenta();
        Cuenta cu = sc.crearCuenta();

        //depositar
        System.out.println("Ingrese cantidad a depositar:");
        sc.ingresarDinero(leer.nextDouble(),cu);

        //retirar
        System.out.println("Ingrese cantidad a retirar:");
        sc.retirarDinero(leer.nextDouble(),cu);

        //retiro Extra 
        System.out.println("Ingrese extracción rápida");
        sc.extraccionRapida(leer.nextDouble(),cu);

        //consultar saldo
        System.out.println("Desea consultar saldo? S/N");
        sc.consultarSaldo(leer.next(),cu);

        //consultar datos     
        System.out.println("Desea consultar sus datos? S/N");
        sc.consultarDatos(leer.next(),cu);
    }

}
