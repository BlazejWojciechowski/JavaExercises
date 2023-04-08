package Zadania.KlasyTabliceArrayList;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PopularNames {
    private final String[] girlNames;
    private final String[] boyNames;
    public PopularNames(String[] girlNam, String[] boyNam) {
        girlNames = girlNam;
        boyNames = boyNam;
    }
    public void setGirlNames() throws IOException {
        File file = new File("mojeimie.txt");
        Scanner outputFile = new Scanner(file);

        int index = 0;

        while (outputFile.hasNext()) {
            girlNames[index] = outputFile.nextLine();
            index++;
        }
    }
    public void setBoyNames() throws IOException {
        File file = new File("wykres.txt");
        Scanner outputFile = new Scanner(file);

        int index = 0;

        while (outputFile.hasNext()) {
            boyNames[index] = outputFile.nextLine();
            index++;
        }
    }
    public int getGirlNames(String girlN) {
        int element = 0;

        for (int index = 0; index < girlNames.length; index++) {

            if (girlNames[index].equalsIgnoreCase(girlN)) {
                element = 1;
                break;
            }
        }
        return element;
    }
    public int getBoyNames(String boyN) {
        int element = 0;

        for (int index = 0; index < boyNames.length; index++) {
            if (boyNames[index].equalsIgnoreCase(boyN)) {
                element = 1;
                break;
            }
        }
        return element;
    }
    public void showValues(int element) {
        if (element == 1)
            JOptionPane.showMessageDialog(null, "To imię jest jedno z najpopularniejszych.");
        else
            JOptionPane.showMessageDialog(null, "To imię nie jest popularne.");
    }
}
