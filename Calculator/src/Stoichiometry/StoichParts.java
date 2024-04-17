package Stoichiometry;

import Setup.StoichiometrySetup;

public class StoichParts extends StoichiometrySetup{
    private static final double particles = Math.pow(6.02, 23);
    public void go () {
        System.out.println("\n\nMake a selection\n\n1. Particles to Moles\n2. Particles to Particles\n");
        while (forgive) {
            type = scanner.nextInt();
            switch (type) {
                case 1:
                    // particles/moles
                    forgive = false;
                    System.out.println("\n\nIs the starting substance in\n\n1. Moles\nor\n2. Particles\n");
                    while (forgive2) {
                        order = scanner.nextInt();
                        switch (order) {
                            case 1:
                                // starting substance in particles, going to moles
                                forgive2 = false;
                                System.out.println("\n\nHow many particles of the substance are there (enter the number in standard form, scientific form\ndoes not work)?");
                                startparts = scanner.nextDouble();
                                System.out.println("\n\nEnter the coefficent of the first substance, followed by the second substance's coefficient.\n");
                                startcoe = scanner.nextDouble();
                                endcoe = scanner.nextDouble();
                                startmol = (startparts / particles);
                                endmol = (startmol * (endcoe / startcoe));
                                System.out.println("\n\n" + endmol + " moles");
                                break;
                            case 2: 
                                // starting substance in moles, going to particles
                                forgive2 = false;
                                System.out.println("\n\nHow many moles of the substance are there?\n");
                                startmol = scanner.nextDouble();
                                System.out.println("\n\nEnter the coefficent of the first substance, followed by the second substance's coefficent.\n");
                                startcoe = scanner.nextDouble();
                                endcoe = scanner.nextDouble();
                                endmol = (startmol * (endcoe / startcoe));
                                endparts = (endmol * particles);
                                System.out.println("\n\n" + endparts + " particles");
                                break;
                            default:
                                // invalid
                                forgive2 = true;
                                System.out.println("\n\nInvalid\n");
                                break;
                        }
                    }
                    break;
                case 2:
                    // particles to particles
                    forgive = false;
                    System.out.println("\n\nEnter the coefficent of the starting substance, and then the number of particles written in standard form (scientific\nform does NOT work)\n");
                    startcoe = scanner.nextDouble();
                    startparts = scanner.nextDouble();
                    System.out.println("\n\nNow the coefficent of the ending substance.\n");
                    endcoe = scanner.nextDouble();
                    startmol = (startparts / particles);
                    endmol = (startmol * (endcoe / startcoe));
                    endparts = (endmol * particles);
                    System.out.println("\n\n~ " + endparts + " particles\n");
                    break;
                default:
                    // invalid
                    forgive = true;
                    System.out.println("\n\nInvalid\n");
                    break;
            }
        }
    }
}