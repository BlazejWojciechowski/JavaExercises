package Zadania.KlasyTabliceArrayList;

import javax.swing.*;

public class PayrollDemo
{
    public static void main(String[] args)
    {
        final int NUM = 7;
        String input;

        int[] employeeId = {565, 452, 789, 877, 845, 130, 758};
        int[] hours = new int[NUM];
        double[] payRate = new double[NUM];
        double[] wages = new double[NUM];


        for (int index = 0; index <employeeId.length; index++)
        {
            input = JOptionPane.showInputDialog("Podaj liczbę godzin pracownika o ID " + employeeId[index]);
            hours[index] = Integer.parseInt(input);
            while (hours[index] < 0)
            {
                JOptionPane.showMessageDialog(null, "Niepoprawna liczba godzin.");
                input = JOptionPane.showInputDialog("Podaj liczbę godzin pracownika o ID " + employeeId[index]);
                hours[index] = Integer.parseInt(input);
            }

            input = JOptionPane.showInputDialog("Podaj stawkę godzinową pracownika o ID " + employeeId[index]);
            payRate[index] = Double.parseDouble(input);
            while (payRate[index] < 13.70)
            {
                JOptionPane.showMessageDialog(null, "Niepoprawna stawka godzinowa.");
                input = JOptionPane.showInputDialog("Podaj stawkę godzinową pracownika o ID " + employeeId[index]);
                payRate[index] = Double.parseDouble(input);
            }
            wages[index] = hours[index] * payRate[index];
        }


        for (int index = 0; index < employeeId.length; index++)
        {
            JOptionPane.showMessageDialog(null,String.format("Pracownik od ID %1d ma przepracowanych godzin" +
                                        " %1d. Stawkę godzinową %.1f złotych brutto na godzinę oraz wypłaty w tym tygodniu" +
                                        " %.1f złotych.", employeeId[index], hours[index], payRate[index], wages[index]));
        }
    }
}
