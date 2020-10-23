package designpattern;

public class Main {
    public static void main(String[] args) {
        Casa c1 = Casa.getCasa();
        Comanda comanda = new Comanda(c1,"Comanda1","Alb","Bej","Nuc");
        Comanda comanda2 = new Comanda(c1,"Comanda2","Gri","Alb","Bej");
        SubmitComanda sc = new SubmitComanda();
        sc.lansareComanda(comanda);
        sc.lansareComanda(comanda2);
        sc.start();
    }
}
