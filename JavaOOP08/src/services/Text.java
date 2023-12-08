package services;

import java.util.Scanner;

public class Text {

    static final char BLANK_SPACE = ' ';

    public static void showVowels(String phrase) {
        String onlyVowels = getVowels(phrase);
        System.out.println(onlyVowels);
    }

    public static void showReversedString(String phrase) {
        String reversed = reverseString(phrase);
        System.out.println(reversed);
    }
    
    public static void showJoinedPhrases(String phrase) {
        Scanner scanFor = new Scanner(System.in);
        System.out.println("Ingrese una nueva frase para unirla a su primera frase:");
        String suffix = scanFor.nextLine();
        System.out.println(phrase.concat(suffix));
    }
    
    public static void showReplacedCharacter(String phrase) {
        Scanner scanFor = new Scanner(System.in);
        System.out.println("Ingrese un caracter para reemplazar la letra [a]:");
        char character = scanFor.nextLine().charAt(0);
        String replacedChar = replacedChar(phrase, character);
        System.out.println(replacedChar);
    }

    private static String getVowels(String phrase) {
        String vowelsString = "";

        for (int i = 0; i < phrase.length(); i++) {
            boolean vowelFound = false;
            for (int j = 0; j < Utils.VOWELS.length; j++) {
                if (phrase.charAt(i) == Utils.VOWELS[j]) {
                    vowelsString += phrase.charAt(i);
                    vowelFound = true;
                    break;
                }
            }
            if (!vowelFound) {
                vowelsString += BLANK_SPACE;
            }
            int last = Utils.last(vowelsString);
            if (vowelsString.charAt(last) == BLANK_SPACE) {
                Utils.removeLastString(vowelsString);
            }
        }

        return vowelsString;
    }

    private static String reverseString(String string) {
        String reversed = "";
        int last = Utils.last(string);

        for (int i = last; i >= 0; i--) {
            reversed += string.charAt(i);
        }

        return reversed;
    }
    
    private static String replacedChar(String phrase, char character) {
        return phrase.replace(Utils.VOWELS[0], character);
    }

}
