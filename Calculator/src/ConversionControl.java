import java.util.Scanner;
public class ConversionControl {
	
	MiKm mikm = new MiKm();
	CF cf = new CF();
	static Scanner scanner = new Scanner(System.in);
	
	void begin () {
		System.out.println("\nWhat type of conversion would you like to make?\n1. Miles to Kilometers\n2. Celsius to Fahrenheit\n");
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
