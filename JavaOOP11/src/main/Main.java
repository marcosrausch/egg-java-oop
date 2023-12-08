
package main;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Date date = createDate();
        System.out.println(date.toString());
        
        System.out.println(2023 - date.getYear());
    }
    
    
    static Date createDate() {
        Scanner scanFor = new Scanner(System.in);
        
        System.out.println("Ingrese el día en números");
        int day = scanFor.nextInt();
        System.out.println("Ingrese el mes en números");
        int month = scanFor.nextInt();
        System.out.println("Ingrese el año en dos dígitos 19[...]");
        int year = scanFor.nextInt();
        
        
        Date date = new Date(year, month, day);
        
        return date;
    }
}
