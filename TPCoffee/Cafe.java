package TPCoffee;


public class Cafe implements Boisson{
    @Override
    public String description(){
        return "Coffee";
    }

    @Override
    public float cout(){
        return 2;
    }

}
