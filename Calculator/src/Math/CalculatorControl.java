package Math;

import java.util.Scanner;
import Setup.EasterEggs;

public class CalculatorControl {
	
	static Scanner scanner = new Scanner(System.in);
	static Addition add = new Addition();
	static Subtraction sub = new Subtraction();
	static Multiplication mul = new Multiplication();
	static Division div = new Division();
	static boolean forgive = true;
	static EasterEggs ee = new EasterEggs();
	static int dirtymeter = 0;
	
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