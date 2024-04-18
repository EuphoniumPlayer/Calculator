package Stoichiometry;

import Setup.StoichiometrySetup;

public class StoichMoles extends StoichiometrySetup {
    public void go () {
        System.out.println("\nWhat is the name of the substance you are STARTING AT?\n");
        start = scanner.next();
        System.out.println("\nPlease enter the coefficient for this substance now.\n");
        startcoe = scanner.nextDouble();
        System.out.println("\nFinally, enter the number of moles.\n");
        startmol = scanner.nextDouble();
        System.out.println("\nNow enter the name of the substance you are GETTING TO.\n");
        end = scanner.next();
        System.out.println("\nPlease enter the coefficient for this substance now.\n");
        endcoe = scanner.nextDouble();
        endmol = (startmol * (endcoe / startcoe));
        System.out.println("\n" + startmol + " mole(s) of " + start + " corresponds to " + endmol + " mole(s) of " + end + ".\n");
    }
}