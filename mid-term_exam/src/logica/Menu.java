package logica;


import java.util.*;

public class Menu {
    private static final String exitOption = "0";
    private static final String menuSpace = "   ";
    private List<Menu_Option> optionsMenu = new ArrayList<>();
    private int menuLevel = 0;

    public Menu() {
    }

    public Menu(int menuLevel) {
        this.menuLevel = menuLevel;
    }

    public void add(Menu_Option m) {
        this.optionsMenu.add(m);
    }

    public List<Menu_Option> getOptionMenu() {
        return optionsMenu;
    }

    public static String getExitOption() {
        return exitOption;
    }

    public void repeatMenu() {
        String option;
        Scanner s = new Scanner(System.in);
            while (true) {
                System.out.println(this);
                option = s.nextLine();
                if (option.equals(exitOption)) {
                    return;
                }
                boolean optionFound = false;
                for (Menu_Option m : optionsMenu) {
                    if (m.getOption().equalsIgnoreCase(option)) {
                        m.menuAction();
                        optionFound = true;
                    }
                }
                if (!optionFound) {
                    System.out.println("Unrecognized option, please choose an existent menu!!!");
                }
            }
        }


    @Override
    public String toString() {
        StringBuilder strB = new StringBuilder();
        for (Menu_Option m : optionsMenu) {
            for (int i = 0; i < menuLevel; i++) {
                strB.append(menuSpace);
            }
            strB.append(m).append("\n");
        }
        return strB.toString();
    }

}

