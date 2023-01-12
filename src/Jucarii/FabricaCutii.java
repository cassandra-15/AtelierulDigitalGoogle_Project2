package Jucarii;

import Cutie.*;

public class FabricaCutii {
    public static ICutie getCutie(Jucarie jucarie) {
        String class_name = jucarie.getClass().getSimpleName();
        switch (class_name) {
            case "Avion":
                return new Paralelipiped(jucarie.dimensiuni[0], jucarie.dimensiuni[1], jucarie.dimensiuni[2]);
            case "Minge":
                return new Cub(jucarie.dimensiuni[0]);
            case "Racheta":
                return new Cilindru(jucarie.dimensiuni[0], jucarie.dimensiuni[1]);
        }
        return null;
    }

}
