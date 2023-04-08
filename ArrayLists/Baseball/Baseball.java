package Zadania.KlasyTabliceArrayList;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Baseball {
    private final String[] baseballTeams;

    public Baseball(String[] baseteam)
    {
        baseballTeams = baseteam;
    }
    public void setBaseballTeams() throws IOException {
        File file = new File("rzeczy.txt");
        Scanner outputFile = new Scanner(file);
        int index = 0;

        while (outputFile.hasNext()) {
            baseballTeams[index] = outputFile.nextLine();
            index++;
        }
    }
    public int getVictoryNumber(String team) {
        String name;
        int aku = 0;

        for (int index = 0; index < baseballTeams.length; index++) {
            if (team.equalsIgnoreCase(baseballTeams[index]))
                aku += 1;
        }
        return aku;
    }
}
