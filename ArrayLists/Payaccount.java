package Zadania.KlasyTabliceArrayList;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Payaccount
{
    public static void main(String[] args) throws IOException
    {
        int[] accounts = new int[6];
        int result, value, index = 0;
        String input;

        File file = new File("mojeimie.txt");
        Scanner outputFile = new Scanner(file);

        while (outputFile.hasNext() && index < accounts.length)
        {
           accounts[index] = outputFile.nextInt();
           index++;
        }

        input = JOptionPane.showInputDialog("Jakiej liczby szukasz?");
        value = Integer.parseInt(input);

        result = sequentialSearch(accounts, value);

        if (result == -1)
        {
            System.out.println("Nie znaleziono liczby.");
        }
        else
            System.out.println("Znaleziono liczbę w indeksie " + (result + 1));

    }

    public static int sequentialSearch(int[] array, int value)
    {
        int index = 0;
        int element = -1;
        boolean found = false;

        while (!found && index < array.length)
        {
            if (array[index] == value)
            {
                found = true;
                element = index;
            }
            index++;
        }
        return element;
    }
}
