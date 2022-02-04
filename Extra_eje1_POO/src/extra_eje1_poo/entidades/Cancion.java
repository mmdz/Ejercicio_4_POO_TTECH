package extra_eje1_poo.entidades;
/*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.*/
public class Cancion {
    //atributos
    private String titulo;
    private String cancion;
    
    //constructores
    public Cancion(){        
    }
    
    public Cancion(String titulo, String cancion){
        this.titulo = titulo;
        this.cancion = cancion;
    }
    
    //getter y setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }
    
}
