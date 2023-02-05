package Zadania.KlasyKonstruktory;

public class RoulettePocket
{
    private int pocketNumber;
    private String pocketColor;

    public RoulettePocket(int number)
    {
        pocketNumber = number;
    }

    public String getPocketColor(int numberP)
    {

        if (numberP == 0)
            pocketColor = "Zielony";

        else if (numberP >= 1 && numberP <= 10)
             if (numberP % 2 == 0)
                pocketColor = "Czarne";
            else
                pocketColor = "Czerwone";

        else if (numberP >= 11 && numberP <= 18)
            if (numberP % 2 == 0)
                pocketColor = "Czerwone";
            else
                pocketColor = "Czarne";

        else if (numberP >= 19 && numberP <= 28)
            if (numberP % 2 == 0)
                pocketColor = "Czarne";
            else
                pocketColor = "Czerwone";

        else if (numberP >= 29 && numberP <= 36)
            if (numberP % 2 == 0)
                pocketColor = "Czerwone";
            else
                pocketColor = "Czarne";

        else if (numberP > 36 || numberP < 0)
        {
            pocketColor = "Nieprawidłowa liczba spoza przedziału.";
        }

        return pocketColor;
    }
}
