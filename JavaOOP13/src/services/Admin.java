package services;

import domain.Course;
import java.util.Scanner;

public class Admin {

    static void addStudents(String[] array) {
         Scanner scanFor = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el nombre de cada estudiante y luego"
                    + " presione [ENTER] para guardarlo");
            array[i] = scanFor.nextLine();
        }
    }

    public static Course create() {
         Scanner scanFor = new Scanner(System.in);

        Course course = new Course();

        System.out.println("Ingrese el nombre del curso:");
        course.setName(scanFor.nextLine());

        System.out.println("¿Cuántas horas por día se dicta el curso?");
        course.setHoursADay(scanFor.nextInt());

        System.out.println("¿Cuántas días a la semana se dicta el curso?");
        int hoursAWeek = scanFor.nextInt();
        course.setHoursAWeek(course.getHoursADay() * hoursAWeek);

        System.out.println("¿En cuál franja horaria se dicta?"
                + "\n[M] para Mañana."
                + "\n[T] para Tarde.");
        course.setShift(scanFor.next().charAt(0));

        System.out.println("¿Cuál es el precio del curso por hora?");
        course.setCost(scanFor.nextDouble());

        addStudents(course.getStudents());

        return course;
    }

    public static double getWeeklyProfit(Course course) {
        return course.getHoursADay()
                * course.getHoursADay()
                * course.getStudents().length
                * course.getHoursAWeek();
    }
}
