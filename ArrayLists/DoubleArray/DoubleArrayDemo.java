package Zadania.KlasyTabliceArrayList;

import javax.swing.*;

public class DoubleArrayDemo
{
    public static void main(String[] args)
    {
        int [][] arrayList = new int[10][20];

        DoubleArray dblArray = new DoubleArray(arrayList);

        String input;
        int avg;
        int total;
        int test;
        int lowest;
        int highest;

        dblArray.setArrayList();
        total = dblArray.getTotal();
        avg = dblArray.getAverage();

        input = JOptionPane.showInputDialog("Który wiersz chciałbys sprawdzić?");
        test = Integer.parseInt(input);
        highest = dblArray.gethighestinrRow(test);
        lowest = dblArray.getlowestinrRow(test);

        JOptionPane.showMessageDialog(null, String.format("Suma wszystkich liczb %d\nŚrednia wszystkich " +
                                    "liczb %d\nNajwiększa liczba w wierszu %d\nNajmniejsza liczba w wierszu %d"
                                    , total, avg, highest, lowest));

    }
}
