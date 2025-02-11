package main;

public class Milk implements IDrink {

    private IDrink drink;

    public Milk(IDrink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return this.drink.getDescription() + " with milk";
    }

    @Override
    public float getPrice() {
        return this.drink.getPrice() + 6;
    }
}
