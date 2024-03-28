package Tools;

import java.util.Random;

public class EasterEggs {

    private static Random random = new Random();
    private static double probability;

    public void cknfngr () {
        System.out.println("\n\n\nEAT MORE CHICKEN\n\n\n");
    }
    public void woof () {
        System.out.println("\n\n\nWOOF WOOF!\n\n\n");
    }
    public void dirty () {
        System.out.println("\n\n\nGet your head out of the gutter\n\n\n");
    }
    public void dumb () {
        probability = 0.2;
        if (random.nextDouble() <= probability) {
            System.out.println("\n\n\nSometimes I can't help but look out my window at the world,\nand just wonder about some people...\n");
        }
    }
}