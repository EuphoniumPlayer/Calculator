public class Addition extends CalculatorSetup {
	void run () {
			System.out.println("Input:\n");
			x = scanner.nextDouble();
			System.out.println("Input:\n");
			y = scanner.nextDouble();
			rslt = x + y;
			System.out.println("Continue? Use a SINGLE capitol Y or N\n");
			cont = scanner.next();
		while (cont.equals("Y")) {
			System.out.println("Input:\n");
			z = scanner.nextDouble();
			rslt = rslt + z;
			System.out.println("Continue?\n");
			cont = scanner.next();

		}
		System.out.println("End: " + rslt);
	}
}