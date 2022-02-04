package ejercicio4_poo.servicio;

import ejercicio4_poo.entidades.Rectangulo;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    /*La clase incluirá un método para crear el rectángulo con los datos
del Rectángulo dados por el usuario.*/
    public Rectangulo crearRectangulo() {
        Rectangulo rec = new Rectangulo();
        System.out.println("Ingrese base:");
        rec.setBase(leer.nextDouble());

        System.out.println("Ingrese altura:");
        rec.setAltura(leer.nextDouble());
        return rec;
    }

    /*También incluirá un método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo */
    public double calcularSuperficie(Rectangulo rec) {
        double superficie = rec.getBase() * rec.getAltura();
//aca no hace falta usar getter y setter porq lo uso en la misma clase
        return superficie;
    }

    public double calcularPerimetro(Rectangulo rec) {
        double perimetro = (rec.getBase() + rec.getAltura())*2;
        return perimetro;
    }

/*. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura*/
    public void dibujarRectangulo(Rectangulo rec){
       int i,j;
        System.out.println("Se dibuja el rectángulo: ");
        for(i=1 ; i<=rec.getBase() ;i++){
            for (j = 1; j <= rec.getAltura(); j++){
               if(i==rec.getBase() || i==1 || j==1 || j==rec.getAltura()){
                System.out.print("*");
               }else{
                   System.out.print(" ");
               }             
            }
              System.out.println("");
        }      
    }

}
