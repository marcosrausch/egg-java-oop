package services;

import domain.Client;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientSrv {

    static Scanner scanFor = new Scanner(System.in).useDelimiter("\n");
    static ArrayList<Client> listaDeClientes = new ArrayList<>();

    public static void registrarCliente() {
        Client newClient = new Client();

        System.out.println("Ingrese el nombre del cliente");
        newClient.setName(scanFor.next());

        System.out.println("Ingrese el DNI del cliente");
        newClient.setID(scanFor.nextInt());

        System.out.println("Ingrese la edad del cliente");
        newClient.setAge(scanFor.nextByte());

        System.out.println("Ingrese la altura del cliente");
        newClient.setHeight(scanFor.nextShort());

        System.out.println("Ingrese el peso del cliente");
        newClient.setWeight(scanFor.nextShort());

        System.out.println("Ingrese el objetivo del cliente");
        newClient.setGoal(scanFor.next());

        listaDeClientes.add(newClient);
    }

    public static void obtenerClientes() {
        listaDeClientes.forEach(cliente -> System.out.println(cliente.toString()));
    }

    public static void actualizarCliente(int ID, String name, byte age, short height, short weigth, String goal) {
        Client client = buscarCliente(ID);

        if (client != null) {
            client.setName(name);
            client.setAge(age);
            client.setHeight(height);
            client.setWeight(weigth);
            client.setGoal(goal);
        } else {
            System.out.println("Cliente no encontrado");
        }
    }

    static Client buscarCliente(int ID) {
        Client clienteEncontrado = null;

        for (Client client : listaDeClientes) {
            if (client.getID() == ID) {
                clienteEncontrado = client;
            }
            break;
        }
        return clienteEncontrado;
    }
    
    public static void eliminarCliente(int ID) {
        Client cliente = buscarCliente(ID);
        if (cliente != null) {
            listaDeClientes.remove(cliente);
        } else {
            System.out.println("No puedo eliminar un cliente si no existe");
        }
    }
    // TODO: MENU
}
