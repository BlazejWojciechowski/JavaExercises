package Zadania.KlasyTabliceArrayList;

import javax.swing.*;

public class QuestionDemo
{
    public static void main(String[] args)
    {
        String[] questions = new String[10];
        int[][] answers = new int[10][4];
        int[] correctAnswer = new int[10];

        final int PLA_NUM = 2;
        int player1Points = 0;
        int player2Points = 0;
        int index = 0;
        String que, input;
        int ans, correctans;

        Question quest = new Question(questions, answers, correctAnswer);

        quest.setQuestions();
        quest.setAnswers();
        quest.setCorrectAnswers();

        for (int player1 = 0; player1 < questions.length / PLA_NUM; player1++)
        {
            JOptionPane.showMessageDialog(null, "Odpowiada gracz numer 1.");
            que = quest.getQuestion(index);
            JOptionPane.showMessageDialog(null, que);
            quest.getAnswers(index);
            input = JOptionPane.showInputDialog("Podaj numer odpowiedzi:");
            ans = Integer.parseInt(input);
            correctans = quest.getCorrectanswer(index);
            player1Points += quest.getPoints(ans, correctans);
            index++;

            for (int player2 = 0; player2 < 1; player2++)
            {
                JOptionPane.showMessageDialog(null, "Odpowiada gracz numer 2.");
                que = quest.getQuestion(index);
                JOptionPane.showMessageDialog(null, que);
                quest.getAnswers(index);
                input = JOptionPane.showInputDialog("Podaj numer odpowiedzi:");
                ans = Integer.parseInt(input);
                correctans = quest.getCorrectanswer(index);
                player2Points += quest.getPoints(ans, correctans);
                index++;
            }
        }
        quest.showWinner(player1Points, player2Points);
    }
}

