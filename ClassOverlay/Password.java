package Zadania.KlasyNakładkowe;

import javax.swing.*;

public class Password {
    public static void main(String[] args) {
        boolean isValid = true;
        boolean isDig = true;
        boolean isBigLet = true;
        boolean isSmalllet = true;
        int index = 0;
        String input;

        do {
        input = JOptionPane.showInputDialog("Podaj hasło, składające się minimum z 6 znaków.\nPrzynajmniej jednej wielkiej" +
                                            " oraz małej litery i przynajmniej jednej cyfry.\n");
        if (input.length() < 6)
            isValid = false;

            if (Character.isDigit(input.charAt(index))) {
                isDig = false;
            }
            if (Character.isUpperCase(input.charAt(index))) {
                isBigLet = false;
            }
            if (Character.isLowerCase(input.charAt(index))) {
                isSmalllet = false;
            }
            index++;
        }
        while (!isValid && isDig && isBigLet && isSmalllet && index < input.length() );

        JOptionPane.showMessageDialog(null, "Podane hasło " + input + " jest prawidłowe.");
    }
}
