package ejercicio5_poo.servicio;

import ejercicio5_poo.entidades.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {

    Scanner leer = new Scanner(System.in); //para pedir por teclado

    /*• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.*/
    public Cuenta crearCuenta() {
        Cuenta cu = new Cuenta();

        System.out.println("Ingrese nro de cuenta");
        cu.setNumeroCuenta(leer.nextInt());

        System.out.println("Ingrese nro de dni");
        cu.setDni(leer.nextLong());

        System.out.println("Ingrese saldo actual");
        cu.setSaldoActual(leer.nextDouble());
        return cu;
    }

    /*• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.*/
    public void ingresarDinero(double ingreso,Cuenta cu) {
        cu.setSaldoActual(ingreso);
    }

    /*• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.*/
    public void retirarDinero(Double retiro,Cuenta cu) {
        if (cu.getSaldoActual() <= retiro) {
            cu.setSaldoActual(0.0);
        } else {
            cu.setSaldoActual(cu.getSaldoActual()-retiro);
            System.out.println("Extracción exitosa");
        }
    }

    /*• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.*/
    public void extraccionRapida(Double retiro,Cuenta cu) {

        Double porcentaje = cu.getSaldoActual() * 0.20;

        if (retiro <= porcentaje) {
            retirarDinero(retiro,cu);//llamo al metodo de extraccion

        } else {
            System.out.println("No puede retirar dinero");
        }
    }

    /*• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.*/
    public void consultarSaldo(String opcion,Cuenta cu) {
        opcion = opcion.toUpperCase();
        if (opcion.equals("S")) {
            System.out.println("El saldo disponible es: " + cu.getSaldoActual());
        } else {
            System.out.println("---");
        }
    }

    /*• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
    public void consultarDatos(String opcion, Cuenta cu) {

        opcion = opcion.toUpperCase();

        if (opcion.equals("S")) {
            System.out.println("Sus datos son:" + cu);
        } else {
            System.out.println("---");
        }
    }
}
