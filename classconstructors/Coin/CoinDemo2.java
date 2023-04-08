package Zadania.KlasyKonstruktory;

import javax.swing.*;

public class CoinDemo2 {
    public static void main(String[] args) {
        final int NUM_SIDES = 2;
        Coin player1 = new Coin();
        Coin player2 = new Coin();
        String input, side;

        int player1Points = 0;
        int player2Points = 0;

        player1.toss(2);
        side = player1.getSideUp();
        JOptionPane.showMessageDialog(null, side);

        while (player1Points == 5 && player2Points == 5);{
            input = JOptionPane.showInputDialog("Player 1 : 'orzeł' czy 'reszka' ?");
            player1.toss(NUM_SIDES);
            side = player1.getSideUp();
            if (side.equalsIgnoreCase(input))
                player1Points += 1;
            else
                player1Points -= 1;

            input = JOptionPane.showInputDialog("Player 2 : 'orzeł' czy 'reszka' ?");
            player2.toss(NUM_SIDES);
            side = player2.getSideUp();
            if (side.equalsIgnoreCase(input))
                player2Points += 1;
            else
                player2Points -= 1;
        }
        if (player1Points == 5)
            JOptionPane.showMessageDialog(null, "Wygrał gracz numer 1.");
        else if (player2Points == 5)
            JOptionPane.showMessageDialog(null, "Wygrał gracz numer 2.");
    }
}
