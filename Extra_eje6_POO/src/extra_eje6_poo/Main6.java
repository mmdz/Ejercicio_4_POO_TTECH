package extra_eje6_poo;

import extra_eje6_poo.entidades.Ahorcado;
import extra_eje6_poo.servicios.ServiciosAhorcado;

public class Main6 {

    public static void main(String[] args) {
        
        //creacion objeto    
        ServiciosAhorcado serv = new ServiciosAhorcado();
        Ahorcado j = serv.crearJuego();//llamo al juegos
                
        System.out.println("------------");
        System.out.println("A jugar!");
        serv.jugar(j);
    }

}
