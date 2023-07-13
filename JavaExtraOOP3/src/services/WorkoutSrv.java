package services;

import domain.Level;
import domain.Workout;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkoutSrv {
    static Scanner scanFor = new Scanner(System.in).useDelimiter("\n");
    static ArrayList<Workout> listaDeRutinas = new ArrayList<>();

    public static void registrarRutina() {
        Workout newWorkout = new Workout();

        System.out.println("Ingrese el nombre de la rutina");
        newWorkout.setName(scanFor.next());

        System.out.println("Ingrese el DNI de la rutina");
        newWorkout.setID(scanFor.nextInt());

        System.out.println("Ingrese la edad de la rutina");
        newWorkout.setRuntime(scanFor.nextInt());

        System.out.println("Ingrese la altura de la rutina");
        newWorkout.setDifficulty(Level.LOW);

        System.out.println("Ingrese el objetivo de la rutina");
        newWorkout.setDescription(scanFor.next());

        listaDeRutinas.add(newWorkout);
    }

    public static void obtenerClientes() {
        listaDeRutinas.forEach(rutina -> System.out.println(rutina.toString()));
    }

    public static void actualizarRutina(int ID, String name, byte runtime, Level difficulty, String description) {
        Workout rutina = buscarRutina(ID);

        if (rutina != null) {
            rutina.setName(name);
            rutina.setRuntime(runtime);
            rutina.setDifficulty(difficulty);
            rutina.setDescription(description);
        } else {
            System.out.println("Rutina no encontrada");
        }
    }

    static Workout buscarRutina(int ID) {
        Workout rutinaEncontrado = null;

        for (Workout rutina : listaDeRutinas) {
            if (rutina.getID() == ID) {
                rutinaEncontrado = rutina;
            }
            break;
        }
        return rutinaEncontrado;
    }
    
    public static void eliminarRutina(int ID) {
        Workout rutina = buscarRutina(ID);
        if (rutina != null) {
            listaDeRutinas.remove(rutina);
        } else {
            System.out.println("No puedo eliminar una rutina si no existe");
        }
    }
}
