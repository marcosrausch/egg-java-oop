package javaoop02;

import domain.Circle;
import services.Service;

public class JavaOOP02 {
    
    static void run() {        
        Circle circle = Service.make();
        Service.getArea(circle);
        Service.getPerimeter(circle);
    }

    public static void main(String[] args) {
        run();
    }
    
}
