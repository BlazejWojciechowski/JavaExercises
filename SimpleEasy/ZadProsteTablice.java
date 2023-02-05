package Zadania.Proste;

import java.util.ArrayList;

public class ZadProsteTablice
{
    public static void main(String[] args)
    {
        /*
        String[] countries = {"Polska", "Niemcy", "Holandia", "Belgia"};
        int[] peoples = {40, 80, 15, 25};

        for (int index = 0; index < countries.length; index++)
        {
            System.out.println(countries[index] + " ma " + peoples[index] + "mln mieszkańców.");
        }

         */

        /*
        final int NUM_FIN = 10;

        int[] iD = new int[NUM_FIN];
        int[] pay = new int[NUM_FIN];

        for (int index = 0; index < iD.length; index++)
        {
            iD[index] = index + 1;
        }

        for (int index = 0; index < pay.length; index++)
        {
            pay[index] = index * index;
        }

        for (int index = 0; index < iD.length; index++)
        {
            System.out.println("Pracownik z ID " + iD[index] + " ma wypłaty " + pay[index] + " złotych.");
        }

         */

        /*
        int[][] grades = new int[30][10];
        final int ROWS = 30;
        final int COLS = 10;
        int aku = 0;
        int avg;

        for (int row = 0; row < ROWS; row++)
        {
            for (int col = 0; col < COLS; col++)
            {
                grades[row][col] = row + col;
            }
        }
        for (int row = 0; row < ROWS; row++)
        {
            for (int col = 0; col < COLS; col++)
            {
                System.out.println(grades[row][col]);
                aku += grades[row][col];
            }
        }
        avg = aku / (ROWS * COLS);
        System.out.println("Suma wszystkich liczb to " + aku + "\nŚrednia tych liczb to " + avg + ".");

         */

        /*
        int[][] numberArray = new int[9][11];

        final int ROWS = 9;
        final int COLS = 11;
        numberArray[0][0] = 145;
        numberArray[8][10] = 18;

        for (int row = 0; row < ROWS; row++)
        {
            for (int col = 0; col < COLS; col++)
            {
                System.out.println(numberArray[row][col]);
            }
        }

         */

        /*
        final int ROWS = 29;
        final int COLS = 5;

        int[][] days = new int[ROWS][COLS];

        for (int row = 0; row < ROWS; row++)
        {
            int sumRows = 0;
            for (int col = 0; col < COLS; col++)
            {
                days[row][col] = (row + 1) * (col + 1);
                sumRows += days[row][col];
            }
            System.out.println("W wierszu numer " + row + " suma to " + sumRows);
        }

        System.out.println("\n");

        for (int col = 0; col < COLS; col++)
        {
            int sumCols = 0;
            for (int row = 0; row < ROWS; row++)
            {
                days[row][col] = (row + 1) * (col + 1);
                sumCols += days[row][col];
            }
            System.out.println("W kolumnie numer " + col + " suma to " + sumCols);
        }

         */

        /*
        ArrayList<String> ArrayList = new ArrayList<>();

        ArrayList.add("Opel");
        ArrayList.add("Ford");
        ArrayList.add("Mazda");

        for (int index = 0; index < ArrayList.size(); index++)
        {
            System.out.println(ArrayList.get(index));
        }

         */
    }
}
