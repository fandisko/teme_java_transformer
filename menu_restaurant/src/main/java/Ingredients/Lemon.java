package Ingredients;

public class Lemon implements Ingredient{

    @Override
    public String name() {
        return "Lemon";
    }

    @Override
    public double price() {
        return 1.5;
    }

    @Override
    public double quantity() {
        return 1;
    }
}
