//Wajp count and print how many consents character are there. 

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scr.nextLine();

        int i1 = 0;

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (Character.isLetter(character) && !isVowel(character)) {
                i1++;
            }
        }

        System.out.println("Number of consonant characters: " + i1);
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
