package main;

public class Chocolate implements IDrink{
    private IDrink drink;

    public Chocolate(IDrink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return this.drink.getDescription() + " extra chocolate";
    }

    @Override
    public float getPrice() {
        return this.drink.getPrice() + 3;
    }
}
