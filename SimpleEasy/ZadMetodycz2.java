package Zadania.Proste;

import javax.swing.*;
import java.util.Random;

public class ZadMetodycz2 {
    /* zad.1 Verification of digits
    public static void main(String[] args)
    {
        Random rand = new Random();
        boolean status;
        int number, rows;
        int numbersP = 0;
        int numbersNP = 0;

        String input;
        input = JOptionPane.showInputDialog(null, "Podaj liczbę cyfr które chcesz sprawdzić:");
        rows = Integer.parseInt(input);

        for (int i = 1; i <= rows; i++)
        {
            number = rand.nextInt(100) + 1;
            status = isPrime(number);
            if (status == true)
            {
                numbersP++;
            }
            else
                numbersNP++;
        }

        JOptionPane.showMessageDialog(null, "Po wylosowaniu " + rows + " liczb.\n" +
                                    "Mamy " + numbersP + " liczb parzystych oraz " + numbersNP + " liczb nieparzystych.");

    }

    public static boolean isPrime(int number)
    {
        boolean status;

        if (number % 2 == 0)
            status = true;
        else
            status = false;

        return status;
    }

     */

    /* zad.2 Bank account
    public static void main(String[] args)
    {
        String input;
        double futureValue, yearsPerc, countYears, presentValue;

        input = JOptionPane.showInputDialog("Podaj wartość przyszłą, którą chcemy uzyskać:");
        futureValue = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Podaj roczną stopę oprocentowania:");
        yearsPerc = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Podaj liczbę lat przez które pieniądze mają leżeć na lokacie:");
        countYears = Double.parseDouble(input);

        presentValue = presentValue(futureValue, yearsPerc, countYears);

        JOptionPane.showMessageDialog(null, "Żeby uzyskać kwotę " + futureValue +
                                        " złotych przy oprocentowaniu " + yearsPerc + "% i przez " + countYears + " lat.\n" +
                                        "Musiałbyś wpłacić dzisiaj: " + presentValue + " złotych.");
    }

    public static double presentValue (double futureValue, double yearPerc, double countYears)
    {
        double presentValue;
        yearPerc = yearPerc / 100;
        presentValue = futureValue / Math.pow(1 + yearPerc, countYears);
        return presentValue;
    }

     */
    /* zad.3 rock paper scissors
    public static void main(String[] args)
    {
        int computerNumber, playerNumber, gameScore;
        String computerScore, playerScore;
        do
        {
            computerNumber = getcomputerScore();
            computerScore = getgameScore(computerNumber);

            playerNumber = getplayerScore();
            playerScore = getgameScore(playerNumber);

            JOptionPane.showMessageDialog(null, "Komputer wybrał " + computerScore + ".");

            gameScore = gameScore(computerScore, playerScore);

            if (gameScore == 1)
                JOptionPane.showMessageDialog(null, "Wygrał komputer.");
            else if (gameScore == 0)
                JOptionPane.showMessageDialog(null, "Wygrałeś.");
            else if (gameScore == 2)
                JOptionPane.showMessageDialog(null, "Remis.");
        }
        while (gameScore == 1 || gameScore == 2);
    }

    public static String getgameScore(int number)
    {
        String score = "Nic";
        if (number == 1)
            score = "Kamień";
        else if (number == 2)
            score = "Papier";
        else if (number == 3)
            score = "Nożyce";
        return score;
    }
    public static int getcomputerScore ()
    {
        int computerNumber;
        Random rand = new Random();
        computerNumber = rand.nextInt(3) + 1;
        return computerNumber;
    }

    public static int getplayerScore ()
    {
        String input;
        int playerNumber;
        input = JOptionPane.showInputDialog("Wybierz:\n 1 - Kamień \t 2 - Papier \t 3 - Nożyce");
        playerNumber = Integer.parseInt(input);
        return playerNumber;
    }

    public static int gameScore (String computerScore, String playerScore)
    {
        int points;
        if (computerScore.equalsIgnoreCase("Kamień") && playerScore.equalsIgnoreCase("nożyce"))
        {
            points = 1;
        }
        else if (computerScore.equalsIgnoreCase("Nożyce") && playerScore.equalsIgnoreCase("papier"))
        {
            points = 1;
        }

        else if (computerScore.equalsIgnoreCase("Papier") && playerScore.equalsIgnoreCase("kamień"))
        {
            points = 1;
        }
        else if (playerScore.equalsIgnoreCase("Kamień") && computerScore.equalsIgnoreCase("nożyce"))
        {
            points = 0;
        }

        else if (playerScore.equalsIgnoreCase("nożyce") && computerScore.equalsIgnoreCase("papier"))
        {
            points = 0;
        }
        else if (playerScore.equalsIgnoreCase("Papier") && computerScore.equalsIgnoreCase("kamień"))
        {
            points = 0;
        }
        else
            points = 2;

        return points;
    }

     */

    /* zad.4 Check your color
    public static void main(String[] args)
    {
        boolean status;
        Random rand = new Random();
        String input, playerColor, computerColor;
        int countGames, playerNumber, computerNumber;
        int gamePoints = 0;

        input = JOptionPane.showInputDialog("Podaj liczbę gier w której chcesz odgadywać kolory:");
        countGames = Integer.parseInt(input);

        for (int i = 1; i <= countGames; i++)
        {
            computerNumber = getcomputerNumber();
            computerColor = getColor(computerNumber);

            playerNumber = getplayerNumber();
            playerColor = getColor(playerNumber);

            JOptionPane.showMessageDialog(null, "Wybrany losowo kolor to : " + computerColor + ".");

            status = getScore(computerColor, playerColor);

            if (status == true)
                gamePoints += 1;
            else
                gamePoints += 0;

        }

        JOptionPane.showMessageDialog(null, "Udało się odgadnąć kolor " + gamePoints + " razy.");
    }

    public static int getcomputerNumber ()
    {
        Random rand = new Random();
        int computerNumber;
        computerNumber = rand.nextInt(5) + 1;
        return computerNumber;
    }

    public static int getplayerNumber()
    {
        String input;
        int playerNumber;
        input = JOptionPane.showInputDialog("Podaj kolor:\n1 - Czerwony\n2 - Zielony\n3 - Niebieski\n4 - Pomarańczowy\n5 - Zółty");
        playerNumber = Integer.parseInt(input);
        return playerNumber;
    }

    public static String getColor(int number)
    {
        String color = "kolor";
        switch (number)
        {
            case 1:
                color = "Czerwony";
                break;
            case 2:
                color = "Zielony";
                break;
            case 3:
                color = "Niebieski";
                break;
            case 4:
                color = "Pomarańczowy";
                break;
            case 5:
                color = "Żółty";
                break;
        }
        return color;
    }

    public static boolean getScore (String computerColor, String playerColor)
    {
        boolean status;
        if (computerColor.equalsIgnoreCase(playerColor))
        {
            status = true;
        }
        else
            status = false;

        return status;
    }
     */
}
