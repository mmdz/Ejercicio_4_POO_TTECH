package extra_eje5_poo;

import extra_eje5_poo.servicios.ServiciosMeses;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Boolean res;
        ServiciosMeses sm = new ServiciosMeses();
        Scanner leer = new Scanner(System.in);

        sm.crearMesSecreto();

        do {
            System.out.println("Ingrese un mes: ");

            res = sm.mesSecreto(leer.next());
            if (res == false) {
                System.out.println("Vuelva a ingresar mes");
            }
        } while (!(res));

    }

}
