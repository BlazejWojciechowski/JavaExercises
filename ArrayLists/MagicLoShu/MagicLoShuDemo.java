package Zadania.KlasyTabliceArrayList;

import javax.swing.*;

public class MagicLoShuDemo
{
    public static void main(String[] args)
    {
        int[][] loShu = { {4, 9, 2},
                          {3, 5, 7},
                          {8, 1, 6} };

        boolean status;

        MagicLoShu magiclS = new MagicLoShu(loShu);
        status = magiclS.checkloShu();

        if (status)
            JOptionPane.showMessageDialog(null, "To magiczna kula Lo Shu.");
        else
            JOptionPane.showMessageDialog(null, "Coś tu jest nie tak.");

    }
}
