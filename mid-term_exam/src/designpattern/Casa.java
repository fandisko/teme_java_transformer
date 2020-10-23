package designpattern;

public class Casa {
    //Singleton pattern
    private static Casa casa;
    public static Casa getCasa() {
        if (casa == null) {
            casa = new Casa();
        }
        return casa;
    }
}
