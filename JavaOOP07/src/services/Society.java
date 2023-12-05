package services;

import domain.Human;

public class Society {

    public static byte bodyShame(Human human) {
        byte IMC;
        
        if (calculateIMC(human) < 20) {
            IMC = -1;
        } else if (calculateIMC(human) >= 20 && calculateIMC(human) <= 25) {
            IMC = 0;
        } else {
            IMC = 1;
        }
        
        return IMC;
    }
    
    public static boolean oldEnoughToDrink(byte age) {
        return age >= 18;
    }

    private static float calculateIMC(Human human) {
        return human.getWeight() / (human.getHeight() * human.getHeight());
    }
}
