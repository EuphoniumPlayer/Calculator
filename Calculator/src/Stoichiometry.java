import java.util.Scanner;

public class Stoichiometry extends StoichiometrySetup {

    static Scanner scanner = new Scanner(System.in);
    static String operation;

    void begin() {
        System.out.println("\n\nWARNING: THE OUTPUTS OF THIS PARTICULAR PROGRAM ARE \nSUBJECT TO AN INCREASED RISK OF ERROR. IT IS STRONGLY\nADVISED YOU VERIFY THE OUTPUT BY HAND.\n\n");
        System.out.println("What would you like to do?\n\n1. Mole/Mole\n2. Mass/Mole\n3. Particles/Mole\n4. Mass/Mass\n5. Mass/Particles\n\n");
        while (forgive == 1) {
            operation = scanner.next();
            switch (operation) {
                default:
                    forgive = 1;
                    System.out.println("Unknown Command. Please try again");
                    break;
            }
        }
    }
}