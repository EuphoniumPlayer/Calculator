import java.util.Scanner;
import Stoichiometry.StoichiometryControl;

import Metric_Moles.ConversionControl;
import Math.CalculatorControl;
import Setup.EasterEggs;
import Metric_Moles.MoleControl;

public class Menu {
	
	static CalculatorControl math = new CalculatorControl();
	static ConversionControl convert = new ConversionControl();
	static MoleControl mole = new MoleControl();
	static StoichiometryControl stoich = new StoichiometryControl();
	static EasterEggs ee = new EasterEggs();
	static boolean forgive = true;
	
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			while (forgive) {
				System.out.println("What would you like to do, math, conversion, mole calculation, or stoichiometry?\n");
				String user = input.next();

				switch (user) {
				case "Math", "math":
					forgive = false;
					math.begin();
					break;
				case "Convert", "convert", "conversion", "Conversion":
					forgive = false;
					convert.begin();
					break;
				case "Mole", "mole", "mol", "Mol":
					forgive = false;
					mole.begin();
					break;
				case "Stoich", "stoich", "Stoichiometry", "stoichiometry":
					forgive = false;
					stoich.begin();
					break;
				case "CHICKENFINGER":
					ee.cknfngr();
					forgive = true;
					break;
				case "DOGS":
					ee.woof();
					forgive = true;
					break;
				case "69":
					ee.dirty();
					forgive = true;
					break;
				default: 
					System.out.println("\nUnknown Command");
					break;
				} 
			}
		}	
	}
}