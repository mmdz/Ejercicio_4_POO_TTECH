package ejercicio8_poo.entidades;

import java.util.Scanner;

/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud.  Deberá además implementar los
siguientes métodos:*/
public class Cadena {

    //atributos
    private String frase;
    private Integer longitud;

    //constructores
    public Cadena() {
    }

    public Cadena(String frase, Integer longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    
//////////////////////////////////////////////////////////////    
//to string

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    //getter y setter

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

}//fin clase cadena
