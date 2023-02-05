package Zadania.KlasyTabliceArrayList;

import javax.swing.*;
import java.util.Random;

public class MagicLoShu
{
    private final int[][] loShu;

    public MagicLoShu(int[][] loShu)
    {
        this.loShu = loShu;
    }
    public boolean checkloShu()
    {
        final int NUM = 3;
        boolean status = true;
        int ro = 0;
        int co = 0;
        int r = 2;
        int c = 2;
        int sum = 0;

        for (int row = 0; row < NUM; row++)
        {
            for (int col = 0; col < NUM; col++)
            {
                sum += loShu[row][col];
            }
            if (sum != 15)
            {
                status = false;
                break;
            }
            sum = 0;
        }
        sum = 0;
        for (int col = 0; col < NUM; col++)
        {
            for (int row = 0; row < NUM; row++)
            {
                sum += loShu[row][col];
            }
            if (sum != 15)
            {
                status = false;
                break;
            }
            sum = 0;
        }
        sum = 0;
        for (int index = 0; index < NUM; index++)
        {
            sum += loShu[ro][co];
            ro++;
            co++;
        }

            if (sum != 15)
            {
                status = false;
            }

        sum = 0;
        for (int index = 0; index < loShu.length; index++)
        {
            sum += loShu[r][c];
            r--;
            c--;
        }

            if (sum != 15)
            {
                status = false;
            }

        return status;
    }
}
