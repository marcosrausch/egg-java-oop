/*
 */
package services;

public class Calculate {
  
   public int sum(int a, int b) {
       return a + b;
   }
   
    public int subs(int a, int b) {
       return a - b;
   }
      
    public int mult(int a, int b) {
       return a * b;
   }
    
    public double div(int a, int b) {
       if (b == 0) {
           System.out.println("No se puede dividir por cero.");
           return (double) 0;
       }
       return (double) a / b;
   }
}
