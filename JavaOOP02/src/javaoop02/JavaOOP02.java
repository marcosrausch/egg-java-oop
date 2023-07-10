package javaoop02;

import domain.Circle;

public class JavaOOP02 {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.make();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
    
}
