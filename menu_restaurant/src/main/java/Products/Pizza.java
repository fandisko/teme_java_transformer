package Products;

import Ingredients.Bacon;
import Ingredients.Ingredient;
import Ingredients.Ketchup;
import Ingredients.Water;
import Products.Products;

import java.util.List;

import Products.Category;

public class Pizza extends Products {
    public Pizza() {
        ingredients.add(new Bacon());
        ingredients.add(new Water());
        ingredients.add(new Ketchup());
        this.name = "Pizza Carbonara";
        this.category = Category.Food;
    }

    public Pizza(String name, List<Ingredient> ingredientList, Category category) {
        this.name = name;
        this.ingredients = ingredientList;
        this.category = category;
    }

}



