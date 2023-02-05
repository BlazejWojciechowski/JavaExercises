package Recursion;

import javax.swing.*;

public class FactorialDemo
{
    public static void main (String[] args)
    {
        String input;
        int number;

        input = JOptionPane.showInputDialog("Podaj liczbę całkowitą, nieujemną.");
        number = Integer.parseInt(input);

        JOptionPane.showMessageDialog(null, number + "! wynosi " + factorial(number) + ".");
    }
    private static int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
