package ejercicio8_poo.servicios;

import ejercicio8_poo.entidades.Cadena;
import java.util.Scanner;

public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

/////////metodos propios///////////////////////////////////////////
    public Cadena crearCadena() {
        Cadena miCadena = new Cadena();

        System.out.println("Ingrese una frase: ");
        miCadena.setFrase(leer.nextLine()); //guardo la frase

        miCadena.setLongitud(miCadena.getFrase().length()); //guardo longitud de cadena

        return miCadena;
    }

    /*• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.*/
    public void mostrarVocales(Cadena miCadena) {

        int cantidad = 0;
        String letra;

        for (int i = 0; i < miCadena.getLongitud(); i++) {

            letra = miCadena.getFrase().substring(i, i + 1);
            letra = letra.toUpperCase();
            // System.out.println(letra);

            if (letra.equals("A") || letra.equals("E") || letra.equals("I")
                    || letra.equals("O") || letra.equals("U")) {
                cantidad++;
            }
        }
        System.out.println("Cantidad de vocales " + cantidad);
    }

    /*• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    public void invertirFrase(Cadena miCadena) {
        System.out.print("Frase invertida: ");
        for (int i = (miCadena.getLongitud() - 1); i >= 0; i--) {
            System.out.print("" + (miCadena.getFrase().charAt(i)));
        }
    }

    /*• Método vecesRepetido(String letra), recibirá un carácter ingresado por el 
    usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    public void vecesRepetido(String letraRepetida, Cadena miCadena) {
        String letra;
        int cantidad = 0;
        for (int i = 0; i < miCadena.getLongitud(); i++) {

            letra = miCadena.getFrase().substring(i, i + 1);
            letra = letra.toUpperCase();
            letraRepetida = letraRepetida.toUpperCase();
            // System.out.println(letra);

            if (letra.equals(letraRepetida)) {
                cantidad++;
            }
        }
        if (cantidad > 0) {
            System.out.println("'" + letraRepetida + "' se repite " + cantidad + " veces");
        } else {
            System.out.println("No hay repeticiones");
        }
    }

    /*• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(String frase2, Cadena miCadena) {
        if (miCadena.getLongitud() == frase2.length()) {
            System.out.println("Longitudes iguales");
        } else {
            System.out.println("Diferente longitud");
        }
    }

    /*• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public void unirFrases(String frase2, Cadena miCadena) {
        System.out.println("La nueva frase: " + miCadena.getFrase().concat(frase2));
    }

    /*• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.*/
    public void reemplazar(String reemplazo, Cadena miCadena) {
        String letra;
        int cont = 0;

        for (int i = 0; i < miCadena.getLongitud(); i++) {
            miCadena.setFrase(miCadena.getFrase().toUpperCase());
            letra = miCadena.getFrase().substring(i, i + 1);

            if (letra.equals("A")) {
                cont++;
                System.out.println("entro");
                miCadena.setFrase(miCadena.getFrase().replace(letra, reemplazo));
            }
        }

        if (cont == 0) {
            System.out.println("No hay letra A");
        } else {
            System.out.println("Frase resultante: " + miCadena.getFrase());
        }
    }

    /*• Método contiene(String letra), deberá comprobar si la frase contiene una 
    letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
    public Boolean contiene(String letra2, Cadena miCadena) {
        
        letra2.equalsIgnoreCase(letra2);//ignora Mayus-Minus
                
       // System.out.println("frase: "+miCadena.getFrase());
        return miCadena.getFrase().contains(letra2);
    }

    //menu de opciones
    public void menu(Cadena miCadena) {
        //implemento metodos usando un menu de opciones
        Boolean salir = false;
        do {
            System.out.println("Ingrese una opción: ");
            System.out.println("1.Mostrar cantidad de vocales\n2.Invertir Frase \n3.Buscar cuantas veces se repite caracter\n4.Comparar longitudes");
            System.out.println("5.Unir frases\n6.Reemplazar caracter\n7.Encontrar caracter\n8.Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    mostrarVocales(miCadena);
                    System.out.println("------------");
                    break;
                case 2:
                    invertirFrase(miCadena);
                    System.out.println("\n------------");
                    break;
                case 3:
                    System.out.println("Ingrese caracter repetido");
                    vecesRepetido(leer.next(), miCadena);
                    System.out.println("------------");
                    break;
                case 4:
                    System.out.println("Ingrese otra frase");
                    compararLongitud(leer.next(), miCadena);
                    System.out.println("------------");
                    break;
                case 5:
                    System.out.println("Ingrese frase para unir");
                    unirFrases(leer.next(), miCadena);
                    System.out.println("------------");
                    break;
                case 6:
                    System.out.println("Ingrese caracter de reemplazo");
                    reemplazar(leer.next(), miCadena);
                    System.out.println("------------");
                    break;
                case 7:
                   // Boolean esta = false;
                    System.out.println("Ingrese caracter a buscar");
                   Boolean esta = contiene(leer.next(),miCadena);
                    System.out.println("esta o no"+esta);
                    if (esta==true) {
                        System.out.println("El caracter está en la frase");
                    } else {
                        System.out.println("El caracter NO está en la frase");
                    }

                    System.out.println("------------");
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

        } while (salir == false);
    }

}//fin de clase
