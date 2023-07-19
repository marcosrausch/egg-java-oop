
package services;

import domain.Level;
import domain.Workout;
import interfaces.CRUD;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Trainer implements CRUD {
    
    public Workout create() {
        Workout workout = new Workout();
        Random random = new Random();
        Scanner scanFor = new Scanner(System.in);
        
        workout.setID(random.nextInt(Integer.MAX_VALUE));
        
        workout.setDifficulty(Level.LOW);

        System.out.println("Ingrese el nombre de la rutina");
        workout.setName(scanFor.next());

        System.out.println("Ingrese la duración en minutos de la rutina");
        workout.setRuntime(scanFor.nextInt());

        System.out.println("Ingrese una descripción para la rutina");
        workout.setDescription(scanFor.next());

        System.out.println("¡Rutina creada exitosamente!");

        return workout;
    }

    @Override
    public void read(ArrayList list) {
        list.forEach((workout) -> {
            System.out.println(workout.toString());
        });
    }

    @Override
    public void update(ArrayList list, String ID) {

    }

    @Override
    public void delete(ArrayList list, String ID) {

    }    
    
}
