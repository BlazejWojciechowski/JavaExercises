package Zadania.KlasyTabliceArrayList;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) throws IOException {

        String[] answers = new String[12];
        String end = "";
        int index = 0;

        File file = new File("rzeczy.txt");
        Scanner outputFile = new Scanner(file);

        while (outputFile.hasNext()) {
            answers[index] = outputFile.nextLine();
            index++;
        }
        end = JOptionPane.showInputDialog("Zadaj jakieś pytanie, jeśli chcesz zakończyć wpisz 'koniec'");

        while (!end.equalsIgnoreCase("koniec")) {
            createAnswer(answers);
            end = JOptionPane.showInputDialog("Zadaj jakieś pytanie, jeśli chcesz zakończyć wpisz 'koniec'");
        }
    }
    private static void createAnswer(String[] ans) {
        int value, index;
        String[] answe = new String[ans.length];

        for (index = 0; index < ans.length; index++) {
            answe[index] = ans[index];
        }
        Random rand = new Random();
        value = rand.nextInt(12);
        JOptionPane.showMessageDialog(null, answe[value]);
    }
}
