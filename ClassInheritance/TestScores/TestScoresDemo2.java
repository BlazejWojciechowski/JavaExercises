package Zadania.Wyjątki;

import javax.swing.*;
import java.io.*;

public class TestScoresDemo2 extends TestScores
{
    public static void main(String[] args) throws IOException, ClassNotFoundException, NegativeValue {
        TestScores[] testSc = new TestScores[5];
        int[] tests = new int[4];
        String input;
        int score;

        for (int i = 0; i < testSc.length; i++)
        {
            for (int j = 0; j < tests.length; j++)
            {
                input = JOptionPane.showInputDialog("Podaj wynik testu numer " + (j + 1));
                score = Integer.parseInt(input);
                tests[j] = score;
            }

            testSc[i] = new TestScores(tests);
        }

        FileOutputStream outStream = new FileOutputStream("Myinfo.dat");
        ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);

        for (int i = 0; i < testSc.length; i++)
        {
            objectOutputFile.writeObject(testSc[i]);
            System.out.println(testSc[i]);
        }
        objectOutputFile.close();

        FileInputStream inStream = new FileInputStream("Myinfo.dat");
        ObjectInputStream objectInputFile = new ObjectInputStream(inStream);

        for (int i = 0; i < testSc.length; i++)
        {
            testSc[i] = (TestScores) objectInputFile.readObject();
        }

        objectInputFile.close();

        for (int i = 0; i < testSc.length; i++)
        {
            System.out.println("Wyniki studenta nr " + (i + 1) + " : " + testSc[i].avgScore());
        }

    }
}
