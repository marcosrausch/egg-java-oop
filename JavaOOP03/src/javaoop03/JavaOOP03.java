package javaoop03;

import domain.Math;
import java.util.Scanner;

public class JavaOOP03 {
    
    static void run() {
        Scanner scanFor = new Scanner(System.in);
        Math math = new Math();
        
        System.out.println("Por favor, ingrese dos números");
        math.setFirstNumber(scanFor.nextInt());
        math.setSecondNumber(scanFor.nextInt());
        
        math.showMenu();
        math.setOption(scanFor.nextInt());
        
        math.handle(
                math.getOption(),
                math.getFirstNumber(),
                math.getSecondNumber()
        );
    }
    
    public static void main(String[] args) {
        run();
    }
}
