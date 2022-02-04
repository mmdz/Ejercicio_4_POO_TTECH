package extra_eje4_poo.servicios;

import extra_eje4_poo.entidades.NIF;
import java.util.Scanner;

/*En servicios deberian estar los metodos y en entidades la estructura de la clase NIF*/

public class ServiciosNIF {

    Scanner leer = new Scanner(System.in);
    //NIF nif  = new NIF();//mejor lo creo adentro
    
        //    public NIF cargarCaracteres() {
        //                    
        //        String abcedario = "TRWAGMYFPDXBNJZSQVHLCKE";
        //        //String vec = new 
        //        String[] vec = new String[23];
        //        for (int i = 0; i < 23; i++) {
        //            vec[i] = abcedario.substring(i, i + 1);
        //            nif.setVector(vec);
        //               System.out.println("letra: "+i+" "+nif.getVector());
        //        }
        //        return nif;
        //    }

    public NIF crearNIF() {
        
        NIF nif  = new NIF();
        
        int resultado;
        
        System.out.println("Ingrese dni: ");
        nif.setDNI(leer.nextLong());

        resultado = (int) nif.getDNI() % 23;

        if (resultado > 0 && resultado < 22) {
                nif.setLetra(nif.getVector()[resultado]); //guardo la letra segun posicion
                System.out.println("en vector" + nif.getVector()[resultado]);
            
        } else {
            System.out.println("Valor inválido");
            // resultado = -1;
        }
        return nif;
    }

    /*• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).*/
    public void mostrar(NIF nif) {
        System.out.println("El NIF es: " + nif.getDNI() + "-" + nif.getLetra());
    }

}
