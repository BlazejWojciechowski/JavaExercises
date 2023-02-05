package Zadania.KlasyKonstruktory;

import javax.swing.*;

public class MonthDaysDemo
{
    public static void main(String[] args)
    {
        boolean status1, status2;
        String input;
        int monthDays, year;

        MonthDays md = new MonthDays(0, 0);

        input = JOptionPane.showInputDialog("Podaj miesiąc od 1 do 12:");
        monthDays = Integer.parseInt(input);

        md.setMonthday(monthDays);

        input = JOptionPane.showInputDialog("Podaj rok:");
        year = Integer.parseInt(input);

        md.setYear(year);

        if (md.getYears() % 100 == 0)
            status1 = true;
        else
            status1 = false;

        if (status1 == true)
            if (md.getYears() % 400 == 0)
                status1 = true;
        else
                status1 = false;

        if (md.getYears() % 100 != 0)
            if (md.getYears() % 4 == 0)
                status1 = true;
        else
            status1 = false;

        System.out.println("miesiąc " + md.getMonthday() + "\nRok " + md.getYears() + "\nwartość boolean: " + status1);
    }
}
