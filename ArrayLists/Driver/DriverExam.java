package Zadania.KlasyTabliceArrayList;

import javax.swing.*;

public class DriverExam {
    public static void main(String[] args) {
        String answer;
        int sumPointsCorr, sumPointsIncorr;
        boolean status;

        String[] examAnswers = {"b", "d", "a", "a", "c" +
                                "a", "b", "a", "c", "d" +
                                "b", "c", "d", "a", "d" +
                                "c", "c", "b", "d", "a" };

        String[] playerAnswers = new String[examAnswers.length];

        for (int index = 0; index < examAnswers.length; index++) {
        answer = JOptionPane.showInputDialog("Podaj odpowiedź do pytania numer " + (index + 1) + ":");
        playerAnswers[index] = answer;
        }
        JOptionPane.showMessageDialog(null, "Odpowiedzi poprawne: ");
        JOptionPane.showMessageDialog(null, "Odpowiedzi niepoprawne: ");
    }
    public boolean getpassed(int correct) {
        boolean status;
        if (correct >= 15)
            status = true;
        else
            status = false;

        return status;
    }
    public int gettotalCorrect(String[] exam, String[] player) {
        int index = 0;
        int sumPointsCorr = 0;

        while (index < exam.length) {
            if (exam[index].equalsIgnoreCase(player[index]))
                sumPointsCorr += 1;
            index++;
        }
        return sumPointsCorr;
    }
    public int gettotalIncorrect(String[] exams, String[] players) {
        int index = 0;
        int sumPointsIncorr = 0;

        while (index < exams.length) {
            if (!exams[index].equalsIgnoreCase(players[index]))
                sumPointsIncorr += 1;
            index++;
        }
        return sumPointsIncorr;
    }
    /*
    public void String[] questionMissed(String[] ex) {
        String[] questionMiss = new String[ex.length];

        int index = 0;
        String answer = "Brak odpowiedzi";

        while (ex[index].isEmpty()) {
            ex[index] = answer;
            index++;
        }
        //DriverExam strona 505, zadanie 6 - do poprawy

     */
}
