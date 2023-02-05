package Zadania.Wyjątki;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProsteZadania
{
    public static void main(String[] args)
    {
        int[] numbers = {1,2,3,4,5};
        int value = 5;
        try
        {
            for (int index = 0; index < numbers.length; index++)
            {
                if (numbers[index] == value)
                    System.out.println("Element pod indeksem " + (index + 1));
            }

        }
        catch (Exception e)
        {
            System.out.println("elementu nie znaleziono");
        }
    }
}
