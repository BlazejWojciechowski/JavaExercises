package Zadania.KlasyTabliceArrayList;

import javax.swing.*;

public class RainFallDemo {
    public static void main(String[] args) {
        final int ONE_YEAR = 12;
        double[] rain = new double[ONE_YEAR];

        getValues(rain);

        RainFall year = new RainFall(rain);

        JOptionPane.showMessageDialog(null, String.format("Opadły w sumie wyniosły %,.2f mm deszczu.\n" +
                                    "Średnia ilość opadów miesięcznie wyniosła %,.2f mm deszczu.\n" +
                                    "Najwyższa wartość opadów wyniosłą %,.2f mm deszczu.\n" +
                                    "Najniższa wartość opadów wyniosła %,.2f mm deszczu" ,
                                    year.gettotalRain(), year.getavgRain(), year.getHighest(), year.getLowest()));
        System.exit(0);
    }
    private static void getValues(double[] array) {
        String input;

        for (int i = 0; i < array.length; i++) {
            input = JOptionPane.showInputDialog("Podaj wielkość opadów z miesiąca numer " + (i + 1) + ":");
            array[i] = Double.parseDouble(input);

            while (array[i] < 0) {
                JOptionPane.showMessageDialog(null, "Podałeś nieprawidłową ilość deszczu.");
                input = JOptionPane.showInputDialog("Podaj wielkość opadów z miesiąca numer " + (i + 1) + ":");
                array[i] = Double.parseDouble(input);
            }
        }
    }
}
