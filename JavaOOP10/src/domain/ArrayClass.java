package domain;

public class ArrayClass {

    private double[] numbers;

    // constructors
    public ArrayClass(double[] numbers) {
        this.numbers = numbers;
    }

    public ArrayClass() {
    }

    // getters & setters
    public double[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int size) {
        this.numbers = new double[size];

        if (size == 50) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Math.round((Math.random() * 9));
            }
        }
    }
}
