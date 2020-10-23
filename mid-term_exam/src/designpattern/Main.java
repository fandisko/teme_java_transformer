package designpattern;

public class Main {
    public static void main(String[] args) {
        Casa c1 = Casa.getCasa();
        Comanda comanda = new Comanda(c1,"Comanda1","Alb","Bej","Nuc");
        SubmitComanda sc = new SubmitComanda();
        sc.lansareComanda(comanda);
        sc.proceseazaComanda();
    }
}
