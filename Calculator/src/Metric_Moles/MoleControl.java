package Metric_Moles;

import Tools.Universal;
import Metric_Moles.Moles.MassMolec;
import Metric_Moles.Moles.Mole_Mass;
import Metric_Moles.Moles.Mole_Molec;

public class MoleControl extends Universal {

    private static final Mole_Mass molemass = new Mole_Mass();
    private static final Mole_Molec molemolec = new Mole_Molec();
    private static final MassMolec massmolec = new MassMolec();

    public void begin () {
        System.out.println("Choices: \n\n1. Mole/mass\n2. Mole/molecules/particles\n3. Mass/particles\n");
        while (forgive) {
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    forgive = false;
                    System.out.println("Initializing...\n\n");
                    molemass.run();
                    break;
                case 2:
                    forgive = false;
                    System.out.println("Initializing...\n\n");
                    molemolec.run();
                    break;
                case 3:
                    forgive = false;
                    System.out.println("Initializing...\n\n");
                    massmolec.run();
                    break;
                default:
                    System.out.println("Unknown Operation. Please try again.\n");
                    forgive = true;
                    break;
            }
        }
    }
}