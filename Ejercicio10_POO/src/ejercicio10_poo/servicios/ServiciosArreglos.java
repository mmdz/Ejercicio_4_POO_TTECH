package ejercicio10_poo.servicios;

import ejercicio10_poo.entidades.Arreglos;
import java.util.Arrays;

/*en esta clase, desarrollo los metodos*/
public class ServiciosArreglos {

    Arreglos a = new Arreglos();
//inicializo array       

    public Arreglos cargarArregloA() {
        for (int i = 0; i < a.getArregloA().length; i++) {
            a.getArregloA()[i] = (double) Math.round((Math.random() * 10));
        }
        System.out.println("Arreglo A desordenado\n");

        mostrarArregloA(a.getArregloA());

        return a;
    }

    //ordeno menor
    public void ordenarArregloA() {
        Arrays.sort(a.getArregloA()); //sort ordena el vector de menor a mayor

        //        Double aux;
        //        for (int i = 0; i < a.getArregloA().length; i++) {
        //            for (int j = 0; j < a.getArregloA().length - i - 1; j++) {
        //                if (a.getArregloA()[j + 1] < a.getArregloA()[j]) {
        //                    aux = a.getArregloA()[j + 1];
        //                    a.getArregloA()[j + 1] = a.getArregloA()[j];
        //                    a.getArregloA()[j] = aux;
        //                }
        //            }
        //        }
    }

////copio en B
    //Arrays.fill(a.getArregloB(),0,10,a.getArregloA()); //para copiar vectores
    public void copiarEnB() {
        for (int i = 0; i < 20; i++) {
         
                Arrays.fill(a.getArregloB(), i, i + 1, a.getArregloA()[i]);
          
        

//            if (i < 10) {
//                a.getArregloB()[i] = a.getArregloA()[i];
//             //    a.setArregloB(Arrays.copyOf(a.getArregloA(), i));
//            }
//            if (i >= 10) {
//                a.getArregloB()[i] = 0.5;
//            }
            //System.out.println("B "+a.getArregloB()[i]);//        
        }

        Arrays.fill(a.getArregloB(), 10, 20, 0.5);

        //Arrays.toString(vec) muestra el vector completo
        System.out.println("Array B: \n" + Arrays.toString(a.getArregloB()));

    }
    //////mostrar arrays

    public void mostrarArregloA(double[] array) {
        System.out.print(" " + Arrays.toString(array));

    }

}//fin  de clase
