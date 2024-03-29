package Metric_Moles.Metric_Imperial;

import Setup.ConversionSetup;

public class CF extends ConversionSetup {
	public void start () {	
		System.out.println("\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");
		while (forgive) {	
			order = scanner.nextInt();
			switch (order) {
			case 1:
				System.out.println("Input Celsius");
				input = scanner.nextDouble();
				rslt = ((input * 9) / 5) + 32;
				System.out.println("\n" + rslt + " F");
				forgive = false;
				break;
			case 2:
				System.out.println("Input Fahrenheit");
				input = scanner.nextDouble();
				rslt = ((input - 32) * 5) / 9;
				System.out.println("\n" + rslt + " C");
				forgive = false;
				break;
			case 69:
				ee.dirty();
				forgive = true;
				break;
			default:
				System.out.println("Invalid command. Please choose a valid command. \n");
				forgive = true;
				break;
			}
		}
	}	
}