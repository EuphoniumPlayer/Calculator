package Stoichiometry;

import Setup.StoichiometrySetup;

public class StoichMass extends StoichiometrySetup {
    public void go () {
        System.out.println("\n\nSelect the operation\n\n1. Mass-Mole\n2. Mass-Mass\n");
        while (forgive) {
            type = scanner.nextInt();
            switch (type) {
                case 1:
                    // mass mole
                    forgive = false;
                    System.out.println("\nSelect the order\n\n1. Mass --> Mole\n2. Mole --> Mass\n");
                    while (forgive2) {
                        order = scanner.nextInt();
                        switch (order) {
                            case 1:
                                // mass to mole
                                forgive2 = false;
                                System.out.println("\nEnter the mass in grams of the starting substance, followed by its molar mass in grams/mole\n");
                                startmass = scanner.nextDouble();
                                startmm = scanner.nextDouble();
                                System.out.println("\nEnter the coefficent of the starting substance, then the coefficent of the ending subtance\n");
                                startcoe = scanner.nextDouble();
                                endcoe = scanner.nextDouble();
                                startmol = (startmass / startmm);
                                endmol = (startmol * (endcoe / startcoe));
                                System.out.println("\n" + endmol + " moles\n");
                                break;
                            case 2:
                                // mass to mass
                                forgive2 = false;
                                System.out.println("\nEnter the number of moles of the starting substance, then its coefficent\n");
                                startmol = scanner.nextDouble();
                                startcoe = scanner.nextDouble();
                                System.out.println("\nEnter the molar mass in grams/mole of the ending substance, followed by its coefficent\n");
                                endmm = scanner.nextDouble();
                                endcoe = scanner.nextDouble();
                                endmol = (startmol * (endcoe / startcoe));
                                endmass = (endmol * endmm);
                                System.out.println("\n" + endmass + " grams\n");
                                break;
                            default:
                                // invalid
                                forgive2 = true;
                                System.out.println("\nInvalid\n");
                                break;
                        }
                    }
                    break;
                case 2: 
                    // mass mass
                    forgive = false;
                    System.out.println("\nEnter the mass of the starting substance in grams, followed by its molar mass in grams/mole, followed by its coefficent\n");
                    startmass = scanner.nextDouble();
                    startmm = scanner.nextDouble();
                    startcoe = scanner.nextDouble();
                    System.out.println("\nEnter the molar mass of the ending substance in grams/mole, followed bu its coefficent\n");
                    endmm = scanner.nextDouble();
                    endcoe = scanner.nextDouble();
                    endmass = (((startmass / startmm) * (endcoe / startcoe)) * endmm);
                    System.out.println("\n" + endmass + " grams\n");
                    break;
                default:
                    // invalid
                    System.out.println("\n\nInvalid\n");
                    forgive = true;
                    break;
            }
        }
    }
}