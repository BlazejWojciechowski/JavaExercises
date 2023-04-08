package Zadania.KlasyKonstruktory;

import javax.swing.*;

public class EyeDemo3 {
    public static void main(String[] args) {
        final int NUM_SIDES = 6;
        String input, answer;
        String thing;
        int sumAku = 0;
        int value, points;

        Eye fishingGame = new Eye(NUM_SIDES);

        do {
         fishingGame.roll();
         value = fishingGame.getValue();
         thing = fishingGame.getThing(value);
         JOptionPane.showMessageDialog(null, "Złowiłeś " + thing + ".");
         points = fishingGame.getPoints(thing);
         sumAku += points;
         answer = JOptionPane.showInputDialog("Chcesz coś jeszcze złowić? Wpisz 'tak' lub 'nie'.");
        }
        while (answer.equalsIgnoreCase("tak"));

        JOptionPane.showMessageDialog(null, "Ze złowionych rzeczy zebrałeś " + sumAku + " punktów.");
    }
}
