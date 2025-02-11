package main;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IDrink espressoDrink = new Milk(new Espresso());
        System.out.println(espressoDrink.getDescription());
        System.out.println(espressoDrink.getPrice());
        
        IDrink houseBlend = new Soy(new Chocolate(new HouseBlend()));
        System.out.println(houseBlend.getDescription());
        System.out.println(houseBlend.getPrice());
    }
}
