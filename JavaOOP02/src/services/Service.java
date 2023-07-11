package services;

import domain.Circle;
import java.util.Scanner;

public class Service {

    public static Circle make() {
        Scanner scanFor = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese el radio de la circunferencia");
        double radio = scanFor.nextDouble();
        
        return new Circle(radio);
    }
    
    public static void getPerimeter(Circle circle) {
        System.out.println(Math.ceil(2 * Math.PI * circle.getRadio() * 100) / 100);
    }
    
    public static void getArea(Circle circle) {
        System.out.println(Math.ceil(Math.PI * Math.pow(circle.getRadio(), 2) * 100) / 100);
    }
    
}
