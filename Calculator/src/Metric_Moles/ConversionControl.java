package Metric_Moles;

import java.util.Scanner;
import Metric_Moles.Metric_Imperial.CF;
import Metric_Moles.Metric_Imperial.MiKl;

public class ConversionControl {
	
	static boolean forgive = true;
	static MiKl mikm = new MiKl();
	static CF cf = new CF();
	static Scanner scanner = new Scanner(System.in);
	
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