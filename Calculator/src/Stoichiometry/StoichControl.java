package Stoichiometry;

import Tools.Universal;

public class StoichControl extends Universal {

    private static int select;
    private static final StoichMoles moles = new StoichMoles();
    private static final StoichParts parts = new StoichParts();

    public void begin () {
        System.out.println("\n\nAvalible Operations: \n\n1. Mole/Moles\n2.Mole/particles\n3. Mole/Mass\n4. Mass/Particles\n");
        while (forgive) {
            select = scanner.nextInt();
            switch (select) {
                case 1: 
                    forgive = false;
                    moles.go();
                    break;
                case 2:
                    forgive = false;
                    parts.go();
                    break;
                default:
                    // invalid
                    System.out.println("\n\nInvalid operation.\n");
                    forgive = true;
                    break;
            }
        }
    }
}