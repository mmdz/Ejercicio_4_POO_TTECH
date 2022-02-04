package ejercicio4_poo;

import ejercicio4_poo.entidades.Rectangulo;
import ejercicio4_poo.servicio.Servicio;

public class Main4 {

    public static void main(String[] args) {
        Servicio sr = new Servicio();
        //creo el objeto rec
        //llamo a los metodos, lo instancio

        Rectangulo rec = sr.crearRectangulo();

        System.out.println("La superficie: " + sr.calcularSuperficie(rec));
        System.out.println("El perímetro: " + sr.calcularPerimetro(rec));
        sr.dibujarRectangulo(rec);

        //System.out.println(rec.toString());
    }

}
