public class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return r * r * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public void Details() {
        System.out.println("Raza cercului este:" + r);
        System.out.println("Aria cercului este:" + getArea());
        System.out.println("Perimeterul cercului este: " + getPerimeter());
    }
}