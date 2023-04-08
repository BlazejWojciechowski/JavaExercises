package Zadania.KlasyTabliceArrayList;

import java.util.Random;

public class ArrayList {
    private final int[] arrayList;

    public ArrayList(int[] arrayLi)
    {
        arrayList = arrayLi;
    }
    public void setArrayList(int[] arrayL) {
        Random rand = new Random();
        int value;

        for (int index = 0; index < arrayL.length; index++) {
            value = rand.nextInt(100);
            arrayList[index] = value;
        }
    }
    public int getSum(int[] arrayL) {
        int total = 0;

        for (int index = 0; index < arrayL.length; index++) {
            total += arrayL[index];
        }
        return total;
    }
    public double getAvg(int[] arrayL) {
        double avg = 0;

        for (int index = 0; index < arrayL.length; index++) {
            avg += arrayL[index];
        }
        return avg / arrayL.length;
    }
    public int getHighest(int[] arrayL) {
        int index = 0;
        int highest = arrayL[index];

        for (index = 1; index < arrayL.length; index++) {
            if (arrayL[index] > highest)
                highest = arrayL[index];
        }
        return highest;
    }
    public int getLowest(int[] arrayL) {
        int index = 0;
        int lowest = arrayL[index];

        for (index = 1; index < arrayL.length; index++) {
            if (arrayL[index] < lowest)
                lowest = arrayL[index];
        }
        return lowest;
    }
}
