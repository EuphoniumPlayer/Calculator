
public class CF extends ConversionSetup {
	void start () {
		System.out.println("\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");
		order = scanner.nextInt();
		switch (order) {
		case 1:
			System.out.println("Input Celsius");
			input = scanner.nextDouble();
			rslt = ((input * 9) / 5) + 32;
			System.out.println("\n" + rslt + " F");
			break;
		case 2:
			System.out.println("Input Fahrenheit");
			input = scanner.nextDouble();
			rslt = ((input - 32) * 5) / 9;
			System.out.println("\n" + rslt + " C");
			break;
		default:
			System.out.println("Invalid Command");
			break;
		}
	}
	
}
