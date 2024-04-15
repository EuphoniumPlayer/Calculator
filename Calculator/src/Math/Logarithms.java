package Math;

import Setup.CalculatorSetup;

public class Logarithms extends CalculatorSetup {
    int type;
    public void run () {
        System.out.println("\n\nSelect the type of logaritm\n\n1. Common\n2. Natural\n3. Custom\n");
        while (forgive) {
            type = scanner.nextInt();
            switch (type) {
                case 1:
                    forgive = false;
                    System.out.println("\n\nEnter the value\n");
                    x = scanner.nextDouble();
                    z = Math.log(x);
                    System.out.println("\n\n" + z);
                    break;
                case 2:
                    forgive = false;
                    System.out.println("\n\nEnter the value\n");
                    x = scanner.nextDouble();
                    z = (Math.log(x) / Math.log(Math.E));
                    System.out.println("\n\n" + z);
                    break;
                case 3:
                    forgive = false;
                    System.out.println("\n\nEnter the base value\n");
                    y = scanner.nextDouble();
                    System.out.println("\n\nNow enter the value in place of x in log_" + y + "(x)\n");
                    x = scanner.nextDouble();
                    z = (Math.log(x) / Math.log(y));
                    System.out.println("\n\n" + z);
                    break;
                default:
                    forgive = true;
                    System.out.println("\n\nYour input was invalid, please try again\n");
                    break;
            }
        }
    }
}
