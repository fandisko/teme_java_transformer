package Products;

import Ingredients.Ingredient;
import Ingredients.Orange;
import Ingredients.Water;

import java.util.*;

public class OrangeJuice extends Products {
    public OrangeJuice() {
        ingredients.add(new Water());
        ingredients.add(new Orange());
        ingredients.add(new Orange());
        this.name = "Orange Juice";
        this.category = Category.Drinks;

    }

    public OrangeJuice(String name, List<Ingredient> ingredientList, Category category) {
        this.name = name;
        this.ingredients = ingredientList;
        this.category = category;
    }

}
