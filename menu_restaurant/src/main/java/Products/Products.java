package Products;

import Ingredients.Ingredient;
import Restaurant.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Products implements Restaurant.Menu {
    protected String name;
    public Category category;
    public List<Ingredient> ingredients = new ArrayList<>();

    public double price() {
        double price = 0;
        for (Ingredient i : ingredients) {
            price += i.price()*i.quantity();
        }
        return price;
    }

    @Override
    public double quantity() {
        return quantity();
    }

    @Override
    public String name() {
        return name;
    }
}


