package Restaurant;

import Ingredients.*;
import Products.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {
    static List<Menu> MenuList = new ArrayList<>();

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        MenuList.add(new Pizza());
        MenuList.add(new Pancakes());
        MenuList.add(new Water());
        MenuList.add(new Lemonade());
        MenuList.add(new OrangeJuice());
        System.out.println("===INITIAL MENU===");
        restaurant.displayMenu();
        System.out.println("=============");
        System.out.println("===MODIFIED MENU===");
        restaurant.modifyMenu();
        restaurant.displayMenu();
        System.out.println("=============");
        System.out.println("===SEARCH RESULTS===");
        Search.searchMenu("Lemonade");
        Search.searchMenu("Shaorma");
    }

    public void displayMenu() {
        for (Menu a : MenuList) {
            System.out.println(a.name() + " " + a.category() + " " + a.price());
        }

    }

    public void addMenu(Products products) {
        MenuList.add(products);
    }

    public void modifyMenu() {
        addMenu(new Pizza("Pizza Marguerita", Arrays.<Ingredient>asList(new Bacon(), new Ketchup(), new Flour()), Category.Food));
    }

    public interface Menu {
        String name();

        double price();

        Category category();

        double quantity();
    }
}
