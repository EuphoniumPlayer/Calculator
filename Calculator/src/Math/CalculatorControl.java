package Math;

import Tools.Universal;

public class CalculatorControl extends Universal {
	
	private static final Addition add = new Addition();
	private static final  Subtraction sub = new Subtraction();
	private static final Multiplication mul = new Multiplication();
	private static final Division div = new Division();
	private static int dirtymeter = 0;
	
	public void begin () {
		System.out.println("What operation would you like to do?\n\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
		while (forgive) {
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				forgive = false;
				System.out.println("Addition Selected\n");
				add.run();
				break;
			case 2:
				forgive = false;
				System.out.println("Subtraction Selected\n");
				sub.run();
				break;
			case 3:
				forgive = false;
				System.out.println("Multiplication Selected\n");
				mul.run();
				break;
			case 4:
				forgive = false;
				System.out.println("Division Selected\n");
				div.run();
				break;
			case 69:
				ee.dirty();
				if (dirtymeter > 4) {
					System.out.println("STAHP");
					dirtymeter = dirtymeter + 1;
				} else if (dirtymeter > 1) {
					System.out.println("You're dirty.");
					dirtymeter = dirtymeter + 1;
				} else {
					System.out.println("Now, try again. 1, 2, 3, or 4 (NOT 69)");
					dirtymeter = dirtymeter + 1;
				}
				forgive = true;
				break;
			default:
					forgive = true;
					System.out.println("\n\nOperation does not exist, please try again. \n");
					
				break;
			}
		}
	}
}