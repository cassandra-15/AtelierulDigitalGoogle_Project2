package Cutie;

public class Cilindru implements ICutie {
    private double h;
    private double r;


    public Cilindru(double h, double r) {
        this.h = h;
        this.r = r;
    }

    @Override
    public double getSuprafataTotala() {
        double Ab = Math.PI * Math.pow(r, 2);
        double Al = 2 * Math.PI * r * h;
        return 2 * Ab + Al;
    }

    @Override
    public double pret() {
        return ICutie.super.pret();
    }

    @Override
    public String toString() {
        return "Cutie-Cilindru{" +
                "h=" + h +
                ", r=" + r +
                '}';
    }
}
