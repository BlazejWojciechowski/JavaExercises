package Zadania.KlasyKonstruktory;

import javax.swing.*;

public class EyeDemo
{
    public static void main(String[] args)
    {
        final int DIE1_SIDES = 6;
        int computerValue = 0, playerValue = 0;
        boolean status;
        int value1,value2, amount;
        String answer;

        Eye die1 = new Eye(DIE1_SIDES);
        Eye die2 = new Eye(DIE1_SIDES);

        do
        {
            value1 = die1.getValue();
            value2 = die2.getValue();
            amount = value1 + value2;
            computerValue += amount;

            die1.roll();
            die2.roll();
            value1 = die1.getValue();
            value2 = die2.getValue();
            amount = value1 + value2;
            playerValue += amount;

            JOptionPane.showMessageDialog(null, "Aktualnie masz " + playerValue);

            if (playerValue <= 21)
                status = true;
            else
                status = false;

            answer = JOptionPane.showInputDialog("Jeśli chcesz rzucać kostkami jeszcze raz? Wpisz 'tak'.");


        }
        while (answer.equalsIgnoreCase("tak") && status == true);

        JOptionPane.showMessageDialog(null, "Punkty komputera: " + computerValue);
        JOptionPane.showMessageDialog(null, "Punkty gracza: " + playerValue);

        if (computerValue <= 21 && playerValue <= 21)
        {
            if (computerValue > playerValue)
                System.out.println("Wygrywa komputer.");
            else if (playerValue > computerValue)
                System.out.println("Wygrywa gracz");
            else
                System.out.println("Remis.");
        }
        if (playerValue > 21 || computerValue > 21)
        {
            if (playerValue < computerValue)
                System.out.println("Wygrywa gracz.");
            else
                System.out.println("Wygrywa komputer.");
        }
        if (playerValue > 21 && computerValue > 21)
            System.out.println("Nikt nie wygrywa.");

    }
}
