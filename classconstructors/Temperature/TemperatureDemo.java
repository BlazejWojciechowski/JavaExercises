package Zadania.KlasyKonstruktory;

import Zadania.KlasyKonstruktory.Temperature;

import javax.swing.*;

public class TemperatureDemo
{
    public static void main(String[] args)
    {
        String input;
        double ftemp;

        Temperature temp = new Temperature(0);

        input = JOptionPane.showInputDialog("Podaj temperaturę w stopniach Fahrenheita");
        ftemp = Double.parseDouble(input);

        temp.setFahrenheit(ftemp);

        JOptionPane.showMessageDialog(null, String.format("Stopnie w celsjuszach %.1f stopni.\nStopnie w kelwinach " +
                                        "%.1f stopni.", temp.getcelsius(ftemp), temp.getkelvin(ftemp)));


    }
}
