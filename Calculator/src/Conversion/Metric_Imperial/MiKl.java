package Conversion.Metric_Imperial;

import Conversion.ConversionSetup;

public class MiKl extends ConversionSetup {
	public void start () {
		System.out.println("\n1. Miles to Kilometers\n2. Kilometers to Miles");
		while (forgive == 1) {	
			order = scanner.nextInt();
			switch (order) {
			case 1:
				forgive = 0;
				System.out.println("Input Miles");
				input = scanner.nextDouble();
				rslt = ((input * 8) / 5);
				System.out.println(rslt + " Kilometers");
				break;
			case 2:
				forgive = 0;
				System.out.println("Input Kilometers");
				input = scanner.nextDouble();
				rslt = ((input * 5) / 8);
				System.out.println(rslt + " Miles");
				break;
			case 69:
				ee.dirty();
				forgive = 1;
				break;
			default:
				forgive = 1;
				System.out.println("Invalid command. Please choose a valid command. \n");
			}
		} 
	}	
}
