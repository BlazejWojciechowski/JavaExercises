package Zadania.KlasyTabliceArrayList;

import java.util.Random;

public class DoubleArray {
    private int [][] arrayList;
    public DoubleArray(int[][] arrayL) {
        arrayList = arrayL;
    }
    public void setArrayList() {
        Random rand = new Random();
        int value;
        final int ROW = 10;
        final int COL = 20;

        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                value = rand.nextInt(100) + 1;
                arrayList[row][col] = value;
            }
        }
    }
    public int getTotal() {
        int total = 0;
        final int ROW = 10;
        final int COL = 20;

        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                total += arrayList[row][col];
            }
        }
        return total;
    }
    public int getAverage() {
        final int ROW = 10;
        final int COL = 20;

        int avg = 0;
        avg = getTotal() / (ROW * COL);

        return avg;
    }
    public int getRowTotal(int value) {
        final int COL = 20;
        int total = 0;

            for (int col = 0; col < COL; col++) {
                total += arrayList[value][col];
            }
        return total;
    }
    public int getColumnTotal(int value) {
        final int ROW = 10;
        int total = 0;

        for (int row = 0; row < ROW; row++) {
            total += arrayList[row][value];
        }
        return total;
    }
    public int gethighestinrRow(int value) {
        final int COL = 20;
        int index = 0;
        int highest = arrayList[value][index];

        for (int col = 1; col < COL; col++) {
            if (arrayList[value][col] > highest)
                highest = arrayList[value][col];
        }
        return highest;
    }
    public int getlowestinrRow(int value) {
        final int COL = 20;
        int index = 0;
        int lowest = arrayList[value][index];

        for (int col = 1; col < COL; col++) {
            if (arrayList[value][col] < lowest)
                lowest = arrayList[value][col];
        }
        return lowest;
    }
}
