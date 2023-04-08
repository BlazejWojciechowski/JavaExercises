package Zadania.KlasyKonstruktory;

import javax.swing.*;

public class Temperature2Demo {
    public static void main(String[] args) {
        boolean status;
        double temper;
        String input;
        input = JOptionPane.showInputDialog("Podaj temperaturę:");
        temper = Double.parseDouble(input);

        Temperature2 temp2 = new Temperature2(temper);
        temp2.setTemperature(temper);

        JOptionPane.showMessageDialog(null, "Przy temperaturze " + temper + " stopni celsjusza.");

        if (temp2.isEthylFreezing(temper) == true)
            JOptionPane.showMessageDialog(null, "Alkohol zamarza.");
        else if (temp2.isEthylBoiling(temper) == true)
            JOptionPane.showMessageDialog(null, "Alkohol wrze");
        else
            JOptionPane.showMessageDialog(null, "Nic się nie dzieje z alkoholem.");

        if (temp2.isOxygenFreezing(temper) == true)
            JOptionPane.showMessageDialog(null, "Tlen zamarza.");
        else if (temp2.isOxygenBoiling(temper) == true)
            JOptionPane.showMessageDialog(null, "Tlen wrze");
        else
            JOptionPane.showMessageDialog(null, "Nic się nie dzieje z tlenem.");

        if (temp2.isWaterFreezing(temper) == true)
            JOptionPane.showMessageDialog(null, "Woda zamarza.");
        else if (temp2.isWaterBoiling(temper) == true)
            JOptionPane.showMessageDialog(null, "Woda wrze");
        else
            JOptionPane.showMessageDialog(null, "Nic się nie dzieje z wodą.");
    }
}
