public class Rectangle extends Shape{
    double L;
    double l;
    public Rectangle (double L, double l){
        this.L=L;
        this.l=l;
    }
    public double getArea(){
        return L * l;
    }
    public double getPerimeter(){
        return 2 * (L+l);
    }
    public void Details (){
        System.out.println("Lungimea dreptunghiului este: " + L);
        System.out.println("Latimea dreptunghiului este: " + l);
        System.out.println("Aria dreptunghiului este: " + getArea());
        System.out.println("Perimetrul dreptunghiului este: " + getPerimeter());
    }
}
