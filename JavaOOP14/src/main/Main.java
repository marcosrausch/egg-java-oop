package main;

import domain.Phone;
import services.Employee;

public class Main {

    public static void main(String[] args) {
        Phone phone = Employee.add();
        System.out.println(phone.toString());
    }
    
}
