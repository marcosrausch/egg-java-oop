package domain;

import services.Calculate;

public class Math {
    
    Calculate calculate = new Calculate();

    private int firstNumber;
    private int secondNumber;
    private int option;
    private String menu;

    public Math() {
    }

    public Math(int n, int m) {
        this.firstNumber = n;
        this.secondNumber = m;
    }

    public void showMenu() {
        this.menu = "1 - Sumar + \n"
                + "2 - Restar  - \n"
                + "3 - Multiplicar * \n"
                + "4 - Dividir /";
        System.out.println("Ahora, ingrese una opción");
        System.out.println(this.menu);
    }

    public void handle(int option, int a, int b) {
        switch (option) {
            case 1:
                print("suma", calculate.sum(a, b));
                break;
            case 2:
                print("resta", calculate.subs(a, b));
                break;
            case 3:
                print("multiplicación", calculate.mult(a, b));
                break;
            case 4:
                print("división", (int) calculate.div(a, b));
                break;
            default:
                throw new AssertionError("That is not a valid option", new Error("by you, the user. Let me ask you something: did you see a " + option + " between the options? I am guessing no..."));
        }
    }
    
    public void print(String option, int result) {
        System.out.println("El resultado de la " + option + " es: " + result);
    }
    
    
    // setters & getters

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int n) {
        this.firstNumber = n;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int m) {
        this.secondNumber = m;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }
}
