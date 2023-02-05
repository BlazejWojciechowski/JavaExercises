package Zadania.KlasyKonstruktory;

import java.util.Random;

public class Eye
{
    private int sides;
    private int value;
    private String thing;
    private int points;

    public Eye(int numSides)
    {
        sides = numSides;
    }

    public void roll()
    {
        Random rand = new Random();

        value = rand.nextInt(sides) + 1;
    }

    public int getSides()
    {
        return sides;
    }

    public int getValue()
    {
        return value;
    }

    public String getThing(int number)
    {
        switch (number)
        {
            case 1:
                thing = "but";
                break;
            case 2:
                thing = "mała rybka";
                break;
            case 3:
                thing = "rybka";
                break;
            case 4:
                thing = "duża rybka";
                break;
            case 5:
                thing = "portfel";
                break;
            case 6:
                thing = "złota rybka";
                break;
        }
        return thing;
    }
    public int getPoints(String name)
    {
        if (thing.equalsIgnoreCase("but"))
            points = 1;
        else if (thing.equalsIgnoreCase("mała rybka"))
            points = 5;
        else if (thing.equalsIgnoreCase("rybka"))
            points = 10;
        else if (thing.equalsIgnoreCase("duża rybka"))
            points = 20;
        else if (thing.equalsIgnoreCase("portfel"))
            points = 50;
        else if (thing.equalsIgnoreCase("złota rybka"))
            points = 100;
        return points;
    }
}
