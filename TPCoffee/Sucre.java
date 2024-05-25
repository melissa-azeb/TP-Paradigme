package TPCoffee;

public class Sucre extends Decorateur {

    public Sucre(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String description() {
        return b.description() + "Sucre";
    }

    @Override
    public float cout() {
        return b.cout() + 1;
    }

}

