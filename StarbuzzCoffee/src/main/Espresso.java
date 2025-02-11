package main;

public class Espresso implements IDrink {
    
    public Espresso () {}

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public float getPrice() {
        return 17;
    }
}
