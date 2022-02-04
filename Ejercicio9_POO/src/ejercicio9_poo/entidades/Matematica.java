package ejercicio9_poo.entidades;

import static java.lang.Math.max;
import static java.lang.Math.round;

/*Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
 */

public class Matematica {

    //atributo
    private Double numero1;
    private Double numero2;

    //constructores
    public Matematica() {
    }

    public Matematica(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
//toString
    @Override
    public String toString() {
        return "Matematica{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }

    //getter y setter
    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

}//fin clase matematica
