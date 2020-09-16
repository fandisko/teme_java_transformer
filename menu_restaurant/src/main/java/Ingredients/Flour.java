package Ingredients;

public class Flour implements Ingredient{
    @Override
    public String name() {
        return "Flour";
    }

    @Override
    public double price() {
        return 2.3;
    }

    @Override
    public double quantity() {
        return 1;
    }
}
