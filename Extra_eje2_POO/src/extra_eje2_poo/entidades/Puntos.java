package extra_eje2_poo.entidades;

import java.util.Scanner;

public class Puntos {

    private Double x1, y1, x2, y2;

    public Puntos() {/*vacio*/
    }

    public Puntos(Double x1, Double y1, Double x2, Double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Scanner leer = new Scanner(System.in);

    public void crearPuntos() {
        System.out.println("Ingrese coordenada x1: ");
        x1 = leer.nextDouble();
        System.out.println("Ingrese coordenada x2: ");
        x2 = leer.nextDouble();
        System.out.println("Ingrese coordenada y1: ");
        y1 = leer.nextDouble();
        System.out.println("Ingrese coordenada y2: ");
        y2 = leer.nextDouble();
    }

    public void calcularDistancia() {
        Double distancia;
        Double xCuadrado = Math.pow((x2-x1), 2) ;
        Double yCuadrado = Math.pow((y2-y1), 2);
        distancia = (double)(Math.sqrt(xCuadrado+yCuadrado));  //raiz{(x2-x1)2+(y2-y1)2}
        
        System.out.println("La distancia es: " + distancia);
    }

}
