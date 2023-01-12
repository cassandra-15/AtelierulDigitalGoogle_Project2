package Cutie;

public class Paralelipiped implements ICutie {
    private double l;
    private double L;
    public double h;

    public Paralelipiped(double l, double l1, double h) {
        this.l = l;
        L = l1;
        this.h = h;
    }

    @Override
    public double getSuprafataTotala() {
        return 6 * l * L;
    }

    @Override
    public double pret() {
        return ICutie.super.pret();
    }

    @Override
    public String toString() {
        return "Cutie-Paralelipiped{" +
                "l=" + l +
                ", L=" + L +
                ", h=" + h +
                '}';
    }
}
