package Jucarii;

public class Avion extends Jucarie {

    public Avion(double l1, double l2, double l3) {
        super(l1, l2, l3);
    }

    @Override
    public double getPret() {
        return 50;
    }
}
