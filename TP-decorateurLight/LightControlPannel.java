import java.util.ArrayList;

public class LightControlPannel{
  
    private ArrayList<Light> stockLampe = new ArrayList<Light>();

    

    public void ajouter(Light l){
        stockLampe.add(l);
    }

    public void supprimer(Light l){
        stockLampe.remove(l);
    }

    public void allumertousLampe(){
        for (Light l:stockLampe){
            l.allumer();
        }
    }

    public void eteindretousPannel(){
        for (Light l:stockLampe){
            l.eteindre();
        }
    }

    public void ajusterPnnel(int i){
        for(Light light : stockLampe){
            light.intensite(i);
        }
    }
       
}