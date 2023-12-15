package services;

import domain.Phone;
import java.util.Scanner;

public class Employee {
    
    public static Phone add() {
        Scanner scanFor = new Scanner(System.in);
        Phone phone = new Phone();
        
        System.out.println("¿De qué marca es el teléfono?");
        phone.setBrand(scanFor.nextLine());
        
        System.out.println("¿Cuánto cuesta el teléfono?");
        phone.setCost(scanFor.nextDouble());
        
        System.out.println("¿Cuál modelo es?");
        phone.setModel(scanFor.nextLine());
        
        // consumes the dangling newline character
        scanFor.nextLine();
        
        System.out.println("¿Cuánta memoria tiene?");
        phone.setRAM(scanFor.nextShort());
        
        System.out.println("¿Cuánto almacenamiento tiene?");
        phone.setStorage(scanFor.nextShort());
        
        phone.setCode();
        
        return phone;
    }
    
    
}
