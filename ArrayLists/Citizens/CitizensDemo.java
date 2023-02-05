package Zadania.KlasyTabliceArrayList;

import javax.swing.*;
import java.io.IOException;

public class CitizensDemo
{
    public static void main(String[] args) throws IOException
    {
        final int NUM = 41;
        int[] citiNumber = new int[NUM];

        double avg;
        int highestyear;
        int lowestyear;

        Citizens citi = new Citizens(citiNumber);

        citi.setNumberCitizens();

        avg = citi.getAvg();

        highestyear =  citi.getHighest();
        lowestyear = citi.getLowest();

        JOptionPane.showMessageDialog(null, String.format("Średni przyrost z 41 lat to %.2f tys. populacji." +
                                    "\nNajwiększy przyrost był w %d roku.\nNajmniejszy przyrost był w %d roku",
                                    avg, (highestyear + 1949), (lowestyear + 1949)));

    }
}
