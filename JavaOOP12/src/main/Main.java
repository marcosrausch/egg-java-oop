package main;

import domain.Human;
import java.time.Period;
import services.God;

public class Main {

    public static void main(String[] args) {
        Human hooman = God.make();
        
        Period age = hooman.getAge(hooman.getBirthDate());        
        System.out.println("La edad de " +
                hooman.getName() + " es " + Math.abs(age.getYears()));
        
        if (hooman.youngerThan(33)) {
            System.out.println("No es más joven");
        } else {
            System.out.println("Sí, es más joven.");
        }
        
        God.showHuman(hooman);
    }
    
}
