package Metric_Moles;

import Tools.Universal;
import Metric_Moles.Metric_Imperial.CF;
import Metric_Moles.Metric_Imperial.MiKl;

public class ConversionControl extends Universal {
	
	private static boolean forgive = true;
	private static final MiKl mikm = new MiKl();
	private static final CF cf = new CF();
	
	public void begin () {
		System.out.println("\nWhat type of conversion would you like to make?\n1. Miles to Kilometers\n2. Celsius to Fahrenheit\n");
		while (forgive) {
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				forgive = false;
				mikm.start();
				break;
			case 2:
				forgive = false;
				cf.start();
				break;
			default: 
				System.out.println("\nInvalid Command");
				break;
			}
		}
	}
}