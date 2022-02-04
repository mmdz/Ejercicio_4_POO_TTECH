package ejemplopoo.Entidades;

import java.util.Scanner;

public class Perro {
    //declaramos los atributos de mi clase
    private String nombre;
    private String apodo;
    private Integer edad; //int
    
    //agregar los constructores
    //constructor vacio
    public Perro() {
    }
    //constructor parametrizado
    public Perro(String nombre, String apodo, Integer edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
    }
    
    //crear los getter y los setter
    //getter te trae los datos de los atibutos
    //setter define el valor de los atributos
    //get de nombre  //traemos el valor del atributo
    public String getNombre() {
        return nombre;
    }
    //set de nombre  //con este seteamos el valor del atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    //el metodo toString

    @Override //
    public String toString() {
        return "Perro " + "nombre:" + nombre + ", apodo:" + apodo + ", edad=" + edad ;
    }
    public Perro crearPerro(){
        Scanner sc = new Scanner(System.in);
        
        Perro p = new Perro();
        
        System.out.println("Ingrese el nombre del perro");
        p.setNombre(sc.next());
        System.out.println("Ingrese el apodo del perro");
        p.setApodo(sc.next());
        System.out.println("Ingrese la edad del perro");
        p.setEdad(sc.nextInt());
        
        return p;
    }
}
