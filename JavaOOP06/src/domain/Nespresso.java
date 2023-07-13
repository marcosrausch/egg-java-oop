package domain;

public class Nespresso {
    public static final int MAXIMUM_CAPACITY = 32; // ounces
    private int coffeeLevel;

    // constructors
    public Nespresso() {
    }

    public Nespresso(int coffeeLevel) {
        this.coffeeLevel = coffeeLevel;
    }
    
    // getters & setters
    public int getCoffeeLevel() {
        return coffeeLevel;
    }

    public void setCoffeeLevel(int coffeeLevel) {
        this.coffeeLevel = coffeeLevel;
    }
   
}
