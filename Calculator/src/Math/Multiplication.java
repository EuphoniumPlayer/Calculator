package Math;

public class Multiplication extends CalculatorSetup {
	public void run () {
		System.out.println("Input:\n");
		x = scanner.nextDouble();
		System.out.println("Input:\n");
		y = scanner.nextDouble();
		rslt = x * y;
		System.out.println("Continue? Y/N\n");
		cont = scanner.next();
		
		while (cont.equals("Y") | cont.equals("y")) {
			System.out.println("Input:\n");
			z = scanner.nextDouble();
			rslt = rslt * z;
			System.out.println("Continue?\n");
			cont = scanner.next();
		}
	System.out.println("End: " + rslt);
	}
}
