package algoritmi;

import java.util.HashMap;
import java.util.Map;

public class CharCountMethod {
    public static void characterCount(String input) {
        Map<Character, Integer> charCounter = new HashMap();
        for (char x : input.toCharArray()) {
            if (charCounter.containsKey(x)) {
                charCounter.put(x, charCounter.get(x) + 1);
            } else {
                charCounter.put(x, 1);
            }
        }
        for (Map.Entry occurence : charCounter.entrySet()) {
            System.out.println(occurence.getKey() + " - " + occurence.getValue());
            System.out.println("------");
        }
    }
}
