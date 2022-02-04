package ejercicio10_poo.entidades;

/*en esta clase modelo el problema*/
public class Arreglos {

    //atributos
    private final int A = 50; //constantes
    private final int B = 20;
    private double[] arregloA = new double[A];
    private double[] arregloB = new double[B];

    //constructores
    public Arreglos() {
    }
    
    public Arreglos(double[] arregloA,double[] arregloB){
        this.arregloA = arregloA;
        this.arregloB = arregloB;
    }
        
    //toString, getter y setter

    @Override
    public String toString() {
        return "Arreglos{" + "arregloA=" + arregloA + ", arregloB=" + arregloB + '}';
    }

    public double[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }
    
    
}
