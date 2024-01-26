import java.util.Scanner;

public class Interface {
	
	static CalculatorControl math = new CalculatorControl();
	static ConversionControl convert = new ConversionControl();
	//static CalculatorSetup setupcalc = new CalculatorSetup();
	//static ConversionSetup setupconvert = new ConversionSetup();
	static EasterEggs ee = new EasterEggs();
	static double forgive = 1;
	
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			while (forgive == 1) {
				System.out.println("What would you like to do, math or conversion?\n");
				String user = input.next();

				switch (user) {
				case "Math", "math":
					forgive = 0;
					//setupcalc.setupcalc();
					math.begin();
					break;
				case "Convert", "convert", "conversion", "Conversion":
					forgive = 0;
					//setupconvert.setupconvert();
					convert.begin();
					break;
				case "CHICKENFINGER":
					ee.cknfngr();
					forgive = 1;
					break;
				case "dog", "DOG":
					ee.woof();
					forgive = 1;
					break;
				default: 
					System.out.println("\nUnknown Command");
					break;
				} //close off switch
			} //close off while
		}
		
	} //close off public static void main(String[] args)

} //close off public class interface
