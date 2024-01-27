import java.util.Scanner;

public class CalculatorControl {
	
	Scanner scanner = new Scanner(System.in);
	Addition add = new Addition();
	Subtraction sub = new Subtraction();
	Multiplication mul = new Multiplication();
	Division div = new Division();
	static double forgive = 1;
	
	void begin () {
		System.out.println("What operation would you like to do?\n\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
		while (forgive == 1) {
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				forgive = 0;
				System.out.println("Addition Selected\n");
				add.run();
				break;
			case 2:
				forgive = 0;
				System.out.println("Subtraction Selected\n");
				sub.run();
				break;
			case 3:
				forgive = 0;
				System.out.println("Multiplication Selected\n");
				mul.run();
				break;
			case 4:
				forgive = 0;
				System.out.println("Division Selected\n");
				div.run();
				break;
			default:
					forgive = 1;
					System.out.println("\n\nOperation does not exist, please try again. \n");
				break;
			}
		}
	}
	
}
