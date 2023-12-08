package domain;

import java.util.Comparator;
import java.util.Scanner;

public class StringClass implements Comparator<String> {

    private String phrase;
    private int lenght;

    public void showCharAppearances() {
        Scanner scanFor = new Scanner(System.in);
        System.out.println("Ingrese una letra para descubrir cuántas veces aparece en la frase:");
        char character = scanFor.next().charAt(0);
        int times = countAppearances(character);
        System.out.println("La letra [" + character + "] aparece " + times + " veces.");
    }

    public void showComparison() {
        Scanner scanFor = new Scanner(System.in);
        System.out.println("Ingrese una nueva frase y sabrá cuál es más larga:");
        String oldPhrase = getPhrase();
        String newPhrase = scanFor.nextLine();
        
        int comparison = this.compare(oldPhrase, newPhrase);        

        if (comparison > 0) {
                System.out.println("La frase más larga es la primera.");           
        } else if (comparison < 0) {            
                System.out.println("La frase más larga es la segunda");
        } else {
                System.out.println("Las dos frases son iguales");            
        }   
    }
    
    public void contains() {
        Scanner scanFor = new Scanner(System.in);
        System.out.println("Ingrese una letra para descubrir si aparece o no en la frase:");
        CharSequence character = scanFor.next();
        
        if (getPhrase().contains(character)) {
            System.out.println("La letra [" + character + "] sí aparece en la frase.");
        } else {
            System.out.println("La letra [" + character + "] no aparece en la frase.");
        }
    }

    // constructors
    public StringClass() {
    }

    public StringClass(String phrase) {
        this.phrase = phrase;
        this.lenght = phrase.length();
    }

    // getters & setters
    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght() {
        this.lenght = this.phrase.length();
    }

    private int countAppearances(char character) {
        int sum = 0;
        for (int i = 0; i < getLenght(); i++) {
            if (character == getPhrase().charAt(i)) {
                sum++;
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "StringClass{" + "phrase=" + phrase + ", lenght=" + lenght + '}';
    }

    @Override
    public int compare(String p, String p1) {
        return p.length() - p1.length();
    }

}
