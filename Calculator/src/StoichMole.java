import java.util.Scanner;

public class StoichMole extends StoichiometrySetup {

    static Scanner scanner = new Scanner(System.in);

    void molemole () {
        while (forgive == 1) {
            System.out.println("\nHow many reactants?\n");
            numreact = scanner.nextInt();
            System.out.println("\nHow many products?\n");
            numprod = scanner.nextInt();
            switch (numreact) {
                case 1:
                    switch (numprod) {
                        case 1:
                            System.out.println("\nNo Reaction\n");
                            forgive = 0;
                            break;
                        case 2:
                            forgive = 0;
                            System.out.println("\n\nIMPORTANT: DO NOT INCLUDE SPACES IN THE SUBSTANCE NAMES\n\n");
                            System.out.println("\n\nEnter the name of REACTANT 1 and press enter, followed by\nit's coefficient (press enter again)\n");
                            re1 = scanner.next();
                            re1coe = scanner.nextDouble();
                            System.out.println("\n\nEnter the name of PRODUCT 1 and press enter, followed by\nit's coefficient (press enter again)\n");
                            prod1 = scanner.next();
                            prod1coe = scanner.nextDouble();
                            System.out.println("\n\nEnter the name of PRODUCT 2 and press enter, followed by\nit's coefficient (press enter again)\n");
                            prod2 = scanner.next();
                            prod2coe = scanner.nextDouble();
                            System.out.println("\nWhich substance would you like to GET TO, " + re1 + " (1), " + prod1 + " (2), or " + prod2 + " (3)? Enter a number\n");
                            while (forgive2 == 1) {
                                get_to = scanner.nextInt();
                                switch (get_to) {
                                    case 1:
                                        // get to reactant
                                        forgive2 = 0;
                                        System.out.println("\nWhich product would you like to start with, " + prod1 + " (1), or " + prod2 + " (2)?\n");
                                        start_at = scanner.nextInt();
                                        switch (start_at) {
                                            case 1:
                                                // start with product 1
                                                System.out.println("\nEnter the number of moles of " + prod1 + " you need.\n");
                                                prod1mol = scanner.nextDouble();
                                                re1mol = (prod1mol * (re1coe/prod1coe));
                                                System.out.println("\n\nTo make " + prod1mol + " moles of " + prod1 + ", " + re1mol + " moles of " + re1 + " are required.");
                                                break;
                                            case 2:
                                                // start with product 2
                                                System.out.println("\nEnter the number of moles of " + prod2 + "you need.\n");
                                                prod2mol = scanner.nextDouble();
                                                re1mol = (prod2mol * (re1coe/prod2coe));
                                                System.out.println("\n\nTo make " + prod2mol + " moles of " + prod2 + ", " + re1mol + " moles of " + re1 + " are required.");
                                                break;
                                            default:
                                                //invalid substance
                                                forgive2 = 1;
                                                System.out.println("Invalid substance. Please enter a valid number");
                                                break;
                                        }
                                        break;
                                    case 2:
                                        // get to substance 2
                                        forgive = 0;
                                        System.out.println("Under construction");
                                        break;
                                    case 3:
                                        // get to substance 3
                                        forgive = 0;
                                        System.out.println("Under construction");
                                        break;
                                    default:
                                        forgive2 = 1;
                                        System.out.println("\nInvalid. Try again\n\n");
                                        break;
                                }
                            }
                            break;
                        case 3:
                            // 1 reactant, 3 products
                            forgive = 0;
                            System.out.println("Under construction");
                            break;
                        default:
                            // invalid number of products
                            System.out.println("\nToo many or invalid. Enter your values again\n");
                            forgive = 1;
                            break;
                    }
                    break;
                case 2:
                    // 2 reactants
                    switch (numprod) {
                        case 1:
                            // 2 reactants, 1 product
                            forgive = 0;
                            break;
                        case 2:
                            // 2 reactants, 2 products
                            forgive = 0;
                            break;
                        case 3:
                            // 2 reactants, 3 products
                            forgive = 0;
                            break;
                        default:
                            // invalid number of products
                            System.out.println("\nToo many or invalid. Enter your values again\n");
                            forgive = 1;
                            break;
                    }
                    break;
                case 3:
                    // 3 reactants
                    switch (numprod) {
                        case 1:
                            // 3 reactants, 1 product
                            forgive = 0;
                            break;
                        case 2:
                            // 3 reactants, 2 products
                            forgive = 0;
                            break;
                        case 3:
                            // 3 reactants, 3 products
                            forgive = 0;
                            break;
                        default:
                            // invalid number of products
                            System.out.println("\nToo many or invalid. Enter your values again\n");
                            forgive = 1;
                            break;
                    }
                    break;
                default:
                    // invalid number of reactants
                    System.out.println("\nToo many or invalid. Enter your values again\n");
                    forgive = 1;
                    break;
            }
        }
    }
}
                            