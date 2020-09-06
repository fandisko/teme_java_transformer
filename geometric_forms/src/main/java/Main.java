import java.util.ArrayList;

public class Main {
    static ArrayList<Shape> elements = new ArrayList<Shape>();
    public static void main(String[] args) {
        elements.add(new Circle(4));
        elements.add(new Square(25));
        elements.add(new Rectangle(12,8));
        elements.add(new Circle(32));
        elements.add(new Square(4));
        elements.add(new Rectangle(30,15));
        for (int i=0;i<elements.size();i++){
            elements.get(i).Details();
        }

    }
}
