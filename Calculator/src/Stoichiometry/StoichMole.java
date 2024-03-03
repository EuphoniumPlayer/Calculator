package Stoichiometry;

import Setup.StoichiometrySetup;

public class StoichMole extends StoichiometrySetup {

    public void molemole () {
        while (forgive == 1) {
            System.out.println("\nHow many reactants?\n");
            numreact = scanner.nextInt();
            System.out.println("\nHow many products?\n");
            numprod = scanner.nextInt();
            switch (numreact) {
                case 1:
                    switch (numprod) {
                        case 1:
                            // 1 reactant one product
                            System.out.println("\nNo Reaction\n");
                            forgive = 0;
                            break;
                        case 2:
                            // 1 reactant, 2 products
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
                                        // get to the reactant from a product
                                        forgive2 = 0;
                                        System.out.println("\nWhich product would you like to start with, " + prod1 + " (1), or " + prod2 + " (2)?\n");
                                        while (forgive3 == 1) {
                                            start_at = scanner.nextInt();
                                            switch (start_at) {
                                                case 1:
                                                    // start with product 1 and get to reactant
                                                    forgive3 = 0;
                                                    System.out.println("\nEnter the number of moles of " + prod1 + " you need/have.\n");
                                                    prod1mol = scanner.nextDouble();
                                                    re1mol = (prod1mol * (re1coe/prod1coe));
                                                    System.out.println("\n\n" + prod1mol + " mole(s) of " + prod1 + " makes/requires " + re1mol + " mole(s) of " + re1 + ".");
                                                    break;
                                                case 2:
                                                    // start with product 2 and get to reactant
                                                    forgive3 = 0;
                                                    System.out.println("\nEnter the number of moles of " + prod2 + "you need/have.\n");
                                                    prod2mol = scanner.nextDouble();
                                                    re1mol = (prod2mol * (re1coe/prod2coe));
                                                    System.out.println("\n\n" + prod2mol + " mole(s) of " + prod2 + ", " + re1mol + " moles of " + re1 + ".");
                                                    break;
                                                default:
                                                    //invalid substance
                                                    forgive3 = 1;
                                                    System.out.println("Invalid substance. Please enter a valid number");
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        // get to product 1
                                        forgive2 = 0;
                                        System.out.println("\nWould you like to start with " + re1 + " (1) or " + prod2 + " (2)?\n");
                                        while (forgive3 == 1) {
                                            start_at = scanner.nextInt();
                                            switch (start_at) {
                                                case 1:
                                                    // get to product 1 from the reactant
                                                    forgive3 = 0;
                                                    System.out.println("\nHow many moles of " + re1 + " are avalible/required?\n");
                                                    re1mol = scanner.nextDouble();
                                                    prod1mol = (re1mol * (prod1coe / re1coe));
                                                    System.out.println("\n\n" + re1mol + " mole(s) of " + re1 + " makes/requires " + prod1mol + " mole(s) of " + prod1 + ".");
                                                    break;
                                                case 2:
                                                    // get to product 1 from product 2
                                                    forgive3 = 0;
                                                    System.out.println("\nHow many moles of " + prod2 + " are avalible/required?\n");
                                                    prod2mol = scanner.nextDouble();
                                                    prod1mol = (prod2mol * (prod1coe / prod2coe));
                                                    System.out.println("\n\n" + prod2mol + " mole(s) of " + prod2 + " makes/requires " + prod1mol + " mole(s) of " + prod1 + ".");
                                                    break; 
                                                default:
                                                    //invalid substance
                                                    forgive3 = 1;
                                                    System.out.println("Invalid substance. Please enter a valid number");
                                                    break;
                                            }
                                        }
                                        break;
                                    case 3:
                                        // get to product 2
                                        forgive2 = 0;
                                        System.out.println("Would you like to start with the amount of " + re1 + " (1) or " + prod1 + " (2) you need/have?");
                                        while (forgive3 == 1) {
                                            start_at = scanner.nextInt();
                                            switch (start_at) {
                                                case 1: 
                                                    // get to prod2 from re1
                                                    forgive3 = 0;
                                                    System.out.println("\nHow many moles of " + re1 + " are avalible?\n");
                                                    re1mol = scanner.nextDouble();
                                                    prod2mol = (re1mol * (prod2coe / re1coe));
                                                    System.out.println("\n\n" + re1mol + " mole(s) of " + re1 + " can produce/requires " + prod2mol + " mole(s) of " + prod2 + ".");
                                                    break;
                                                case 2: 
                                                    // get to prod2 from prod1
                                                    forgive3 = 0;
                                                    System.out.println("How many mole of " + prod1 + " are there?");
                                                    prod1mol = scanner.nextDouble();
                                                    prod2mol = (prod1mol * (prod2coe / prod1coe));
                                                    System.out.println("\n\n" + prod1mol + " mole(s) of " + prod1 + " can produce/requires " + prod2mol + " mole(s) of " + prod2 + ".");
                                                    break;
                                                default:
                                                    // something went wrong
                                                    forgive3 = 1;
                                                    System.out.println("\nSomething went wrong, please try again\n");
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        // Outside boundary or invalid input type
                                        forgive2 = 1;
                                        System.out.println("\nInvalid. Try again\n\n");
                                        break;
                                }
                            }
                            break;
                        case 3:
                            // 1 reactant, 3 products
                            forgive = 0;
                            System.out.println("\n\nEnter the name of the reactant (HIT ENTER AFTER) followed by it's coefficient (HIT ENTER AFTER).\n");
                            re1 = scanner.next();
                            re1coe = scanner.nextDouble();
                            System.out.println("\n\nEnter the name of the first product (HIT ENTER AFTER) followed by it's coefficient (HIT ENTER AFTER).\n");
                            prod1 = scanner.next();
                            prod1coe = scanner.nextDouble();
                            System.out.println("\n\nRepeat the previous steps for the second product.\n");
                            prod2 = scanner.next();
                            prod2coe = scanner.nextDouble();
                            System.out.println("\n\nAnd the third.\n");
                            prod3 = scanner.next();
                            prod3coe = scanner.nextDouble();
                            System.out.println("\n\nWhich substance would you like to GET TO, " + re1 + " (1), " + prod1 + " (2), " + prod2 + " (3), or " + prod3 + " (4)?\n");
                            while (forgive2 == 1) {
                                get_to = scanner.nextInt();
                                switch (get_to) {
                                    case 1:
                                        // get to the reactant
                                        forgive2 = 0;
                                        System.out.println("\n\nWhere do you want to start, " + prod1 + " (1), " + prod2 + " (2), " + prod3 + " (3)?\n");
                                        while (forgive3 == 1) {
                                            start_at = scanner.nextInt();
                                            switch (start_at) {
                                                case 1:
                                                    // start with product 1 get to reactant
                                                    forgive3 = 0;
                                                    System.out.println("\n\nHow many moles of " + prod1 + " are avalible/required?\n");
                                                    prod1mol = scanner.nextDouble();
                                                    re1mol = (prod1mol * (re1coe / prod1coe));
                                                    System.out.println("\n\n" + prod1mol + " mole(s) of " + prod1 + " makes/requires " + re1mol + " mole(s) of " + re1 + ".\n");
                                                    break;
                                                case 2:
                                                    // start with product 2 get to reactant
                                                    forgive3 = 0;
                                                    System.out.println("\n\nHow many moles of " + prod2 + " are avalible/required?\n");
                                                    prod2mol = scanner.nextDouble();
                                                    re1mol = (prod2mol * (re1coe / prod2coe));
                                                    System.out.println("\n\n" + prod2mol + " mole(s) of " + prod2 + " makes/requires " + re1mol + " mole(s) of " + re1 + ".\n");
                                                    break;
                                                case 3:
                                                    // start with product 3 get to reactant
                                                    forgive3 = 0;
                                                    System.out.println("\n\nHow many moles of " + prod3 + " are avalible/required?\n");
                                                    prod3mol = scanner.nextDouble();
                                                    re1mol = (prod3mol * (re1coe / prod3coe));
                                                    System.out.println("\n\n" + prod3mol + " mole(s) of " + prod3 + " makes/requires " + re1mol + " mole(s) of " + re1 + ".\n");
                                                    break;
                                                default:
                                                    // something went wrong
                                                    forgive3 = 1;
                                                    System.out.println("\nSomething went wrong, please try again");
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        // get to product 1
                                        forgive2 = 0;
                                        System.out.println("\n\nWhere do you want to start, " + re1 + " (1), " + prod2 + " (2), or " + prod3 + " (3)?\n");
                                        while (forgive3 == 1) {
                                            start_at = scanner.nextInt();
                                            switch (start_at) {
                                                case 1:
                                                    // start with reactant get to prod 1
                                                    forgive3 = 0;
                                                    System.out.println("\n\nHow many moles of " + re1 + " are there?\n");
                                                    re1mol = scanner.nextDouble();
                                                    prod1mol = (re1mol * (prod1coe / re1coe));
                                                    System.out.println("\n\n" + re1mol + " mole(s) of " + re1 + " makes " + prod1mol + " mole(s) of " + prod1 + ".\n");
                                                    break;
                                                case 2:
                                                    // start with product 2 get to prod 1
                                                    forgive3 = 0;
                                                    System.out.println("\n\nHow many moles of " + prod2 + " are there?\n");
                                                    prod2mol = scanner.nextDouble();
                                                    prod1mol = (prod2mol * (prod1coe / prod2coe));
                                                    System.out.println("\n\n" + prod2mol + " mole(s) of " + prod2 + " accompanies " + prod2mol + " mole(s) of " + re1 + ".\n");
                                                    break;
                                                case 3:
                                                    // start with product 3 get to product 1
                                                    forgive3 = 0;
                                                    System.out.println("\n\nHow many moles of " + prod3 + " are there?\n");
                                                    prod3mol = scanner.nextDouble();
                                                    prod1mol = (prod3mol * (prod1coe / prod3coe));
                                                    System.out.println("\n\n" + prod3mol + " mole(s) of " + prod3 + " accompanies " + re1mol + " mole(s) of " + re1 + ".\n");
                                                    break;
                                                default:
                                                    // something went wrong
                                                    forgive3 = 1;
                                                    System.out.println("\nSomething went wrong, please try again");
                                                    break;

                                            }
                                        }
                                        break;
                                    case 3:
                                        // get to product 2
                                        forgive2 = 0;
                                        System.out.println("\n\nWhere do you want to start, " + re1 + " (1), " + prod1 + " (2), or " + prod3 + " (3)?\n");
                                        while (forgive3 == 1) {
                                            start_at = scanner.nextInt();
                                            switch (start_at) {
                                                case 1:
                                                    // start with reactant 1 get to product 2
                                                    forgive3 = 0;
                                                    System.out.println("\n\nHow many moles of " + re1 + " are avalible/required?\n");
                                                    re1mol = scanner.nextDouble();
                                                    prod2mol = (re1mol * (prod2coe / re1coe));
                                                    System.out.println("\n\n" + re1mol + " mole(s) of " + re1 + " makes/requires " + prod2mol + " mole(s) of " + prod2 + ".\n");
                                                    break;
                                                case 2:
                                                    // start with product 1 get to product 2
                                                    forgive3 = 0;
                                                    System.out.println("\n\nHow many moles of " + prod1 + " are avalible/required?\n");
                                                    prod1mol = scanner.nextDouble();
                                                    prod2mol = (prod1mol * (prod2coe / prod1coe));
                                                    System.out.println("\n\n" + prod1mol + " mole(s) of " + prod1 + " makes/requires " + prod2mol + " mole(s) of " + prod2 + ".\n");
                                                    break;
                                                case 3:
                                                    // start with product 3 get to product 2
                                                    forgive3 = 0;
                                                    System.out.println("\n\nHow many moles of " + prod3 + " are avalible/required?\n");
                                                    prod3mol = scanner.nextDouble();
                                                    prod2mol = (prod3mol * (prod2coe / prod3coe));
                                                    System.out.println("\n\n" + prod3mol + " mole(s) of " + prod3 + " makes/requires " + prod2mol + " mole(s) of " + prod2 + ".\n");
                                                    break;
                                                default:
                                                    // something went wrong
                                                    forgive3 = 1;
                                                    System.out.println("\nSomething went wrong, please try again");
                                                    break;

                                            }
                                        }
                                        break;
                                    case 4:
                                        // get to product 3
                                        forgive2 = 0;
                                        System.out.println("\n\nWhere do you want to start, " + re1 + " (1), " + prod2 + " (2), or " + prod3 + " (3)?\n");
                                        while (forgive3 == 1) {
                                            start_at = scanner.nextInt();
                                            switch (start_at) {
                                                case 1:
                                                    // start with reactant 1 get to product 3
                                                    forgive3 = 0;
                                                    System.out.println("\n\nHow many moles of " + re1 + " are avalible/required?\n");
                                                    re1mol = scanner.nextDouble();
                                                    prod3mol = (re1mol * (prod3coe / re1coe));
                                                    System.out.println("\n\n" + re1mol + " mole(s) of " + re1 + " makes/requires " + prod3mol + " mole(s) of " + prod3 + ".\n");
                                                    break;
                                                case 2:
                                                    // start with product 1 get to product 3
                                                    forgive3 = 0;
                                                    System.out.println("\n\nHow many moles of " + prod1 + " are avalible/required?\n");
                                                    prod1mol = scanner.nextDouble();
                                                    prod3mol = (prod1mol * (prod3coe / prod1coe));
                                                    System.out.println("\n\n" + prod1mol + " mole(s) of " + prod1 + " makes/requires " + prod3mol + " mole(s) of " + prod3 + ".\n");
                                                    break;
                                                case 3:
                                                    // start with product 2 get to product 3
                                                    forgive3 = 0;
                                                    System.out.println("\n\nHow many moles of " + prod2 + " are avalible/required?\n");
                                                    prod2mol = scanner.nextDouble();
                                                    prod3mol = (prod2mol * (prod3coe / prod2coe));
                                                    System.out.println("\n\n" + prod2mol + " mole(s) of " + prod2 + " makes/requires " + prod3mol + " mole(s) of " + prod3 + ".\n");
                                                    break;
                                                default:
                                                    // something went wrong
                                                    forgive3 = 1;
                                                    System.out.println("\nSomething went wrong, please try again");
                                                    break;

                                            }
                                        }
                                        break;
                                    default:
                                        // invalid
                                        forgive2 = 1;
                                        System.out.println("\n\nSomething went wrong. Please try again");
                                        break;
                                }
                            }
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