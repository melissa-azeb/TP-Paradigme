public class Light{

    private boolean etat;
    private int intensite;

   

    public Light(boolean etat,int intensite){
        this.etat =  etat;
        this.intensite = intensite;
    }

   
    
    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public void setIntensite(int intensite) {
        this.intensite = intensite;
    }

    public boolean isEtat() {
        return etat;
    }

    public int getIntensite() {
        return intensite;
    }

    public void allumer(){
        this.etat = true;
    }

    public void eteindre(){
        this.etat = false;
    }

    public void intensite(int i){
        this.intensite =i;
    }

    public void ajusterLuminosite(int luminosite){
        this.intensite = luminosite;
    }

}
