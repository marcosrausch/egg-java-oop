package services;

import domain.Client;
import interfaces.CRUD;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin implements CRUD {

    @Override
    public Client create() {
        Scanner scanFor = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Ingrese el nombre del cliente");
        client.setName(scanFor.next());

        System.out.println("Ingrese el DNI del cliente");
        client.setID(scanFor.nextInt());

        System.out.println("Ingrese la edad del cliente");
        client.setAge(scanFor.nextByte());

        System.out.println("Ingrese la altura del cliente");
        client.setHeight(scanFor.nextShort());

        System.out.println("Ingrese el peso del cliente");
        client.setWeight(scanFor.nextShort());

        System.out.println("Ingrese el objetivo del cliente");
        client.setGoal(scanFor.next());

        System.out.println("¡Cliente agregado exitosamente!");

        return client;
    }

    @Override
    public void read(ArrayList list) {
        list.forEach((client) -> {
            System.out.println(client.toString());
        });
    }

    @Override
    public void update(ArrayList list, String ID) {
        
    }

    @Override
    public void delete(ArrayList list, String ID) {
        
    }
    
    
}
