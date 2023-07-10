package domain;

import java.util.Scanner;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle make() {
        Rectangle rectangle = new Rectangle();
        Scanner scanFor = new Scanner(System.in);

        System.out.println("Ingrese la altura del rectángulo");
        rectangle.height = scanFor.nextInt();

        System.out.println("Ingrese el ancho del rectángulo");
        rectangle.width = scanFor.nextInt();

        return rectangle;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public void draw() {
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                if (i == 0 || i == this.width - 1 || j == 0 || j == this.height - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // constructors
    public Rectangle() {}

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // getters & setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int heigth) {
        this.height = heigth;
    }

}
