import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public static List<Persons> persons = new ArrayList<>();

    public static void main(String[] args) {
        persons.add(new Persons("Ciprian", "Marian", "Agnes", "cip@mail.com", 0722222222));
        persons.add(new Persons("Adrian", "Gheorghe", "Basarabia", "adr@mail.com", 0733333333));
        persons.add(new Persons("Maria", "Danalache", "Chiajna", "md@mail.com", 0744444444));

        System.out.println("####Agenda Initiala####");
        Display.display(persons);
        System.out.println("#############");
        Search.search("Maria");
        Search.search("Dorel");
        System.out.println("#############");
        Remove.remove("Maria");
        System.out.println("####Agenda dupa stergere####");
        Display.display(persons);
    }
}
