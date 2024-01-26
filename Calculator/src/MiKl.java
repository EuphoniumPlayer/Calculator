
public class MiKl extends ConversionSetup {
	void start () {
		System.out.println("\n1. Miles to Kilometers\n2. Kilometers to Miles");
		order = scanner.nextInt();
		switch (order) {
		case 1:
			System.out.println("Input Miles");
			input = scanner.nextDouble();
			rslt = ((input * 8) / 5);
			System.out.println(rslt + " Kilometers");
			break;
		case 2:
			System.out.println("Input Kilometers");
			input = scanner.nextDouble();
			rslt = ((input * 5) / 8);
			System.out.println(rslt + " Miles");
			break;
		default:
			System.out.println("Invalid Command");
		}
	}
	
}