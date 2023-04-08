package Zadania.KlasyTabliceArrayList;

import java.io.IOException;
import java.io.PrintWriter;

public class WeeklyGasDemo {
    public static void main(String[] args) throws IOException {
        final int WEEKS = 48;
        final int NUM = 12;
        double element;
        double[] lowest = new double[NUM];
        double[] highest = new double[NUM];
        double[] avgMonths = new double[NUM];
        double[] weeklyGas = new double[WEEKS];
        String[] months = {
                            "Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec",
                            "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};

        WeeklyGas weekG = new WeeklyGas(weeklyGas, months, lowest, highest, avgMonths);

        weekG.setWeeklyGa();
        weekG.setMonths(months);

        element = weekG.getLowestGas();
        weekG.getMonth(element);

        element = weekG.getHighestGas();
        weekG.getMonth(element);

        weekG.getAvgMonth();

        weekG.makePrintwriter();

        weekG.showValues();
    }
}
