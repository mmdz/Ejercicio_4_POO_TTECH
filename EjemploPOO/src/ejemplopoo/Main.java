package ejemplopoo;

import ejemplopoo.Entidades.Perro;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creamos un objeto de tipo perro con constructor vacio
        Perro p = new Perro();
        Perro p2 = new Perro();
        //llamar al metodo de la clase Perro para instanciar un objeto
        p = p.crearPerro();
        p2 = p2.crearPerro();
                                //le damos valor al atributo con el set que creamos en la clase Perro
                        //        System.out.println("Ingrese el nombre del perro");
                        //        p.setNombre(sc.next());
                        //        System.out.println("Ingrese el apodo del perro");
                        //        p.setApodo(sc.next());
                        //        System.out.println("Ingrese la edad del perro");
                        //        p.setEdad(sc.nextInt());


        //creamos un objeto de tipo perro con constructor parametrizado
        Perro p1 = new Perro("simba", "gordo", 9);
        //imprimimos los objetos
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);
    }

}
