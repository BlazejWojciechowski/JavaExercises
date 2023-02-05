package Zadania.KlasyTabliceArrayList;

import javax.swing.*;
import java.io.IOException;

public class BaseBallDemo
{
    public static void main(String[] args) throws IOException
    {
        final int NUM = 104;
        String[] baseballteam = new String[NUM];

        Baseball bsb = new Baseball(baseballteam);
        bsb.setBaseballTeams();

        String input;
        input = JOptionPane.showInputDialog("Jaką drużynę chcesz sprawdzić?");

        int victories;
        victories = bsb.getVictoryNumber(input);

        JOptionPane.showMessageDialog(null, "Drużyna " + input + " w latach 1903 - 2009" +
                                    " wygrała " + victories + " razy.");

    }
}
