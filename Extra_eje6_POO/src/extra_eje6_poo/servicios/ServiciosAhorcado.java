package extra_eje6_poo.servicios;

/*• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido en contradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.*/
import extra_eje6_poo.entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class ServiciosAhorcado {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {

        Ahorcado j = new Ahorcado(); //creo un objeto d tipo Ahorcado

        System.out.println("Vamos a cargar el juego!\nIngrese palabra a buscar");
        String palabra = leer.next();
        palabra = palabra.toUpperCase(); //pongo en mayusculas

        int largo = palabra.length();

        System.out.println("Ingrese cantidad de jugadas máximas: ");
        j.setJugadasMaximas(leer.nextInt());

        j.setCantEncontradas(0); //inicia en cero la cant de encontradas

        String[] vec = new String[largo];

        for (int i = 0; i < largo; i++) {
            if (i < largo) {
                vec[i] = palabra.substring(i, i + 1);
            }
        }
        j.setVecPalabraBuscar(vec); //paso entre vectores cada letra

        //        System.out.println("Palabra guardada: ");
        //        for (int i = 0; i < largo; i++) {
        //            System.out.print(j.getVecPalabraBuscar()[i]);
        //        }
        return j;
    }

    public void longitud(Ahorcado j) {
        System.out.println("Longitud de palabra a buscar: " + j.getVecPalabraBuscar().length);
    }

    public Boolean buscar(String letra, Ahorcado j) {

        int repetidas = 0;

        letra = letra.toUpperCase();

        for (int i = 0; i < j.getVecPalabraBuscar().length; i++) {
            if (j.getVecPalabraBuscar()[i].equals(letra)) {
                repetidas++; //cuantas repetidas
            }
        }
        //cuantas en total
        j.setCantEncontradas(repetidas + j.getCantEncontradas());

        if (repetidas > 0) {
            System.out.println("La letra: " + letra + ", está " + repetidas + " veces en la palabra");
            return true;

        } else {
            System.out.println("La letra: " + letra + ",NO está en la palabra");
            return false;
        }
    }

//    /*• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//    busque una letra que no esté, se le restará uno a sus oportunidades.*/
    public Boolean encontradas(String letra, Ahorcado j, Boolean esta) {
        int faltan = 0;

        faltan = j.getVecPalabraBuscar().length - j.getCantEncontradas();

        System.out.println("Cantidad de letras encontradas: " + j.getCantEncontradas());
        System.out.println("Falta encontrar " + faltan + " letras.");

        return esta;
    }

    /*• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.*/
    public void intentos(Ahorcado j, Boolean esta) {
        int intentos = 0;

        if (esta == false) {
            intentos++;
        }

        j.setJugadasMaximas(j.getJugadasMaximas() - intentos);
        System.out.println("Le quedan " + j.getJugadasMaximas() + " intentos.");
    }

    /*• Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main.*/
    public void jugar(Ahorcado j) {
        Boolean fin = false;
        int largo = j.getVecPalabraBuscar().length;

        longitud(j); //muestra largo de palabra
        System.out.println("---------");

        do {
            System.out.println("Ingrese letra: ");
            String letra = leer.next();

            Boolean esta = buscar(letra, j);

            System.out.println("---------");

            encontradas(letra, j, esta);

            System.out.println("---------");

            intentos(j, esta);
            System.out.println("---------");

            if (j.getCantEncontradas() == largo) {
                System.out.println("Felicidades! Encontró la palabra: ");
                System.out.println(Arrays.toString(j.getVecPalabraBuscar()));
                fin = true;
            } else {
                fin = false;
            }
        } while ((j.getJugadasMaximas() > 0) && (fin == false));

        if ((j.getCantEncontradas() < largo)) {
            System.out.println("P E R D I S T E !!!");
        } else {
            System.out.println("G A N A S T E !!! ");
        }
    }
}
