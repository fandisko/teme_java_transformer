package Ingredients;

import Restaurant.Restaurant;

public class Water implements Restaurant.Menu,Ingredient{

    @Override
    public String name() {
        return "Water";
    }

    @Override
    public double price() {
        return 5;
    }

    @Override
    public double quantity() {
        return 1;
    }
}
