package javaoop06;

import domain.Cup;
import domain.Nespresso;
import services.Coffee;

public class JavaOOP06 {

    public static void main(String[] args) {
        Nespresso nespresso = new Nespresso();
        Cup cup = new Cup();
        
        Coffee.fill(nespresso);
        Coffee.pour(cup);
        Coffee.drain(nespresso);
        Coffee.refill(nespresso);
    }
    
}
