package Zadania.KlasyTabliceArrayList;

public class GradesDemo {
    public static void main(String[] args) {
        final int NUM = 5;
        final int TESTS = 4;

        String[] students = new String[NUM];
        int[] grades = new int[NUM];
        double[][] scores = new double[NUM][TESTS];
        double[] avgScores = new double[NUM];
        double[] lowestScore = new double[NUM];

        Grades grade = new Grades(students, grades, scores, avgScores, lowestScore);

        grade.setStudents();
        grade.setScores();
        grade.setlowestScore();
        grade.setAvgScores();
        grade.setGrades();
        grade.showValues();
    }
}
