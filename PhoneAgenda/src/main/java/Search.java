public class Search {
    public static void search(String name) {
        boolean flag = false;
        for (int i = 0; i < Agenda.persons.size(); i++) {
            if (Agenda.persons.get(i).getName().equals(name)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Numele este prezent in agenda! " + name);
        } else System.out.println("Numele nu este in agenda! " + name);
    }
}
