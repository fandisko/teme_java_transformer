public class Remove {
    public static void remove(String name) {
        boolean flag = false;
        for (int i = 0; i < Agenda.persons.size(); i++) {
            if (Agenda.persons.get(i).getName().equals(name)) {
                flag = true;
                Agenda.persons.remove(i);
            }
        }
        if (flag) {
            System.out.println("Persoana " + name + " a fost stearsa din agenda!");
        } else
            System.out.println("Numele nu exista in agenda! " + name);
    }
}
