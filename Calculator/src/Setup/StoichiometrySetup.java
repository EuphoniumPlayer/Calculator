package Setup;

import java.util.Scanner;

public class StoichiometrySetup {
    public boolean forgive = true;
    public boolean forgive2 = true;
    public boolean forgive3 = true;
    // baseline
    public Scanner scanner = new Scanner(System.in);
    public int numreact;
    public int numprod;
    public int get_to;
    public int start_at;
    // names
    public String re1;
    public String re2;
    public String re3;
    public String prod1;
    public String prod2;
    public String prod3;
    // coeficients
    public double re1coe;
    public double re2coe;
    public double re3coe;
    public double prod1coe;
    public double prod2coe;
    public double prod3coe;
    // molar mass trackers
    public double re1mm;
    public double re2mm;
    public double re3mm;
    public double prod1mm;
    public double prod2mm;
    public double prod3mm;
    // mole trackers
    public double re1mol;
    public double re2mol;
    public double re3mol;
    public double prod1mol;
    public double prod2mol;
    public double prod3mol;
    // particle trackers
    public double re1par;
    public double re2par;
    public double re3par;
    public double prod1par;
    public double prod2par;
    public double prod3par;
}