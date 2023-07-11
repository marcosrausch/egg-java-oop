package services;

import domain.Rectangle;
import java.util.Scanner;

public class Service {

    public static Rectangle make() {
        Scanner scanFor = new Scanner(System.in);

        System.out.println("Ingrese la altura del rectángulo");
        int height = scanFor.nextInt();

        System.out.println("Ingrese el ancho del rectángulo");
        int width = scanFor.nextInt();

        return new Rectangle(width, height);
    }

    public static void getArea(Rectangle rectangle) {
        System.out.println("El área del rectángulo es: " + rectangle.getHeight() * rectangle.getWidth());
    }

    public static void getPerimeter(Rectangle rectangle) {
        System.out.println("El perímetro del rectángulo es: " + 2 * (rectangle.getWidth() + rectangle.getHeight()));
    }

    public static void draw(Rectangle rectangle) {
        for (int i = 0; i < rectangle.getWidth(); i++) {
            for (int j = 0; j < rectangle.getHeight(); j++) {
                if (i == 0 || i == rectangle.getWidth() - 1 || j == 0 || j == rectangle.getHeight() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
