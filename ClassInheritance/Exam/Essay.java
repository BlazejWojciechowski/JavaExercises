package Zadania.KlasyDziedziczenie;

import javax.swing.*;

public class Essay extends GradedActivity
{
    private double score;

    public Essay(double score)
    {
        this.score = score;
        super.setScore(score);
    }
    public double getScore()
    {
        return score;
    }

}
