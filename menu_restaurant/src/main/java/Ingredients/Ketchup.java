package Ingredients;

public class Ketchup implements Ingredient{
    @Override
    public String name() {
        return "Ketchup";
    }

    @Override
    public double price() {
        return 1.2;
    }

    @Override
    public double quantity() {
        return 1;
    }
}
