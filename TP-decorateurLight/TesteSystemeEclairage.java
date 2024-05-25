public class TesteSystemeEclairage {
    
    public static void main(String[] args){
       LightControlPannel pannel = new LightControlPannel(); 

       Light l1 = new Light(false,0);
       Light l2 = new Light(true, 0);

       pannel.ajouter(l2);
       pannel.ajouter(l1);

       Commande allumerLampe = new TurnOnLightCommand(l2);
       Commande eteindreLampe = new TurnOffLightCommand(l1);
       Commande ajusterLampe = new AdjustBrightnessCommand(l2, 0, 0);

       allumerLampe.execute();
       eteindreLampe.execute();
       ajusterLampe.execute();
    }
}
