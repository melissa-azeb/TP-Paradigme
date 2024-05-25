public class AdjustBrightnessCommand implements Commande {
    
    private Light light;
    private int nouvelleLuminosite;
    private int luminositeExistante;

    
    public AdjustBrightnessCommand(Light light, int nouvelleLuminosite, int luminositeExistante) {
        this.light = light;
        this.nouvelleLuminosite = nouvelleLuminosite;
        this.luminositeExistante = luminositeExistante;
    }


    public void execute(){
        luminositeExistante = light.getIntensite();
        light.ajusterLuminosite(nouvelleLuminosite);
    }

    public void annuler(){
        light.ajusterLuminosite(luminositeExistante);
    }

    @Override
    public void unodo(){
        light.ajusterLuminosite(luminositeExistante);
    }
}