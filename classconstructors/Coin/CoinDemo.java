package Zadania.KlasyKonstruktory;

public class CoinDemo
{
    public static void main(String[] args)
    {
        final int NUM_SIDES = 2;
        int sumReszki = 0;
        int sumOrly = 0;

        Coin game = new Coin();

        game.toss(NUM_SIDES);
        System.out.println("Początkowa wartość monety to: " + game.getSideUp());
        System.out.println();

        for (int i = 0; i < 20; i++)
        {
            game.toss(NUM_SIDES);
            System.out.println("Wyrzucona wartość monety to: " + game.getSideUp());
            System.out.println();
            if (game.getSideUp().equalsIgnoreCase("reszka"))
                sumReszki += 1;
            else
                sumOrly += 1;
        }

        System.out.println("Uzyskane wartości w grze to:\nReszki " + sumReszki + ".\nOrły " + sumOrly + ".");
    }
}
