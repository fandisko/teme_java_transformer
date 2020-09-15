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
        MenuList.add(new Lemonade());
        restaurant.displayMenu();
        System.out.println("=============");
        restaurant.modifyMenu();
        restaurant.displayMenu();
        System.out.println("=============");
        Search.searchMenu("Lemonade");
        Search.searchMenu("Shaorma");
    }

    public void displayMenu() {
        for (Menu a : MenuList) {
            System.out.println(a.name() + " " + " " + a.price());
        }

    }

    public void addMenu(Products products) {
        MenuList.add(products);
    }

    public void modifyMenu() {
        addMenu(new Pizza("Pizza2", Arrays.<Ingredient>asList(new Bacon()), Category.Food));
    }

    public interface Menu {
        String name();
        double price();
        double quantity();
    }
}
