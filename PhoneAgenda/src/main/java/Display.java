import java.util.List;

public class Display extends Agenda {
    public static void display(List<Persons> persons) {
        for (int i = 0; i < Agenda.persons.size();
             i++) {
            System.out.println(Agenda.persons.get(i).getName() + " " + Agenda.persons.get(i).getSurname());
        }
    }
}
