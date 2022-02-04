package ejercicio7_poo.servicios;

import ejercicio7_poo.entidades.Persona;
import java.util.Scanner;

public class ServiciosPersona {

    Scanner leer = new Scanner(System.in); //para poder usar teclado
    private Integer adulto = 0;
    private Integer menor = 0;
    private Integer pesoIdeal = 0;
    private Integer sobrepeso = 0;
    private Integer bajoPeso = 0;
///////metodos/////////////////////////////////////////////////////////////////////////
/*• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje*/
    public Persona crearPersona() {
        Persona p = new Persona();

        int contador = 0;
        System.out.println("----------");
        System.out.println("Ingrese nombre: ");
        p.setNombre(leer.next());

        System.out.println("Ingrese edad: ");
        p.setEdad(leer.nextInt());

        do { //validacion de sexo 
            if (contador > 0) {
                System.out.println("Letra inválida, vuelva a ingresar: ");
            }

            System.out.println("Ingrese sexo: Hombre 'H', Mujer 'M',Otro 'O')");
            p.setSexo(leer.next());
            p.setSexo(p.getSexo().toUpperCase());

            contador++;
        } while (!(p.getSexo().equals("M") || p.getSexo().equals("H") || p.getSexo().equals("O")));

        System.out.println("Ingrese peso Kg (0,0): ");
        p.setPeso(leer.nextDouble());

        System.out.println("Ingrese altura Mts (0,0): ");
        p.setAltura(leer.nextDouble());

        return p;
    }

    /*• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.*/
    public int calcularIMC(Persona p) {
        int valor = 0;
        Double imc = (double) p.getPeso() / (Math.pow(p.getAltura(), 2));//calculo IMC

        if (imc < 20) {
            valor = -1; //debajo de peso ideal
        } else {
            if (imc >= 20 && imc <= 25) {
                valor = 0; //peso ideal
            } else {
                valor = 1; //sobrepeso
            }
        }
        return valor;
    }

    /*• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/
    public Boolean esMayorDeEdad(Persona p) {
        return p.getEdad() >= 18;
    }
//////////Fin metodos particulares//////////////////////////////////////////////////////////

    //Static refiere a que pertenece a la propia clase
    //defino el IMC 
    public void tienePesoIdeal(Integer imc, Persona p) {

        if (imc == 0) {
            System.out.println(p.getNombre()+", tiene peso ideal");
            pesoIdeal++;

        } else {
            if (imc == -1) {

                System.out.println(p.getNombre()+", tiene bajo peso");
                bajoPeso++;

            } else {
                if (imc == 1) {
                    System.out.println(p.getNombre()+", tiene sobrepeso");
                    sobrepeso++;
                }
            }
        }

    }

    public void calcularPorcentajeIMC() {
        //calculo porcentajes IMC
        Double porcentaje = 0.0;

        System.out.println("-----------");
        porcentaje = (double) pesoIdeal / 4;
        System.out.println("Porcentaje con peso ideal: " + porcentaje + "%");

        porcentaje = (double) sobrepeso / 4;
        System.out.println("Porcentaje con  sobrepeso: " + porcentaje + "%");

        porcentaje = (double) bajoPeso / 4;
        System.out.println("Porcentaje con bajo peso: " + porcentaje + "%");
    }

    //defino mediante metodo si es mayor de edad
    public void contarMayoriaDeEdad(Boolean adultez, Persona p) {

        if (adultez == true) {
            System.out.println(p.getNombre()+", es mayor de edad.");
            adulto++;
        } else {
            System.out.println(p.getNombre()+", es menor de edad");
            menor++;
        }
    }

    public void calcularPorcentajeAdultez() {
        Double porcentaje = 0.0;
        //calculo porcentajes edad
        System.out.println("-----------");
        porcentaje = (double) adulto / 4;
        System.out.println("Porcentaje de mayores de edad: " + porcentaje + "%");

        porcentaje = (double) menor / 4;
        System.out.println("Porcentaje de menores de edad: " + porcentaje + "%");
    }
}
