package Products;

import Ingredients.Bacon;
import Ingredients.Ingredient;
import Ingredients.Water;
import Products.Products;

import java.util.List;
import Products.Category;

public class Pizza extends Products {
    public Pizza (){
        ingredients.add(new Bacon());
        ingredients.add(new Water());
        this.name="Products.Pizza";
        this.category= Category.Food;
    }

    public Pizza(String name, List<Ingredient> ingredientList, Category category){
        this.name=name;
        this.ingredients=ingredientList;
        this.category=category;
    }

}



