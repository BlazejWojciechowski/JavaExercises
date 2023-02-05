package Zadania.KlasyObiekty;

import javax.swing.*;

public class PlayerDemo
{
    public static void main(String[] args)
    {
        String player = "player";

        String input;
        int numPlayers, numSides, numPoints;
        int number = 1;
        int player1Points = 50, player2Points = 50;

        input = JOptionPane.showInputDialog("Podaj liczbę graczy:");
        numPlayers = Integer.parseInt(input);


        input = JOptionPane.showInputDialog("Podaj liczbę ścianek kostki");
        numSides = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Podaj liczbę punktów początkowych");
        numPoints = Integer.parseInt(input);

        Player game = new Player(numSides,numPoints);

        do
        {
            game.setPoints(player1Points);
            game.minusPoints();
            player1Points = game.getPoints();
            JOptionPane.showMessageDialog(null ,"Punkty gracza numer 1:\t" + player1Points);
            game.setPoints(player2Points);
            game.minusPoints();
            player2Points = game.getPoints();
            JOptionPane.showMessageDialog(null, "Punkty gracza numer 2:\t" + player2Points);
            game.setPoints(player1Points);
            if (player1Points == 1)
            {
                JOptionPane.showMessageDialog(null, "Gracz numer 1 wygrał");
                break;
            }
            else if (player2Points == 1)
            {
                JOptionPane.showMessageDialog(null, "Gracz numer 2 wygrał");
                break;
            }
            if (player1Points < 1)
            {
                game.setPoints(player1Points);
                game.plusPoints();
                player1Points = game.getPoints();
            } else if (player2Points < 1)
            {
                game.setPoints(player2Points);
                game.plusPoints();
                player2Points = game.getPoints();
            }

        }
        while (player1Points > 1 && player2Points > 1);
    }
}
