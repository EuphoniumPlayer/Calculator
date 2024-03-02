package Control.Controllers;
import java.util.Scanner;

import Conversion.Metric_Imperial.CF;
import Conversion.Metric_Imperial.MiKl;
public class ConversionControl {
	
	static double forgive = 1;
	static MiKl mikm = new MiKl();
	static CF cf = new CF();
	static Scanner scanner = new Scanner(System.in);
	
	public void begin () {
		System.out.println("\nWhat type of conversion would you like to make?\n1. Miles to Kilometers\n2. Celsius to Fahrenheit\n");
		while (forgive == 1) {
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				mikm.start();
				break;
			case 2:
				cf.start();
				break;
			default: 
				System.out.println("\nInvalid Command");
				break;
			}
		}
	}
}
