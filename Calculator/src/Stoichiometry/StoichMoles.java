package Stoichiometry;

import Setup.StoichiometrySetup;

public class StoichMoles extends StoichiometrySetup {
    public void go () {
        System.out.println("\n\nWhat is the name of the substance you are STARTING AT?\n");
        sub1 = scanner.next();
        System.out.println("\n\nPlease enter the coefficient for this substance now.\n");
        sub1coe = scanner.nextDouble();
        System.out.println("\n\nFinally, enter the number of moles.\n");
        sub1mol = scanner.nextDouble();
        System.out.println("\n\nNow enter the name of the substance you are GETTING TO.\n");
        sub2 = scanner.next();
        System.out.println("\n\nPlease enter the coefficient for this substance now.\n");
        sub2coe = scanner.nextDouble();
        sub2mol = (sub1mol * (sub2coe / sub1coe));
        System.out.println("\n\n" + sub1mol + " mole(s) of " + sub1 + " corresponds to " + sub2mol + " mole(s) of " + sub2 + ".\n");
    }
}