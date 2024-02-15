import java.util.Scanner;

public class MoleControl {

    static Scanner scanner = new Scanner(System.in);
    static Mole_Mass molemass = new Mole_Mass();
    static Mole_Molec molemolec = new Mole_Molec();
    static MassMolec massmolec = new MassMolec();
    static int forgive = 1;

    void begin () {
        System.out.println("Choices: \n\n1. Mole/mass\n2. Mole/molecules/particles\n3. Mass/particles\n");
        while (forgive == 1) {
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    forgive = 0;
                    System.out.println("Initializing...\n\n");
                    molemass.run();
                    break;
                case 2:
                    forgive = 0;
                    System.out.println("Initializing...\n\n");
                    molemolec.run();
                    break;
                case 3:
                    forgive = 1; 
                    //forgive = 0;
                    //System.out.println("Initializing...\n\n");
                    //massmolec.run();
                    break;
                default:
                    System.out.println("Unknown Operation. Please try again.\n");
                    forgive = 1;
                    break;
            }
        }
    }
}
