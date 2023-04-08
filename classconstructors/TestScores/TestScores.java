package Zadania.KlasyKonstruktory;

public class TestScores {
    private double testScore;
    public TestScores() {
        testScore = 0.0;
    }
    public void setTestScore(double t) {
        testScore += t;
    }
    public double getTestScore() {
        return testScore;
    }
    public double getAvgScore(double value) {
        value = testScore / 3;

        return value;
    }
}
