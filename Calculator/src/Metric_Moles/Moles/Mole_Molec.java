package Metric_Moles.Moles;

import Setup.MoleSetup;

public class Mole_Molec extends MoleSetup {

    static double particles = (6.02 * Math.pow(10, 23));

    public void run () {
        System.out.println("Choose one of the following:\n\n1. Moles to number of molecules/particles\n2. Molecules/particles to Moles\n\n");
        while (forgive) {
            action = scanner.nextInt();
            switch (action) {
            case 1:
                forgive = false;
                System.out.println("\nInput number of Moles\n");
                moles = scanner.nextDouble();
                molecs = (moles * particles);
                System.out.println(molecs + "\n\nAgain? Y/N");
                cont = scanner.next();
                while (cont.equals("Y") | cont.equals("y")) {
                    System.out.println("\nInput number of Moles\n");
                    moles = scanner.nextDouble();
                    molecs = (moles * particles);
                    System.out.println(molecs + "\n\nAgain? Y/N");
                    cont = scanner.next();
                }
                break;
            case 2:
                forgive = false;
                System.out.println("\nInput number of molecules/particles\n");
                molecs = scanner.nextDouble();
                moles = (molecs / particles);
                System.out.println(moles + "Again? Y/N");
                cont = scanner.next();
                while (cont.equals("Y") | cont.equals("y")) {
                    System.out.println("\nInput number of molecules/particles\n");
                    molecs = scanner.nextDouble();
                    moles = (molecs / particles);
                    System.out.println(moles + "Again? Y/N");
                    cont = scanner.next();
                }
                break;
            default:
                System.out.println("Unknown Command, please try again");
                forgive = true;
                break;
            }
        }

    }
}