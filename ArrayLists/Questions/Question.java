package Zadania.KlasyTabliceArrayList;

import javax.swing.*;

public class Question {
    private final String[] questions;
    private final int[][] answers;
    private final int[] correctAnswers;

    public Question(String[] questions, int[][] answers, int[] correctAnswers) {
        this.questions = questions;
        this.answers = answers;
        this.correctAnswers = correctAnswers;
    }
    public void setQuestions() {
        String input;

        for (int index = 0; index < questions.length; index++) {
            input = JOptionPane.showInputDialog("Podaj pytanie numer " + (index + 1) + " .");
            questions[index] = input;
        }
    }
    public void setAnswers() {
        String input;
        int answ;

        for (int row = 0; row < answers.length; row++) {
            for (int col = 0; col < answers[row].length; col++) {
                input = JOptionPane.showInputDialog("Podaj odpowiedzi do pytania numer " + (row + 1) + " ");
                answ = Integer.parseInt(input);
                answers[row][col] = answ;
            }
        }
    }
    public void setCorrectAnswers() {
        String input;
        int ans;

        for (int index = 0; index < correctAnswers.length; index++) {
            input = JOptionPane.showInputDialog("Podaj poprawną odpowiedź do pytania numer " + (index + 1) + " ");
            ans = Integer.parseInt(input);
            correctAnswers[index] = ans;
        }
    }
    public String getQuestion(int element) {
        String question;
        question = questions[element];
        return question;
    }
    public void getAnswers(int element) {
        String answer;
        System.out.println("Odpowiedzi do pytania numer " + (element + 1) + " to:");

        for (int index = 0; index < answers[element].length; index++) {
            System.out.println(answers[element][index]);
        }
    }
    public int getCorrectanswer(int element) {
        int answer;
        answer = correctAnswers[element];
        return answer;
    }
    public int getPoints(int answer, int correct) {
        boolean status;
        int point = 0;

        if (answer == correct)
            status = true;
        else
            status = false;

        if (status)
            point += 1;

        return point;
    }
    public void showWinner(int points1, int points2) {

        if (points1 > points2)
            JOptionPane.showMessageDialog(null, "Wygrał gracz numer 1.");
        else if (points2 > points1)
            JOptionPane.showMessageDialog(null, "Wygrał gracz numer 2.");
        else
            JOptionPane.showMessageDialog(null, "Remis");
    }
}
