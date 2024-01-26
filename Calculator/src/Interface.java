import java.util.Scanner;

public class Interface {
	
	static CalculatorControl math = new CalculatorControl();
	static ConversionControl convert = new ConversionControl();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What would you like to do?\n");
		String user = input.next();
		
		switch (user) {
			// move to calculator control class
		case "Math", "math":
			math.begin();
			break;
		case "Convert", "convert":
			convert.begin();
			break;
		default: 
			System.out.println("\nUnknown Command");
			break;
		}
		
	}

}
