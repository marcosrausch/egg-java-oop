package domain;

import java.util.Scanner;

public class Phone {
    private String brand;
    private double cost;
    private String model;
    private short RAM;
    private short storage;
    private byte[] code = new byte[7];

    // constructors
    public Phone() {
    }

    public Phone(String brand, double cost, String model, short RAM, short storage) {
        this.brand = brand;
        this.cost = cost;
        this.model = model;
        this.RAM = RAM;
        this.storage = storage;
    }
    
    // getters & setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public short getRAM() {
        return RAM;
    }

    public void setRAM(short RAM) {
        this.RAM = RAM;
    }

    public short getStorage() {
        return storage;
    }

    public void setStorage(short storage) {
        this.storage = storage;
    }

    public void getCode() {
        System.out.println("El código ingresado es:");
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i] + "\t"); 
        }
    }

    public void setCode() {
        byte[] phoneCode = new byte[7];
        Scanner scanFor = new Scanner(System.in);
        System.out.println("Ingrese un dígito para el código, luego presione [ENTER]");
        for (int i = 0; i < phoneCode.length; i++) {
           phoneCode[i] = scanFor.nextByte();
        }
        this.code = phoneCode;
        
        getCode();
    }

    @Override
    public String toString() {
        return "Phone{" + "brand=" + brand + ", cost=" + cost + ", model=" + model + ", RAM=" + RAM + ", storage=" + storage + ", code_length=" + code.length + '}';
    }
    
    
    
}
