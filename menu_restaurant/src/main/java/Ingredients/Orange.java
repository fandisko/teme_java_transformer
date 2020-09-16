package Ingredients;

public class Orange implements Ingredient {
    @Override
    public String name() {
        return "Orange";
    }

    @Override
    public double price() {
        return 2.0;
    }

    @Override
    public double quantity() {
        return 1;
    }
}
