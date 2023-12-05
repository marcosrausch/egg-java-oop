package main;

import domain.Human;
import services.God;

public class Main {

    public static void main(String[] args) {
        start();
    }

    static void start() {
        Human[] humans = new Human[4];

        for (int i = 0; i < humans.length; i++) {
            Human human = God.make();
            System.out.println(human.toString());
            humans[i] = human;
        }
        processWeight(humans);
        processAdulthood(humans);
    }

    static void processWeight(Human[] humans) {
        byte underWeighted, idealWeighted, overWeighted;
        underWeighted = 0;
        idealWeighted = 0;
        overWeighted = 0;

        for (int i = 0; i < humans.length; i++) {
            switch (humans[i].getIMC()) {
                case -1:
                    underWeighted++;
                    break;
                case 0:
                    idealWeighted++;
                    break;
                case 1:
                    overWeighted++;
                    break;
            }
        }

        System.out.println("% de personas debajo de su peso: "
                + (underWeighted / humans.length * 100) + "%."
                + "\n% de personas con peso ideal: "
                + (idealWeighted / humans.length * 100) + "%."
                + "\n% de personas por encima de su peso: "
                + (overWeighted / humans.length * 100) + "%."
        );

    }

    static void processAdulthood(Human[] humans) {
        byte minors, adults;
        minors = 0;
        adults = 0;

        for (int i = 0; i < humans.length; i++) {
            if (humans[i].isAdult()) {
                adults++;
            } else {
                minors++;
            }
        }

        System.out.println("% de personas mayores de edad: "
                + (adults / humans.length * 100) + "%."
                + "\n% de personas menores de edad: "
                + (minors / humans.length * 100) + "%."
        );
    }
}
