
package main;

import domain.Course;
import services.Admin;

public class Main {

    public static void main(String[] args) {
        Course course = Admin.create();
        System.out.println(course.toString());
        
        System.out.println("La ganancia semanal del curso es de $"
                + Admin.getWeeklyProfit(course));
    }
    
}
