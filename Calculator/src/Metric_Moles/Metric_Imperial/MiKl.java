package Metric_Moles.Metric_Imperial;

import Setup.ConversionSetup;

public class MiKl extends ConversionSetup {
	public void start () {
		System.out.println("\n1. Miles to Kilometers\n2. Kilometers to Miles");
		while (forgive) {	
			order = scanner.nextInt();
			switch (order) {
			case 1:
				forgive = false;
				System.out.println("Input Miles");
				input = scanner.nextDouble();
				rslt = ((input * 8) / 5);
				System.out.println(rslt + " Kilometers");
				break;
			case 2:
				forgive = false;
				System.out.println("Input Kilometers");
				input = scanner.nextDouble();
				rslt = ((input * 5) / 8);
				System.out.println(rslt + " Miles");
				break;
			case 69:
				ee.dirty();
				forgive = true;
				break;
			default:
				forgive = true;
				System.out.println("Invalid command. Please choose a valid command. \n");
			}
		} 
	}	
}
