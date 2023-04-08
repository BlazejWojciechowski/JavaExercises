package Zadania.KlasyTabliceArrayList;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class PopularNamesDemo {
    public static void main(String[] arg) throws IOException {
        final int NUM = 200;
        String[] girlNames = new String[NUM];
        String[] boyNames = new String[NUM];

        PopularNames popular = new PopularNames(girlNames, boyNames);

        popular.setGirlNames();
        popular.setBoyNames();

        String boyName;
        String girlName;
        int element = -1;

        girlName = JOptionPane.showInputDialog("Podaj imię damskie:");
        if (!girlName.isEmpty())
            element = popular.getGirlNames(girlName);
        popular.showValues(element);

        boyName = JOptionPane.showInputDialog("Podaj imie męskie");
        if (!boyName.isEmpty())
            element = popular.getBoyNames(boyName);
        popular.showValues(element);
    }
}
