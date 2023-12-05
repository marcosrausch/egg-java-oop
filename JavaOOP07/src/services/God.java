package services;

import domain.Human;
import domain.Human.Sex;
import java.util.Scanner;

public class God {

    public static Human make() {
        Scanner ScanFor = new Scanner(System.in).useDelimiter("\n");
        Sex sex;

        System.out.println("Ingrese el nombre:");
        String name = ScanFor.nextLine();

        System.out.println("Ingrese la edad en años:");
        byte age = ScanFor.nextByte();

        System.out.println("Ingrese el peso en kilogramos:");
        short weight = ScanFor.nextShort();

        System.out.println("Ingrese la altura en metros:");
        float height = ScanFor.nextFloat();

        System.out.println("Ingrese el sexo:\n"
                + "[H] para hombre\n"
                + "[M] para mujer\n");
        String gender = ScanFor.next();
        sex = validateInput(gender);

        return new Human(name, age, weight, height, sex);
    }

    private static Sex validateInput(String gender) {
        Sex sex;
        switch (gender) {
            case "H":
                sex = Sex.MALE;
                break;
            case "M":
                sex = Sex.FEMALE;
                break;
            default:
                sex = Sex.OTTER;
        }
        return sex;
    }
}
