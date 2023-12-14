
package main;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {        
        int day, month, year;
        Scanner scanFor = new Scanner(System.in);
        
        System.out.println("Ingrese el día de la fecha en dos dígitos: ");
        day = scanFor.nextInt();
        
        System.out.println("Ingrese el mes de la fecha en dos dígitos: ");
        month = scanFor.nextInt();
        
        System.out.println("Ingrese el año de la fecha en cuatro dígitos: ");
        year = scanFor.nextInt();
        
        LocalDate date = LocalDate.of(year, month, day);
        
        System.out.println("La fecha que ingresó es: " + date);
        
        LocalDate now = LocalDate.now();
        
        int diff;
        
        diff = Math.abs(now.getYear()) - Math.abs(date.getYear());
        
        System.out.println("Hay " + Math.abs(diff) + " años de diferencia entre la fecha que ingresó y la fecha actual.");
    }
    

}
