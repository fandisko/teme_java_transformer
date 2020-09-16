package Ingredients;

import Products.Category;
import Restaurant.Restaurant;

public class Water implements Restaurant.Menu, Ingredient {

    @Override
    public String name() {
        return "Water";
    }

    @Override
    public double price() {
        return 5;
    }

    @Override
    public Category category() {
        return Category.Drinks;
    }

    @Override
    public double quantity() {
        return 1;
    }
}
