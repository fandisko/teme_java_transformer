package Products;

import Ingredients.Flour;
import Ingredients.Ingredient;
import Ingredients.Water;

import java.util.*;

public class Pancakes extends Products {
    public Pancakes() {
        ingredients.add(new Water());
        ingredients.add(new Flour());
        this.name = "Pancakes";
        this.category = Category.Deserts;
    }

    public Pancakes(String name, List<Ingredient> ingredientList, Category category) {
        this.name = name;
        this.ingredients = ingredientList;
        this.category = category;
    }
}
