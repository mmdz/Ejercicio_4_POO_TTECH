package extra_eje5_poo.entidades;

/*Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!*/

public class Meses {

    //atributos
    private String[] v_meses = {"enero","febrero","marzo","abril","mayo","junio",
            "julio","agosto","septiembre","octubre","noviembre","diciembre"};
   private int mesSecreto;

    public Meses(int mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
   
   public Meses(){}
     
   //getter y setter
    public String[] getV_meses() {
        return v_meses;
    }

    public void setMeses(String[] v_meses) {
        this.v_meses = v_meses;
    }

    public int getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(int mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
   
   
}
