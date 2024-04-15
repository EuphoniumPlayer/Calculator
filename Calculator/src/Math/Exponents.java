package Math;

import Setup.CalculatorSetup;

public class Exponents extends CalculatorSetup {
    public void run () {
        System.out.println("\n\nEnter the number that is the base\n");
        x = scanner.nextDouble();
        System.out.println("\n\nEnter the power that the base is raised to\n");
        y = scanner.nextDouble();
        z = Math.pow(x, y);
        System.out.println("\n\n" + z);
    }
}
