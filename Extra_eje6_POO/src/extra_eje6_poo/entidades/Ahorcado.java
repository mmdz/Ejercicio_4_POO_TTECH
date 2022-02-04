package extra_eje6_poo.entidades;

/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
*/

public class Ahorcado {

    //atributos
    private String[] vecPalabraBuscar;
    private Integer cantEncontradas; //letras enocntradas
    private Integer jugadasMaximas; //jugadas max q puede hacer el usuario

    //constructores
    public Ahorcado() {
    }

    public Ahorcado(String[] letras, Integer cantEncontradas, Integer jugadasMaximas) {
        this.vecPalabraBuscar = letras;
        this.jugadasMaximas = jugadasMaximas;
        this.cantEncontradas = cantEncontradas;
    }

    //string, getter y setter
    @Override
    public String toString() {
        return "Ahorcado{" + "letras=" + vecPalabraBuscar + ", cantEncontradas=" + cantEncontradas + ", jugadasMaximas=" + jugadasMaximas + '}';
    }

    public String[] getVecPalabraBuscar() {
        return vecPalabraBuscar;
    }

    public void setVecPalabraBuscar(String[] vecPalabraBuscar) {
        this.vecPalabraBuscar = vecPalabraBuscar;
    }

    public Integer getCantEncontradas() {
        return cantEncontradas;
    }

    public void setCantEncontradas(Integer cantEncontradas) {
        this.cantEncontradas = cantEncontradas;
    }

    public Integer getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(Integer jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

}
