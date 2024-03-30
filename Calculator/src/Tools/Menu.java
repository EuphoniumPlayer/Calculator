package Tools;

import Stoichiometry.StoichiometryControl;
import Metric_Moles.ConversionControl;
import Math.CalculatorControl;
import Metric_Moles.MoleControl;

public class Menu extends Universal {
	
	private static final CalculatorControl math = new CalculatorControl();
	private static final ConversionControl convert = new ConversionControl();
	private static final MoleControl mole = new MoleControl();
	private static final StoichiometryControl stoich = new StoichiometryControl();
	private static boolean forgive = true;
	
	public void start () {
			while (forgive) {
				System.out.println("What would you like to do, math, conversion, mole calculation, or stoichiometry?\n");
				String user = scanner.next();
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
