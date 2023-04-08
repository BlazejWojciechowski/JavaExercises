package Zadania.KlasyNakładkowe;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PowerBall {
    private final int NUM = 69;
    private final ArrayList<Integer> ARRAY = new ArrayList<>();
    private final int[] MOST = new int[NUM];
    public PowerBall() throws FileNotFoundException {
        File file = new File("NumberList.txt");
        Scanner outputFile = new Scanner(file);
        String input;

        while (outputFile.hasNext()) {
            input = outputFile.nextLine();
            String[] test = input.split(" ");
            for (int row = 0; row < test.length; row++) {
                ARRAY.add(Integer.parseInt(test[row]));
            }
        }
    }
    public void setMOST() {
        for (int row = 0; row < NUM; row++) {
            int accu = 0;

            for (int col = 0; col < ARRAY.size(); col++) {
                if ((row + 1) == ARRAY.get(col))
                    accu++;
                else
                    accu += 0;
            }
            MOST[row] = accu;
        }
    }
    public void selectionSort() {
        int startScan, index, minIndex, minValue;

        for (startScan = 0; startScan < (MOST.length - 1); startScan++) {
            minIndex = startScan;
            minValue = MOST[startScan];

            for (index = startScan + 1; index < MOST.length; index++) {
                if (MOST[index] < minValue) {
                    minValue = MOST[index];
                    minIndex = index;
                }
            }
            MOST[minIndex] = MOST[startScan];
            MOST[startScan] = minValue;
        }
    }
    public void showMost() {
        int value = MOST.length - 1;
        JOptionPane.showMessageDialog(null, "Najczęściej losowane liczby to: ");
        for (int index = 0; index < 10; index++) {
        }
    }
    public void showValue() {
        int index = 0;
        for (int t : MOST) {
            System.out.println(t);
        }
    }
}
