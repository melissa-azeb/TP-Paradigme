package TPCoffee;

public class Lait extends Decorateur {
    
    public Lait(Boisson b){
        super(b);
    }

    @Override
    public String description(){
        return b.description()+"Lait";
    }

    @Override
    public float cout(){
        return b.cout()+5;
    }
}
