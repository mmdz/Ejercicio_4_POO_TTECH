package ejercicio7_poo;

import ejercicio7_poo.entidades.Persona;
import ejercicio7_poo.servicios.ServiciosPersona;

/*A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.*/
public class Main7 {

    public static void main(String[] args) {

        ServiciosPersona sp = new ServiciosPersona();

        //instancio objetos   
        // public Persona cargarPersona(ServiciosPersona sp){
        //persona 1
        Persona p1 = sp.crearPersona();//crear persona    
        sp.tienePesoIdeal(sp.calcularIMC(p1), p1); //calcular IMC
        sp.contarMayoriaDeEdad(sp.esMayorDeEdad(p1), p1); //calcular edad

        //persona 2
        Persona p2 = sp.crearPersona(); //crear persona    
        sp.tienePesoIdeal(sp.calcularIMC(p2), p2); //calcular IMC
        sp.contarMayoriaDeEdad(sp.esMayorDeEdad(p2), p2); //calcular edad

        //persona 3
        Persona p3 = sp.crearPersona(); //crear persona    
        sp.tienePesoIdeal(sp.calcularIMC(p3),p3); //calcular IMC
        sp.contarMayoriaDeEdad(sp.esMayorDeEdad(p3),p3); //calcular edad

        //persona 4
        Persona p4 = sp.crearPersona(); //crear persona    
        sp.tienePesoIdeal(sp.calcularIMC(p4),p4); //calcular IMC
        sp.contarMayoriaDeEdad(sp.esMayorDeEdad(p4),p4); //calcular edad

        //porcentajes IMC
        sp.calcularPorcentajeIMC();

        //porcentaje adultez
        sp.calcularPorcentajeAdultez();
    }//fin main

}//fin clase main
