package TPCoffee;

public abstract class Decorateur implements Boisson{
    protected Boisson b;

    public Decorateur(Boisson b) {
        this.b = b;
    }

    @Override
    public String description(){
        return b.description();
    }

    @Override
    public float cout(){
        return b.cout();
    }
}
