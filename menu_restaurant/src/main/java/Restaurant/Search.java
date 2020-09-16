package Restaurant;

public class Search extends Restaurant {
    public static void searchMenu(String search) {
        boolean flag = false;
        for (Menu menu : MenuList) {
            if (menu.name().equals(search)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Produsul " + search + " este prezent in meniu!");
        } else {
            System.out.println("Produsul " + search + "nu este in meniu! ");
        }

    }

}


