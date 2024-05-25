package TPCoffee;

public class Main {
    public static void main(String[] args){

        Boisson cafe = new Cafe();
        System.out.println(cafe.description() + " : " + cafe.cout());

        cafe = new Lait(cafe);
        System.out.println(cafe.description() + " : " + cafe.cout());


        cafe = new Sucre(cafe);
        System.out.println(cafe.description() + " : " + cafe.cout());
    }
}
