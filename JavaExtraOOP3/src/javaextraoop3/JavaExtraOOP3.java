package javaextraoop3;

import domain.Client;
import domain.Workout;
import java.util.ArrayList;
import services.Admin;
import services.Trainer;

public class JavaExtraOOP3 {
   
    public static void main(String[] args) {
        Client client = new Client();        
        Admin admin = new Admin();
        ArrayList clientList = new ArrayList();
        ArrayList workoutList = new ArrayList();
        Workout workout = new Workout();
        Trainer trainer = new Trainer();
        
        client = admin.create();
        
        clientList.add(client);
        admin.read(clientList);
        
        workout = trainer.create();
        
        workoutList.add(workout);
        trainer.read(workoutList);
    }
   
}
