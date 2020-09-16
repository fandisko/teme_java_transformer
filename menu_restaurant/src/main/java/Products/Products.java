package Products;

import Ingredients.Ingredient;
import Restaurant.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Products implements Restaurant.Menu {
    public Category category;
    public List<Ingredient> ingredients = new ArrayList<>();
    protected String name;

    public double price() {
        double price = 0;
        for (Ingredient i : ingredients) {
            price += i.price() * i.quantity();
        }
        return price;
    }

    @Override
    public Category category() {
        return category;
    }

    @Override
    public double quantity() {
        return quantity();
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String name() {
        return name;
    }
}


