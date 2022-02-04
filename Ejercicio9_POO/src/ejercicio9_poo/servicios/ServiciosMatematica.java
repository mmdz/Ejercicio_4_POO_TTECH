package ejercicio9_poo.servicios;

import ejercicio9_poo.entidades.Matematica;
import static java.lang.Math.max;
import static java.lang.Math.round;

public class ServiciosMatematica {
    
//creo los nros aleatoriamente
    public Matematica crearNumeros(){
        Matematica mate = new Matematica();
        mate.setNumero1(Math.random() * 10);
        mate.setNumero2(Math.random() * 10);

        System.out.println("nro 1" + mate.getNumero1());
        System.out.println("nro 2" + mate.getNumero2());
        return mate;
    }
    /*• Método devolverMayor() para retornar cuál de los dos atributos 
    tiene el mayor valor*/
    public Double devolverMayor(Matematica mate){
        Double mayor = max(mate.getNumero1(),mate.getNumero2());               
        return mayor;
    }
        
    /*• Método calcularPotencia() para calcular la potencia del mayor
    valor de la clase elevado al menor número. Previamente se deben 
    redondear ambos valores.*/
    public void calcularPotencia(Matematica mate){
        Double potencia;
        Double menor = Double.min(mate.getNumero1(), mate.getNumero2());
        
        Double mayor = (double)round(devolverMayor(mate));
        menor = (double)round(menor);
        
        potencia = Math.pow(mayor, menor);
        System.out.println("La potencia es: "+potencia);
    }
        
    /*• Método calculaRaiz(), para calcular la raíz cuadrada del 
    menor de los dos valores. Antes de calcular la raíz cuadrada 
    se debe obtener el valor absoluto del número.*/
    
    public void calcularRaiz(Matematica mate){
        Double raiz;
        Double menor = Double.min(mate.getNumero1(), mate.getNumero2());
        
        menor = (double)round(menor);
        
        raiz =  Math.sqrt(menor);
        System.out.println("La raiz es: "+raiz);
    }
}
