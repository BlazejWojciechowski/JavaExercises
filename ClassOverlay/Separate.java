package Zadania.KlasyNakładkowe;

import javax.swing.*;

public class Separate {
    public static void main(String[] args) {
        String input;
        char ch;

        input = JOptionPane.showInputDialog("Podaj łańcuch znaków w formie: 'JeszczePolskaNieZgineła'");
        StringBuilder strb = new StringBuilder(input);

        for (int row = 1; row < input.length(); row++) {
            ch = strb.charAt(row);
            if (Character.isUpperCase(ch)) {
                strb.setCharAt(row, Character.toLowerCase(ch));
                strb.insert(row , ' ');
            }
        }
        JOptionPane.showMessageDialog(null, strb.toString());
    }
}
