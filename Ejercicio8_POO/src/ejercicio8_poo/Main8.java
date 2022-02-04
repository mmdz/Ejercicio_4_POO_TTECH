package ejercicio8_poo;

import ejercicio8_poo.entidades.Cadena;
import ejercicio8_poo.servicios.ServicioCadena;

/*En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un
espacio en blanco y a través de los métodos set, se guardará la frase y
la longitud de manera automática según la longitud de la frase ingresada.
Implementar los metodos de Cadena*/
public class Main8 {

    public static void main(String[] args) {

        //creacion objeto    
        ServicioCadena sc = new ServicioCadena();
        Cadena frase1 = sc.crearCadena();
        
        System.out.println("------------");
        sc.menu(frase1);

    }//fin Main

}//fin clase main6
