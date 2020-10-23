package designpattern;

public class Comanda implements Customizare{
    private final String comanda;
    private final String culoarePereti;
    private final String culoareGresie;
    private final String culoareParchet;
    //Command pattern

    private Casa c1 = Casa.getCasa();

    public Comanda(Casa c1,String comanda, String culoarePereti,String culoareGesie, String culoareParchet) {
        this.c1=c1;
        this.comanda = comanda;
        this.culoarePereti=culoarePereti;
        this.culoareGresie=culoareGesie;
        this.culoareParchet=culoareParchet;

    }

    @Override
    public String comanda() {
        return comanda;
    }

    @Override
    public String culoarePereti() {
        return culoarePereti;
    }

    @Override
    public String culoareGresie() {
        return culoareGresie;
    }

    @Override
    public String culoareParchet() {
        return culoareParchet;
    }

    public String getComanda() {
        return comanda;
    }

    public void procesare(){
        System.out.println("Ati adaugat urmatoarele optiuni pentru casa:");
        System.out.println("Culoare pereti: \n" + culoarePereti());
        System.out.println("Culoare gresie: \n" + culoareGresie());
        System.out.println("Culoare parchet: \n" + culoareParchet());

    }
}
