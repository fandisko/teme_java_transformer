package algoritmi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the string that will be analyzed: ");
        String input = s.nextLine();
        System.out.println("+++++Result is:++++++");
        System.out.println();
        CharCountMethod.characterCount(input);
    }
}
