package Jucarii;

public abstract class Jucarie {
    public double dimensiuni[] = new double[3];

    public abstract double getPret();

    public Jucarie(double l1, double l2, double l3) {
        this.dimensiuni[0] = l1;
        this.dimensiuni[1] = l2;
        this.dimensiuni[2] = l3;
    }

    public Jucarie(double l1) {
        this.dimensiuni[0] = l1;
    }

    public Jucarie(double l1, double l2) {
        this.dimensiuni[0] = l1;
        this.dimensiuni[1] = l2;
    }
}
