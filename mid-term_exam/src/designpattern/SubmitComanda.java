package designpattern;

import java.util.ArrayList;
import java.util.List;

public class SubmitComanda extends Thread {
    private List<Comanda> listaComenzi= new ArrayList<Comanda>();

    public void lansareComanda(Comanda comanda){
        listaComenzi.add(comanda);
        System.out.println("Comanda " + comanda.getComanda() + " a fost inregistrata");
        System.out.println("-------------------");
    }

    public void run (){
        for (Comanda c : listaComenzi){
            c.procesare();
            System.out.println("Se proceseaza comanda " + c.getComanda());

        }
    }
}
