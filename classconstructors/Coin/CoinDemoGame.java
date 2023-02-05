package Zadania.KlasyKonstruktory;

import javax.swing.*;

public class CoinDemoGame
{
    public static void main(String[] args)
    {
        final int NUM_SIDES = 2;
        int summ = 0;
        String input;
        int pickValue;

        Coin game = new Coin();


        do
        {
            input = JOptionPane.showInputDialog("Wybierz wartość: 5, 10, 20 groszy:");
            pickValue = Integer.parseInt(input);

            game.toss(NUM_SIDES);

            JOptionPane.showMessageDialog(null, "Wyrzucono " + game.getSideUp());

            if (game.getSideUp().equalsIgnoreCase("orzeł"))
                summ += pickValue;
            else
                summ += 0;

            JOptionPane.showMessageDialog(null,"Stan konta: " + summ + " groszy");
        }
        while (summ < 100);

        if (summ == 100)
            JOptionPane.showMessageDialog(null, "Wygrałes.");
        else
            JOptionPane.showMessageDialog(null, "Przegrałeś.");
    }
}
