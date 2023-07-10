package domain;

import java.util.Scanner;

public class Circle {
    private double radio;
    
    public Circle() {};
    
    public Circle(double radio) {
        this.radio = radio;
    }
    
    public void make() {
        System.out.println("Por favor, ingrese el radio de la circunferencia");
        Scanner scanFor = new Scanner(System.in);
        this.radio = scanFor.nextDouble();
    }
    
    public double getArea() {
        return Math.ceil(Math.PI * Math.pow(this.radio, 2) * 100) / 100;
    }
    
    public double getPerimeter() {
        return Math.ceil(2 * Math.PI * this.radio * 100) / 100;
    }
    
    // getters & setters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}
