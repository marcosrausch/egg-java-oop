package main;

import domain.ArrayClass;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayClass arrayA = new ArrayClass();
        ArrayClass arrayB = new ArrayClass();
        
        arrayA.setNumbers(50);
        arrayB.setNumbers(20);
        
        System.out.println("Arreglo desordenado A:");       
        printArray(arrayA.getNumbers());
        
        Arrays.sort(arrayA.getNumbers());
        
        fillArray(arrayA.getNumbers(), arrayB.getNumbers());
        Arrays.fill(arrayB.getNumbers(), 10, 20, 0.5);
        
        System.out.println("Arreglo ordenado A:");       
        printArray(arrayA.getNumbers());
        
        System.out.println("Arreglo B:");
        printArray(arrayB.getNumbers());        
    }

    static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("\n");
    }
    
    static void fillArray(double[] arraySource, double[]  arrayTarget) {
        for (int i = 0; i <= 10; i++) {
            arrayTarget[i] = arraySource[i];
        }
    }
}
