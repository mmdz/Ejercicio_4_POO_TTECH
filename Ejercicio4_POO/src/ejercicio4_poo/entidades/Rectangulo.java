package ejercicio4_poo.entidades;

import java.util.Scanner;

/*Crear una clase Rectángulo que modele rectángulos por medio de un 
atributo privado base y un atributo privado altura. 
Se deberán además definir los métodos getters, setters y constructores 
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/
public class Rectangulo {

    //atributos
    private double base;
    private double altura;

    //constructor
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //toString 
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    //getters y setter
    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
}
