package Stoichiometry;
import java.util.Scanner;

public class StoichiometryControl {

    static StoichMole sm = new StoichMole();
    static int forgive = 1;
    static Scanner scanner = new Scanner(System.in);
    static int operation;

    public void begin() {
        System.out.println("\n\nWARNING: THE OUTPUTS OF THIS PARTICULAR PROGRAM ARE \nSUBJECT TO AN INCREASED RISK OF ERROR. IT IS STRONGLY\nADVISED YOU VERIFY THE OUTPUT BY HAND.\n\n");
        System.out.println("What would you like to do?\n1. Mole/Mole\n2. Mass/Mole\n3. Particles/Mole\n4. Mass/Mass\n5. Mass/Particles\nNote: this program is limited to 3 substances per side of the reaction\n");
        while (forgive == 1) {
            operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    forgive = 0;
                    sm.molemole();
                    break;
                case 2:
                    forgive = 0;
                    System.out.println("Under construction. Unknown Completion Date");
                    break;
                case 3:
                    forgive = 0;
                    System.out.println("Under construction. Unknown Completion Date");
                    break;
                case 4:
                    forgive = 0;
                    System.out.println("Under construction. Unknown Completion Date");
                    break;
                case 5:
                    forgive = 0;
                    System.out.println("Under construction. Unknown Completion Date");
                    break;
                default:
                    forgive = 1;
                    System.out.println("Unknown Command. Please try again");
                    break;
            }
        }
    }
}