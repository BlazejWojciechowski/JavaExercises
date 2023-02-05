package Zadania.KlasyNakładkowe;

import javax.swing.*;
import java.util.ArrayList;

public class SalesData
{
    private ArrayList<Double> array;
    private double sumWeek;
    private double avgDay;

    private double sumAll;
    private double avgWeek;

    private double highest;
    private double lowest;

    public SalesData(ArrayList<Double> array)
    {
        this.array = array;
    }
    public void getSumWeek()
    {
        int index = 0;

        for (int row = 0; row < 3; row++)
        {
            double accu = 0;

            for (int col = 0; col < 7; col++)
            {
                accu += array.get(index);
                index++;
            }
            JOptionPane.showMessageDialog(null,String.format("Średnia z tygodnia numer %d wynosi %.2f " +
                                        "złotego.", (row + 1), accu));
            highest = accu;
            lowest = accu;
        }
    }

    public void getAvgDay()
    {
        int index = 0;

        for (int row = 0; row < 3; row++)
        {
            double accu = 0;

            for (int col = 0; col < 7; col++)
            {
                accu += array.get(index);
                index++;
            }
            accu = accu / 7;
            JOptionPane.showMessageDialog(null,String.format("Średnia dzienna wartość z tygodnia numer %d " +
                                            "wynosi %.2f " + "złotego.", (row + 1), accu));
        }
    }

    public void getSumAll()
    {
        double accu = 0;
        for (int row = 0; row < array.size(); row++)
        {
            accu += array.get(row);
        }

            JOptionPane.showMessageDialog(null,String.format("Łączna wartość sprzedaży ze wszystkich tygodni" +
                    " wynosi %.2f " + "złotego.", accu));
    }
    public void getavgWeek()
    {
        double accu = 0;
        for (int row = 0; row < array.size(); row++)
        {
            accu += array.get(row);
        }
        accu = accu / 3;

        JOptionPane.showMessageDialog(null,String.format("Średnia tygodniowa wynosi %.2f złotego.", accu));
    }
    public void getHighest()
    {
        double highest = 0;
        int position = 0;
        int index = 0;

        for (int row = 0; row < 3; row++)
        {
            double accu = 0;

            for (int col = 0; col < 7; col++)
            {
                accu += array.get(index);
                index++;
            }
            if (this.highest < accu)
            {
                highest = accu;
                position = row + 1;
            }
        }
        JOptionPane.showMessageDialog(null, String.format("Najwyższa wartość sprzedaży była w tygodniu " +
                                    "numer %d i wynosiła %.2f złotego.", position, highest));
    }
    public void getLowest()
    {
        double lowest = 0;
        int position = 0;
        int index = 0;
        lowest = this.lowest;

        for (int row = 0; row < 3; row++)
        {
            double accu = 0;

            for (int col = 0; col < 7; col++)
            {
                accu += array.get(index);
                index++;
            }
            if (lowest <= accu)
            {
                position = row + 1;
            }
            else
                lowest = accu;
        }
        JOptionPane.showMessageDialog(null, String.format("Najniższa wartość sprzedaży była w tygodniu " +
                "numer %d i wynosiła %.2f złotego.", position, lowest));
    }


}
