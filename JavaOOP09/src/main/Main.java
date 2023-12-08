package main;

import domain.MathClass;

public class Main {

    public static void main(String[] args) {
       MathClass mathObject = new MathClass();
      
       mathObject.setNumber1(Math.random() * 10);        
       mathObject.setNumber2(Math.random() * 10);
    }
    
}
