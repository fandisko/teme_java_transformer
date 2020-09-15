package Ingredients;

public class Bacon implements Ingredient{
    @Override
    public String name() {
        return "Bacon";
    }

    @Override
    public double price() {
        return 15;
    }

    @Override
    public double quantity() {
        return 1;
    }
}
