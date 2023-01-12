package Cutie;

import java.text.DecimalFormat;

public class Cub implements ICutie {
    private double l;
    DecimalFormat df = new DecimalFormat("0. 00");


    public Cub(double l) {
        this.l = l;
    }

    @Override
    public double getSuprafataTotala() {
        return 6 * Math.pow(l, 2);
    }

    @Override
    public double pret() {
        return ICutie.super.pret();
    }

    @Override
    public String toString() {
        return "Cutie-Cub{" +
                "l=" + l +
                '}';
    }
}
