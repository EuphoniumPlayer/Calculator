import java.util.Scanner;

public class Mole_Mass extends MoleSetup {

    static Scanner scanner = new Scanner(System.in);

    void run () {
        System.out.println("\n\nWhich would you like to do?\n\n1. Moles to mass\n2. Mass to Moles\n");
        while (forgive == 1) {
            action = scanner.nextInt();
            switch (action) {
            case 1:
                forgive = 0;
                System.out.println("\n\nInput number of moles\n");
                moles = scanner.nextDouble();
                System.out.println("\nInput Molar Mass\n");
                molarmass = scanner.nextDouble();
                mass = (molarmass / moles);
                System.out.println(mass + "\n\nAgain? Y/N\n");
                cont = scanner.next();
                while (cont.equals("Y") | cont.equals("y")) {
                    System.out.println("\nInput number of moles\n");
                    moles = scanner.nextDouble();
                    System.out.println("\nInput Molar Mass\n");
                    molarmass = scanner.nextDouble();
                    mass = (molarmass / moles);
                    System.out.println(mass + "\n\nAgain? Y/N");
                    cont = scanner.next();
                }
                break;
            case 2:
                forgive = 0;
                System.out.println("\nInput the mass in GRAMS\n");
                mass = scanner.nextDouble();
                System.out.println("\nInput the Molar Mass\n");
                molarmass = scanner.nextDouble();
                moles = (molarmass / mass);
                System.out.println(moles + "\n\nAgain? Y/N\n");
                cont = scanner.next();
                while (cont.equals("Y") | cont.equals("N")) {
                    System.out.println("\n\nInput the mass in GRAMS\n");
                    mass = scanner.nextDouble();
                    System.out.println("Input the Molar Mass");
                    molarmass = scanner.nextDouble();
                    moles = (molarmass / mass);
                    System.out.println(moles + "\n\nAgain? Y/N\n");
                    cont = scanner.next();
                }
                break;
            default:
                System.out.println("Unknown command, please try again");
                forgive = 1;
                break;
            }
        }
    }
}
