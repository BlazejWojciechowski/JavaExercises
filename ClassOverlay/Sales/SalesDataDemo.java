package Zadania.KlasyNakładkowe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SalesDataDemo
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("NumberList.txt");
        Scanner outputFile = new Scanner(file);

        ArrayList<Double> list = new ArrayList<>();
        ArrayList<String> array = new ArrayList<>();
        String[] sales = new String[3];
        String input;
        int index = 0;
        double value;

        while (outputFile.hasNext())
        {
            sales[index] = outputFile.nextLine();
            index++;
        }
        for (int row = 0; row < index; row++)
        {
            input = sales[row];
            String[] test = input.split(",");

            for (int col = 0; col < test.length; col++)
            {
                array.add(test[col]);
            }
        }
        for (String s : array)
        {
            value = Double.parseDouble(s);
            list.add(value);
        }

        SalesData data = new SalesData(list);
        data.getSumWeek();
        data.getAvgDay();
        data.getSumAll();
        data.getavgWeek();
        data.getHighest();
        data.getLowest();
    }
}
