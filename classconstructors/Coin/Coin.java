package Zadania.KlasyKonstruktory;

import java.util.Random;

public class Coin {
    private String sideUp;
    public Coin() {
        sideUp = "";
    }
    public void toss (int side) {
        Random ran = new Random();
        side = ran.nextInt(2);
        if (side == 0)
            sideUp = "orzeł";
        else
            sideUp = "reszka";
    }
    public String getSideUp() {
        return sideUp;
    }
}
