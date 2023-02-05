package Zadania.KlasyTabliceArrayList;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WeeklyGas
{
    private final double[] weeklyGa;
    private String[] months;
    private double[] lowest;
    private double[] highest;
    private double[] avgMonths;

    public WeeklyGas(double[] weeklyG, String[] month, double[] low, double[] high, double[] avg)
    {
        weeklyGa = weeklyG;
        months = month;
        lowest = low;
        highest = high;
        avgMonths = avg;
    }
    public void setMonths(String[] mon)
    {
        months = mon;
    }
    public void setWeeklyGa() throws IOException
    {
        File file = new File("Przebytaodległosć.txt");
        Scanner outputFile = new Scanner(file);

        int index = 0;
        while (outputFile.hasNext())
        {
            weeklyGa[index] = outputFile.nextDouble();
            index++;
        }
        outputFile.close();
    }
    public double getLowestGas()
    {
        int index = 0;
        double lowest = weeklyGa[index];
        double element = 0;

        for (index = 1; index < weeklyGa.length; index++)
        {
            if (weeklyGa[index] < lowest)
            {
                lowest = weeklyGa[index];
                element = index;
            }
        }
        System.out.print("Najniższa średnia cena z całego roku wynosiła " + lowest);
        return element;
    }
    public double getHighestGas()
    {
        int index = 0;
        double highest = weeklyGa[index];
        double element = 0;

        for (index = 1; index < weeklyGa.length; index++)
        {
            if (weeklyGa[index] > highest)
            {
                highest = weeklyGa[index];
                element = index;
            }
        }
        System.out.print("Najwyższa średnia cena z całego roku wynosiła " + highest);
        return element;
    }
    public void getAvgMonth()
    {
        final int WEEKS = 4;
        int index = 0;
        for (int row = 0; row < months.length; row++)
        {
            double avg = 0;
            for (int col = 0; col < WEEKS; col++)
            {
                avg += weeklyGa[index];
                index++;
            }
            System.out.printf("Średnia z miesiąca %s to %.5f .", getMon(row), (avg / WEEKS));
            System.out.println();
            avgMonths[row] = avg / WEEKS;
        }
    }
    public String getMon(int element)
    {
        return months[element];
    }

    public void getMonth(double element)
    {
        double week = element;
        String month = "";
        double value;
        int index = -1;
        value = element / 4;

        if (value <= 1)
        {
            index = 0;
            month = months[index];
        }
        else if (value <= 2)
        {
            index = 1;
            month = months[index];
        }
        else if (value <= 3)
        {
            index = 2;
            month = months[index];
        }
        else if (value <= 4)
        {
            index = 3;
            month = months[index];
        }
        else if (value <= 5)
        {
            index = 4;
            month = months[index];
        }
        else if (value <= 6)
        {
            index = 5;
            month = months[index];
        }
        else if (value <= 7)
        {
            index = 6;
            month = months[index];
        }
        else if (value <= 8)
        {
            index = 7;
            month = months[index];
        }
        else if (value <= 9)
        {
            index = 8;
            month = months[index];
        }
        else if (value <= 10)
        {
            index = 9;
            month = months[index];
        }
        else if (value <= 11)
        {
            index = 10;
            month = months[index];
        }
        else if (value <= 12)
        {
            index = 11;
            month = months[index];
        }

        System.out.print(" w tygodniu numer " + (week + 1) + " w miesiącu " + month + ".");
        System.out.println();
    }
    public void showValues() throws IOException
    {
        File file = new File("zapisane.txt");
        Scanner outputFile = new Scanner(file);
        while (outputFile.hasNext())
        {
            System.out.println(outputFile.nextLine());
        }
    }
    public void makePrintwriter() throws IOException
    {
        PrintWriter pwriter = new PrintWriter("zapisane.txt");

        for (int index = 0; index < months.length; index++)
        {
            pwriter.print(months[index] + " ma średnią ");
            pwriter.print(avgMonths[index] + ".");
            pwriter.println();
        }
    }
}
