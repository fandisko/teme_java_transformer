import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prime_List {
    //Declaram listele initiale
    static List<Integer> myList = new ArrayList<Integer>();
    static List<Integer> primeList = new ArrayList<Integer>();
    public static void main(String[] args) {
        myList.add(0);
        myList.add(17);
        myList.add(2);
        myList.add(7);
        myList.add(11);
        myList.add(5);
        myList.add(13);
        System.out.println("Lista initiala este:" + myList);
        System.out.println("Lista numerelor prime este: ");
        primeList(myList);
        //Folosim sortarea pentru ordonare
        Collections.sort(primeList);
        System.out.println("Lista numerelor prime sortata este:" + primeList);

    }
    //Verificam daca un numar este prim;
    public static boolean checkPrime(int nr) {
        if (nr % 2 == 0)
            return false;
        for (int i = 3; i < Math.sqrt(nr); i += 2) {
            if (nr % i == 0)
                return false;
        }
        return true;
    }
    //Generam lista numerelor prime;
    public static void primeList(List<Integer> list){
        for (int i=0;i<list.size();i++){
            if(checkPrime(list.get(i))){
                primeList.add(list.get(i));
            }
        }
        System.out.println(primeList);
    }
}

