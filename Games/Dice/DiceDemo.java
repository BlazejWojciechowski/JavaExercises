package Game.Dice;

import Game.Dice.Dice;

import javax.swing.*;

public class DiceDemo
{
    public static void main(String[] args)
    {
        final int winPoints = 20;
        final int numRolls = 2;
        int player1Points = 0;
        int player2Points = 0;
        int status;

        while (player1Points < winPoints && player2Points < winPoints)
        {
            Dice player1 = new Dice();
            Dice player2 = new Dice();
            for (int i = 0; i < numRolls; i++)
            {
                JOptionPane.showMessageDialog(null, "Rzuca gracz numer 1.");
                player1.getNumber();
                status = player1.moreThrows();
                if (status == 0)
                    break;
            }
            for (int j = 0; j < numRolls; j++)
            {
                JOptionPane.showMessageDialog(null, "Rzuca gracz numer 2.");
                player2.getNumber();
                status = player2.moreThrows();
                if (status == 0)
                    break;
            }
            player1Points = player1.theSame();
            JOptionPane.showMessageDialog(null, "Liczba punktów gracza numer 1: " + player1Points);
            player2Points = player2.theSame();
            JOptionPane.showMessageDialog(null, "Liczba punktów gracza numer 2: " + player2Points);
        }

        if (player1Points > player2Points)
            JOptionPane.showMessageDialog(null, "Wygrał gracz numer 1.");
        else if (player2Points > player1Points)
            JOptionPane.showMessageDialog(null, "Wygrał gracz numer 2.");
        else
            JOptionPane.showMessageDialog(null, "Remis");
    }
}
