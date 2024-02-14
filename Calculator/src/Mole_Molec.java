import java.util.Scanner;

public class Mole_Molec extends MoleSetup {

    static Scanner scanner = new Scanner(System.in);
    static double particles = (6.02 * Math.pow(10, 23));

    void run () {
        System.out.println("Choose one of the following:\n\n1. Moles to number of molecules/particles\n2. Molecules/particles to Moles\n\n");
        int action = scanner.nextInt();
        while (forgive == 1) {
            switch (action) {
            case 1:
                forgive = 0;
                System.out.println("\nInput number of Moles");
                input = scanner.nextDouble();
                molecs = Math.round(input * particles);
                System.out.println(molecs + "\n\nAgain? Y/N");
                cont = scanner.next();
                while (cont.equals("Y") | cont.equals("y")) {
                    System.out.println("Input number of Moles");
                    input = scanner.nextDouble();
                    molecs = Math.round(input * particles);
                    System.out.println(molecs + "\n\nAgain? Y/N");
                    cont = scanner.next();
                }
                break;
            case 2:
                forgive = 0;
                System.out.println("Input number of molecules/particles");
                input = scanner.nextDouble();
                moles = Math.round(input / particles);
                System.out.println(moles + "Again? Y/N");
                cont = scanner.next();
                while (cont.equals("Y") | cont.equals("y")) {
                    System.out.println("Input number of molecules/particles");
                    input = scanner.nextDouble();
                    moles = Math.round(input / particles);
                    System.out.println(moles + "Again? Y/N");
                    cont = scanner.next();
                }
                break;
            default:
                System.out.println("Unknown Command, please try again");
                forgive = 1;
                break;
            }
        }

    }
}
