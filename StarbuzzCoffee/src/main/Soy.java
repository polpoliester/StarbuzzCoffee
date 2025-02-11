package main;


public class Soy extends Milk{
    
    public Soy(IDrink drink) {
        super(drink);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + "(soy)";
    }

    @Override
    public float getPrice() {
        return super.getPrice() + 6;
    }
}
