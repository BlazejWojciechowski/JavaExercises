package Zadania.KlasyKonstruktory;

public class EyeDemo2 {
    public static void main(String[] args) {
        final int NUM_SIDES = 6;
        int computerValue = 0, playerValue = 0;
        int computerPoints = 0;
        int playerPoints = 0;

        Eye computerDie = new Eye(NUM_SIDES);
        Eye playerDie = new Eye(NUM_SIDES);

        for (int i = 0; i < 10; i++) {
            computerDie.roll();
            computerValue = computerDie.getValue();
            playerDie.roll();
            playerValue = playerDie.getValue();
            System.out.println("Komputer wyrzucił: " + computerValue + ".\nGracz wyrzucił: " + playerValue + ".");
            System.out.println();

            if (computerValue > playerValue)
                computerPoints += 1;
            else if (playerValue > computerValue)
                playerPoints += 1;
            else {
                computerPoints += 0;
                playerPoints += 0;
            }
        }
        if (computerPoints > playerPoints)
            System.out.println("Wygrywa komputer z liczbą punktów: " + computerPoints);
        else if (playerPoints > computerPoints)
            System.out.println("Wygrywa gracz z liczbą punktów: " + playerPoints);
        else if (playerPoints == computerPoints)
            System.out.println("Remis.");
    }
}
