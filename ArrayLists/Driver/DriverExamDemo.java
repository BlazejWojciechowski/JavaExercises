package Zadania.KlasyTabliceArrayList;

public class DriverExamDemo {
    private final String[] examAnswers = new String[20];
    private final String[] playerAnswers = new String[20];

    public DriverExamDemo(String[] eAnswers, String[] playAns) {
        for (int index = 0; index < eAnswers.length; index++) {
            examAnswers[index] = eAnswers[index];
        }
        for (int index = 0; index < playAns.length; index++) {
            playerAnswers[index] = playAns[index];
        }
    }
    public int totalCorrect() {
        int index = 0;
        int sumPointsCorr = 0;

        while (index < examAnswers.length) {
            if (examAnswers[index].equalsIgnoreCase(playerAnswers[index]))
                sumPointsCorr += 1;
            index++;
        }
        return sumPointsCorr;
    }
    public int totalIncorrect() {
        int index = 0;
        int sumPointsInc = 0;

        while (index < examAnswers.length) {
            if (examAnswers[index].equalsIgnoreCase(playerAnswers[index]))
                sumPointsInc += 1;
            index++;
        }
        return sumPointsInc;
    }
    public String[] questionMissed() {
        int index = 0;
        String[] questionMissed = new String[20];

        while (index < playerAnswers.length) {
            if (playerAnswers[index].equalsIgnoreCase(null))
                playerAnswers[index] = "Brak odpowiedzi";
        }
        return questionMissed;
    }
    public boolean passed(int correct) {
        boolean status;

        if (correct >= 15)
            status = true;
        else
            status = false;

        return status;
    }
}
