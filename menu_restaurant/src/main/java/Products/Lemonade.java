package Products;

import Ingredients.Ingredient;
import Ingredients.Lemon;
import Ingredients.Water;

import java.util.List;

public class Lemonade extends Products {
    public Lemonade() {
        ingredients.add(new Water());
        ingredients.add(new Lemon());
        ingredients.add(new Lemon());
        this.name = "Lemonade";
        this.category = Category.Drinks;
    }

    public Lemonade(String name, List<Ingredient> ingredientList, Category category) {
        this.name = name;
        this.ingredients = ingredientList;
        this.category = category;
    }

}
