package extra_eje4_poo.entidades;

import java.util.Scanner;

/*Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
• Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:*/
public class NIF {

    //atributos
    private long DNI;
    private String letra;
    private String[] vector = {"T","R","W","A","G","M","Y","F","P","D","X","B",
            "N","J","Z","S","Q","V","H","L","C","K","E"};

    Scanner leer = new Scanner(System.in); //creo el objeto leer de la clase scanner

    //constructor
    public NIF() {
    }

    public NIF(long dni, String letra, String[] vec) {
        this.DNI = dni;
        this.letra = letra;
        this.vector = vector;
    }

 
    //getter setter tostring

    @Override
    public String toString() {
        return "NIF{" + "DNI=" + DNI + ", letra=" + letra + ", vector=" + vector + ", leer=" + leer + '}';
    }
  

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    

}
