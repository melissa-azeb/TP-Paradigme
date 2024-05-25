public class TurnOffLightCommand implements Commande {
    
    private Light light;
    public TurnOffLightCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute(){
        light.eteindre();
    }

    @Override
    public void unodo(){
        light.allumer();
    }
}
