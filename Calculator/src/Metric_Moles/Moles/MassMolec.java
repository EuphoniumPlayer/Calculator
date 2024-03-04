package Metric_Moles.Moles;

import Setup.MoleSetup;

public class MassMolec extends MoleSetup {
    
    static double particles = (6.02 * Math.pow(10, 23));
    
    public void run () {
        System.out.println("\nWhich would you like to do?\n\n1. Mass to Molecules/Particles\n2. Molecules/Particles to Mass\n");
        while (forgive) {
            action = scanner.nextInt();
            switch (action) {
            case 1:
                forgive = false;
                System.out.println("\nInput mass in grams\n");
                mass = scanner.nextDouble();
                System.out.println("\nInput Molar Mass");
                molarmass = scanner.nextDouble();
                moles = (mass / molarmass);
                molecs = (moles * particles);
                System.out.println(molecs + "\n\nAgain? Y/N\n");
                cont = scanner.next();
                while (cont.equals("Y") | cont.equals("y")) {
                    System.out.println("\nInput mass in grams\n");
                    mass = scanner.nextDouble();
                    System.out.println("\nInput Molar Mass");
                    molarmass = scanner.nextDouble();
                    moles = (mass / molarmass);
                    molecs = (moles * particles);
                    System.out.println(molecs + "\n\nAgain? Y/N\n");
                    cont = scanner.next();
                }
                break;
            case 2:
                forgive = false;
                System.out.println("\nInput number of particles/molecules");
                molecs = scanner.nextDouble();
                System.out.println("\nInput Molar Mass\n");
                molarmass = scanner.nextDouble();
                moles = (molecs / particles);
                mass = (moles * molarmass);
                System.out.println(mass + "\n\nAgain? Y/N");
                cont = scanner.next();
                while (cont.equals("Y") | cont.equals("y")){
                    System.out.println("\nInput number of particles/molecules");
                    molecs = scanner.nextDouble();
                    System.out.println("\nInput Molar Mass\n");
                    molarmass = scanner.nextDouble();
                    moles = (molecs / particles);
                    mass = (moles * molarmass);
                    System.out.println(mass + "\n\nAgain? Y/N");
                    cont = scanner.next();
                }
                break;
            default:
                System.out.println("\n\nUnknown Command. Please try again");
                forgive = true;
                break;
            }
        }
    }
}