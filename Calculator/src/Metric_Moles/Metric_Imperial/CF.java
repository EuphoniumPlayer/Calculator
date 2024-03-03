package Metric_Moles.Metric_Imperial;

import Setup.ConversionSetup;

public class CF extends ConversionSetup {
	public void start () {	
		System.out.println("\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");
		while (forgive == 1) {	
			order = scanner.nextInt();
			switch (order) {
			case 1:
				System.out.println("Input Celsius");
				input = scanner.nextDouble();
				rslt = ((input * 9) / 5) + 32;
				System.out.println("\n" + rslt + " F");
				forgive = 0;
				break;
			case 2:
				System.out.println("Input Fahrenheit");
				input = scanner.nextDouble();
				rslt = ((input - 32) * 5) / 9;
				System.out.println("\n" + rslt + " C");
				forgive = 0;
				break;
			case 69:
				ee.dirty();
				forgive = 1;
				break;
			default:
				System.out.println("Invalid command. Please choose a valid command. \n");
				forgive = 1;
				break;
			}
		}
	}	
}