import java.util.Scanner;

public class MoleControl {

    static Scanner scanner = new Scanner(System.in);
    static Mole_Mass molemass = new Mole_Mass();
    static Mole_Molec molemolec = new Mole_Molec();

    void begin () {

        System.out.println("Choices: \n\n1. Mole to/from Mass\n2. Mole to/from number of molecules/particles\n\n");
        int action = scanner.nextInt();

        switch (action) {
            case 1:
                System.out.println("Initializing...\n\n\n");
                molemass.run();
                break;
            case 2:
                System.out.println("Initializing... \n\n\n");
                molemolec.run();
                break;
        }
        
    }

}
