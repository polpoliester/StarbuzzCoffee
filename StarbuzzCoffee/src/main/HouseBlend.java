package main;

public class HouseBlend implements IDrink {
    
    public HouseBlend () {}

    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public float getPrice() {
        return 20;
    }
}
