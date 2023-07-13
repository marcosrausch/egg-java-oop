package services;

import domain.Cup;
import domain.Nespresso;
import java.util.Scanner;

public class Coffee {
    private static final int ZERO = 0;
    static Scanner scanFor = new Scanner(System.in);
    
    public static void fill(Nespresso nespresso){
        nespresso.setCoffeeLevel(nespresso.MAXIMUM_CAPACITY);
        
        System.out.println("¡Listo!\nCafetera llena");
    }
    
    public static void drain(Nespresso nespresso) {
        nespresso.setCoffeeLevel(ZERO);
        System.out.println("¡Listo!\nCafetera vacía");
    }
    
    public static void pour(Cup cup) {        
        System.out.println("¿Cuántas onzas tiene la taza?");
        cup.setSize(scanFor.nextInt());
        
        System.out.println("¡Servidas " + cup.getSize() + " onzas de café en la taza!" );
    }
    
    public static void refill(Nespresso nespresso) {        
        System.out.println("¿Cuántas onzas de café desea agregar a la cafetera?");
        nespresso.setCoffeeLevel(scanFor.nextInt());
        
        System.out.println("¡Hecho!\nLa cafetera ahora tiene " + nespresso.getCoffeeLevel() + " onzas de café.");        
    }
}
