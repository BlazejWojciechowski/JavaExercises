package Zadania.KlasyObiekty;

import java.util.Random;

public class Player
{
    private int sides;
    private int points;
    private int value;


    public Player(int sides ,int points)
    {
        this.sides = sides;
        this.points = points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }
    public void plusPoints()
    {
        Random rand = new Random();
        value = rand.nextInt(sides + 1);
        this.points += value;
    }
    public void minusPoints()
    {
        Random rand = new Random();
        value = rand.nextInt(sides + 1);
        this.points -= value;
    }
    public int getPoints()
    {
        return points;
    }
}
