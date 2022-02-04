package extra_eje5_poo.servicios;

import java.util.Random;
import extra_eje5_poo.entidades.Meses;

public class ServiciosMeses {

    Meses m = new Meses();

    public int crearMesSecreto() {
        m.setMesSecreto((int) Math.round(Math.random() * 12));

        if (m.getMesSecreto() == 12) {
            m.setMesSecreto(11); //por si da 12
        }

        System.out.println("Mes secreto: (+1)" + (m.getMesSecreto())+"---");

        return m.getMesSecreto();
    }

    public Boolean mesSecreto(String mes) {
    Boolean acerto = true;    
        m.setMesSecreto(m.getMesSecreto());
        
     //   System.out.println("Mes secreto: " + m.getMesSecreto());
     //   System.out.println("Mes encontrado: "+m.getV_meses()[m.getMesSecreto()]);
        
        for (int i = 0; i <= m.getV_meses().length; i++) {
            if (m.getV_meses()[m.getMesSecreto()].equals(mes)){                
                acerto =  true;
            } else {
                acerto =  false;
            }
        }
        if(acerto){
            System.out.println("Ha acertado!");
        } else{
            System.out.println("No ha acertado!");
        }

    return acerto;
    }    

}
