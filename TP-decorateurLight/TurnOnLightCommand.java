public class TurnOnLightCommand implements Commande {
    
    private Light light;
    public TurnOnLightCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute(){
        light.allumer();
    }

    @Override
    public void unodo(){
        light.eteindre();;
    }
}
