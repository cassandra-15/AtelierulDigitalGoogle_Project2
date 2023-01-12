package Magazin;
import Jucarii.*;

import static Cutie.ICutie.df;

public class Main {
    public static void main(String[] args) {
        Avion a1 = new Avion(2, 3, 4);
        Minge m1 = new Minge(4);
        Racheta r1 = new Racheta(6, 8);

        Jucarie[] jucarii = {a1, m1, r1};

        double pretCutie1 = FabricaCutii.getCutie(a1).pret();
        double pretCutie2 = FabricaCutii.getCutie(m1).pret();
        double pretCutie3 = FabricaCutii.getCutie(r1).pret();

        double sumaFinala = 0;

        System.out.println("\nAvion:" + FabricaCutii.getCutie(a1));
        System.out.println("Pret cutie=" + pretCutie1 + ", pret jucarie=" + a1.getPret() + ", pret final=" + (pretCutie1 + a1.getPret()));

        System.out.println("\nMinge:" + FabricaCutii.getCutie(m1));
        System.out.println("Pret cutie=" + pretCutie2 + ", pret jucarie=" + m1.getPret() + ", pret final=" + (pretCutie2 + m1.getPret()));

        System.out.println("\nRacheta:" + FabricaCutii.getCutie(r1));
        System.out.println("Pret cutie=" + pretCutie3 + ", pret jucarie=" + r1.getPret() + ", pret final=" + (pretCutie3 + r1.getPret()));

        for (Jucarie jucarie : jucarii)
            sumaFinala += (FabricaCutii.getCutie(jucarie).pret() + jucarie.getPret());

        System.out.println("\nSuma finala:" + df.format(sumaFinala));

    }
}