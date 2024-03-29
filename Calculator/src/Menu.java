import java.util.Scanner;

import Metric_Moles.ConversionControl;
import Math.CalculatorControl;
import Setup.EasterEggs;
import Metric_Moles.MoleControl;

public class Menu {
	
	static CalculatorControl math = new CalculatorControl();
	static ConversionControl convert = new ConversionControl();
	static MoleControl mole = new MoleControl();
	static EasterEggs ee = new EasterEggs();
	static int forgive = 1;
	
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			while (forgive == 1) {
				System.out.println("What would you like to do, math, conversion, or Mole calculation?\n");
				String user = input.next();

				switch (user) {
				case "Math", "math":
					forgive = 0;
					math.begin();
					break;
				case "Convert", "convert", "conversion", "Conversion":
					forgive = 0;
					convert.begin();
					break;
				case "Mole", "mole", "mol", "Mol":
					forgive = 0;
					mole.begin();
					break;
				case "CHICKENFINGER":
					ee.cknfngr();
					forgive = 1;
					break;
				case "DOGS":
					ee.woof();
					forgive = 1;
					break;
				case "69":
					ee.dirty();
					forgive = 1;
					break;
				default: 
					System.out.println("\nUnknown Command");
					break;
				} 
			}
		}	
	}
}
