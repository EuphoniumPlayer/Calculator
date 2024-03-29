package Setup;

import java.util.Scanner;

import Tools.EasterEggs;

public class MoleSetup {
    public Scanner scanner = new Scanner(System.in);
    public int action;
    public double molarmass;
    public double moles;
    public double molecs;
    public double mass;
    public String cont;
    public boolean forgive = true;
    public EasterEggs ee = new EasterEggs();
    public final double particles = (6.02 * Math.pow(10,23));
}