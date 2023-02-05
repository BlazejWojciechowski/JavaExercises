package Zadania.KlasyTabliceArrayList;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Steps
{
    private final int[] arraySteps;
    private final double[] monthSteps;
    private final double[] avgSteps;

    public Steps(int[] steps, double[] month, double[] avg)
    {
        arraySteps = steps;
        monthSteps = month;
        avgSteps = avg;
    }
    public void setArraySteps() throws IOException
    {
        File file = new File("NumberList.txt");
        Scanner outputFile = new Scanner(file);
        int index = 0;
        while (outputFile.hasNext())
        {
            arraySteps[index] = outputFile.nextInt();
            index++;
        }
    }
    public void setMonthSteps()
    {
        final int NUM = 12;
        final int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int row = 0; row < NUM; row++)
        {
            double avgSte = 0;
            int index = days[row];

            for (int col = 0; col < index; col++)
            {
                avgSte += getarraySteps(col);
            }
            monthSteps[row] = avgSte;
        }
    }
    public void setAvgSteps()
    {
        final int NUM = 12;
        double avgSte;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int index = 0; index < NUM; index++)
        {
            avgSte = getmonthSteps(index) / days[index];
            avgSteps[index] = avgSte;
        }
    }
    public int getarraySteps(int value)
    {
        int steps;
        steps = arraySteps[value];
        return steps;
    }
    public double getmonthSteps(int value)
    {
        double month;
        month = monthSteps[value];
        return month;
    }
    public double getAvgsteps(int value)
    {
        double avg;
        avg = avgSteps[value];
        return avg;
    }
    public void showValues()
    {
        for (int index = 0; index < monthSteps.length; index++)
        {
        JOptionPane.showMessageDialog(null, String.format("W miesiącu numer %d średnia kroków dziennie " +
                                    "wyniosła " + "%.1f kroków.", (index + 1), getAvgsteps(index)));
        }
    }
}
