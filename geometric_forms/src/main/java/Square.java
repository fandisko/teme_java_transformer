public class Square extends Shape {
    double l;

    public Square(double l) {
        this.l = l;
    }

    public double getArea() {
        return l * l;
    }

    public double getPerimeter() {
        return 4 * l;
    }

    public void Details() {
        System.out.println("Latura patratului este: " + l);
        System.out.println("Aria patratului este: " + getArea());
        System.out.println("Perimetrul patratului este: " + getPerimeter());
    }
}
