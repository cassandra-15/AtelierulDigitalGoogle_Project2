package Cutie;

import java.text.DecimalFormat;

public interface ICutie {
    DecimalFormat df = new DecimalFormat("0. 00");
    public static double pretUnitateSuprafata = 0.05;

    abstract public double getSuprafataTotala();

    public default double pret() {
        return Double.parseDouble(df.format(getSuprafataTotala() * pretUnitateSuprafata));
    }
}
