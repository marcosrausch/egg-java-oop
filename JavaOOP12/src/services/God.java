package services;

import domain.Human;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class God {

    public static Human make() {
        Scanner scanFor = new Scanner(System.in);
        String dateOfBirth;
        DateTimeFormatter formatter;
        LocalDate birthDate;

        System.out.println("Ingrese un nombre:");
        String name = scanFor.nextLine();

        System.out.println("Ingrese una fecha de nacimiento con el formato"
                + " dd/mm/AAAA:");
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dateOfBirth = scanFor.nextLine();
        birthDate = LocalDate.parse(dateOfBirth, formatter);
        
        return new domain.Human(name, birthDate);
    }
    
    public static void showHuman(Human hooman) {        
        System.out.println(hooman.toString());
    }

}
