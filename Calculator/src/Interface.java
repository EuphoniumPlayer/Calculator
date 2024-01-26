import java.util.Scanner;

public class Interface {
	
	static CalculatorControl math = new CalculatorControl();
	static ConversionControl convert = new ConversionControl();
	static var forgive = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (forgive == 0) {
			System.out.println("What would you like to do, math or conversion?\n");
			String user = input.next();

			switch (user) {
			case "Math", "math":
				forgive = 1;
				math.begin();
				break;
			case "Convert", "convert", "conversion", "Conversion":
				forgive = 1;
				convert.begin();
				break;
			default: 
				System.out.println("\nUnknown Command");
				break;
			} //close off switch
		} //close off while
		
	} //close off public static void main(String[] args)

} //close off public class interface
