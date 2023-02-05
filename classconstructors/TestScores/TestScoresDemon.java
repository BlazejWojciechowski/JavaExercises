package Zadania.KlasyKonstruktory;

import Zadania.KlasyKonstruktory.TestScores;

import javax.swing.*;

public class TestScoresDemon
{
    public static void main(String[] args)
    {
        final int TEST_SCORES = 3;
        String input = "";
        double score, value = 0;
        TestScores avgScore = new TestScores();

        for (int i = 1; i <= TEST_SCORES; i++)
        {
        input = JOptionPane.showInputDialog("Podaj wynik " + i +  " testu:");
        score = Double.parseDouble(input);
        avgScore.setTestScore(score);
        value = avgScore.getTestScore();

        }
        JOptionPane.showMessageDialog(null, "Średni wynik to: " + avgScore.getAvgScore(value));
    }
}
