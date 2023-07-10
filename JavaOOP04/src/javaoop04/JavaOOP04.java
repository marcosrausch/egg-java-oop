package javaoop04;

import domain.Rectangle;

public class JavaOOP04 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        
        rectangle = rectangle.make();
        System.out.println("La superficie del rectángulo es: " + rectangle.getArea());
        System.out.println("El perímetro del rectángulo es: " + rectangle.getPerimeter());
        rectangle.draw();
    }
    
}
