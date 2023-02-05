package Zadania.KlasyTabliceArrayList;

import javax.swing.*;

public class WiększeOdN
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int value, result;
        String input;

        input = JOptionPane.showInputDialog("Podaj liczbę całkowitą:");
        value = Integer.parseInt(input);

        result = sequentialSearch(numbers, value);
        while (result >= numbers.length - 1)
        {
            input = JOptionPane.showInputDialog("Nie ma większych liczb od podanej. Podaj inną liczbę:");
            value = Integer.parseInt(input);
            result = sequentialSearch(numbers, value);
        }

        //Wyświetlanie większych liczb od n
        System.out.println("Większe cyfry od podanej to:");

        for (int index = (result + 1); index < numbers.length; index++)
        {
            System.out.print(numbers[index] + " ");
        }

    }

    public static int sequentialSearch(int[] array, int val)
    {
        int index = 0;
        boolean found = false;
        int element = -1;

        while (!found && index < array.length)
        {
            if (array[index] < val)
                index++;
            else
            {
                found = true;
            }
            element = index;
        }
        return element;
    }
}
