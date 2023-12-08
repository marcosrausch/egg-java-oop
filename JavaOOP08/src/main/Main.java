package main;

import domain.StringClass;
import java.util.Scanner;
import services.Text;

public class Main {

    public static void main(String[] args) {
        Scanner scanFor = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String phrase = scanFor.nextLine();
        StringClass stringObject = new StringClass(phrase);
        
        Text.showVowels(stringObject.getPhrase());
        Text.showReversedString(stringObject.getPhrase());
        
        stringObject.showCharAppearances();
        stringObject.showComparison();
        
        Text.showJoinedPhrases(phrase);
        Text.showReplacedCharacter(phrase);
        
        stringObject.contains();
    }
}
