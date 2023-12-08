package domain;

public class MathClass {
    private double number1;
    private double number2;
    
    public double bigger() {
        return Math.max(getNumber1(), getNumber2());
    }
    
    public double smaller() {
        return Math.min(getNumber1(), getNumber2());
    }
    
    public double pow() {
        return Math.pow(bigger(), smaller());
    }
    
    public double squareRoot() {
        return Math.sqrt(smaller());
    }
    
    // constructors
    public MathClass() {
    }

    public MathClass(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    
    // getters & setters
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    
}
