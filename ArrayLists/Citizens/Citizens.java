package Zadania.KlasyTabliceArrayList;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Citizens {
    private final int[] numberCitizens;

    public Citizens(int[] numCiti)
    {
        numberCitizens = numCiti;
    }
    public void setNumberCitizens() throws IOException {
        File file = new File("zapisane.txt");
        Scanner outputFile = new Scanner(file);

        int index = 0;

        while (outputFile.hasNext()) {
            numberCitizens[index] = outputFile.nextInt();
            index++;
        }
    }
    public double getAvg() {
        double avg = 0;
        double aku = 0;
        int index2 = 1;
        int score;

        for (int index = 0; index < numberCitizens.length - 1; index++) {
            score = (numberCitizens[index2] - numberCitizens[index]);
            aku += score;
            index2++;
        }
        avg = aku / (numberCitizens.length - 1);
        return avg;
    }
    public int getHighest() {
        int index1 = 0;
        int index2 = 1;
        int element = 0;
        int value = 0;
        int score;

        for (int row = 0; row < numberCitizens.length - 1; row++) {
            score =  numberCitizens[index2] - numberCitizens[index1];
            if (score > value) {
                value = score;
                element = index2;
            }
            index1++;
            index2++;
        }
        return element;
    }
    public int getLowest() {
        int index1 = 0;
        int index2 = 1;
        int element = 0;
        int value = 5000;
        int score;

        for (int row = 0; row < numberCitizens.length - 1; row++) {
            score =  numberCitizens[index2] - numberCitizens[index1];
            if (score < value) {
                value = score;
                element = index2;
            }
            index1++;
            index2++;
        }
        return element;
    }
}
