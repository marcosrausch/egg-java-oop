package javaoop04;

import domain.Rectangle;
import services.Service;

public class JavaOOP04 {
    
    static void run() {
        Rectangle rectangle = Service.make();
        Service.getArea(rectangle);
        Service.getPerimeter(rectangle);
        Service.draw(rectangle);
    }

    public static void main(String[] args) {
        run();
    }
    
}
