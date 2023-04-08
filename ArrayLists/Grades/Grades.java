package Zadania.KlasyTabliceArrayList;

import javax.swing.*;

public class Grades {
    private final String[] students;
    private final int[] grades;
    private final double[][] scores;
    private final double[] avgScores;
    private final double[] lowestScore;
    public Grades(String[] stu, int[] gra, double[][] sco, double[] avg, double[] lowSco) {
        students = stu;
        grades = gra;
        scores = sco;
        avgScores = avg;
        lowestScore = lowSco;
    }
    public void setStudents() {
        String input;

        for (int index = 0; index < students.length; index++) {
        input = JOptionPane.showInputDialog("Podaj nazwę studenta numer " + (index +1));
        students[index] = input;
        }
    }
    public void setScores() {
        final int ROWS = 5;
        final int COLS = 4;

        String input;
        double score;

        for (int rows = 0; rows < ROWS; rows++) {
            for (int cols = 0; cols < COLS; cols++) {
                input = JOptionPane.showInputDialog("Wyniki studenta numer " + (rows + 1) + ".\tWynik numer " +
                                                    (cols + 1) + ".");
                score = Double.parseDouble(input);

                while (score < 0 || score > 100) {
                    JOptionPane.showMessageDialog(null, "Źle wprowadzone dane.");
                    input = JOptionPane.showInputDialog("Wyniki studenta numer " + (rows + 1) + ".\tWynik numer " +
                            (cols + 1) + ".");
                    score = Double.parseDouble(input);
                }
                scores[rows][cols] = score;
            }
        }
    }
    public void setGrades() {
        double avgValue;
        int grad = 0;

        for (int index = 0; index < grades.length; index++) {
            avgValue = getAvg(index);
            if (avgValue >= 90 && avgValue < 100)
                grad = 5;
            else if (avgValue >= 80)
                grad = 4;
            else if (avgValue >= 70)
                grad = 3;
            else if (avgValue >= 60)
                grad = 2;
            else if (avgValue <= 59 && avgValue >= 0)
                grad = 1;

            grades[index] = grad;
        }
    }
    public void setAvgScores() {
        final int ROWS = 5;
        final int COLS = 4;
        int row, col;
        double avgSc;
        double lowestScore;

        for (row = 0; row < ROWS; row++) {
            double sumRows = 0;
            for (col = 0; col < COLS; col++) {
               sumRows += scores[row][col];
            }

            avgSc = (sumRows - getlowestScore(row)) / (COLS - 1);
            avgScores[row] = avgSc;
        }
    }
    public void setlowestScore() {
        double lowest;
        final int ROWS = 5;
        final int COLS = 4;
        int row;

        for (row = 0; row < ROWS; row++) {
            int col = 0;
            lowest = scores[row][col];
            for (col = 0; col < COLS; col++) {
                if (scores[row][col] < lowest )
                    lowest = scores[row][col];
            }
            lowestScore[row] = lowest;
        }
    }
    public void showValues() {

        final int ROWS = 5;

        int row;
        String input;

        for (row = 0; row < ROWS; row++) {
                JOptionPane.showMessageDialog(null, String.format("%s ma średnią " +
                                            "%.1f oraz ocenę %d \n", getStuds(row), getAvg(row), getGrade(row)));
        }
    }
    public String getStuds(int value) {
        String studen;
        studen = students[value];
        return studen;
    }
    public double getAvg(int value) {
        double avgSco;
        avgSco = avgScores[value];
        return avgSco;
    }
    public int getGrade(int value) {
        int grad;
        grad = grades[value];
        return grad;
    }
    public double getlowestScore(int value) {
        double lowest;
        lowest = lowestScore[value];
        return lowest;
    }
}
