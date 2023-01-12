package Jucarii;

public class Racheta extends Jucarie {
    public Racheta(double l1, double l2) {
        super(l1, l2);
    }

    @Override
    public double getPret() {
        return 25;
    }
}
