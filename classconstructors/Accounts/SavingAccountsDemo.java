package Zadania.KlasyKonstruktory;

import javax.swing.*;

public class SavingAccountsDemo {
    public static void main(String[] args) {
        String input;
        double rate, balance, yearRate, monthRate, value, amount;
        int months;
        double akuDepoValue = 0, akuWithValue = 0, akuRateValue = 0;

        input = JOptionPane.showInputDialog("Podaj roczną stopę oprocentowania jako liczbe całkowitą:");
        rate = Double.parseDouble(input);
        yearRate = rate / 100;
        monthRate = yearRate / 12;

        input = JOptionPane.showInputDialog("Podaj liczbę miesięcy odsetek:");
        months = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Podaj początkowy stan konta:");
        balance = Double.parseDouble(input);

        SavingAccounts sa = new SavingAccounts(monthRate, balance,  months);

        for (int i = 1; i <= sa.getMonthsNumber(); i++) {
            input = JOptionPane.showInputDialog("Podaj kwotę zdeponowaną w " + i + " miesiącu na koncie:");
            value = Double.parseDouble(input);
            akuDepoValue += value;
            sa.deposit(value);

            input = JOptionPane.showInputDialog("Podaj kwotę wybraną w tym miesiącu z konta:");
            value = Double.parseDouble(input);
            akuWithValue += value;
            sa.withdraw(value);

            amount = sa.getMonthRate() * sa.getAccountBalance();
            akuRateValue += amount;
            sa.deposit(amount);
        }
        JOptionPane.showMessageDialog(null, String.format
                                    "Stan końcowy: %.1f złotych.\nŁączna suma" +
                                    " zdeponowanych środków: %.1f złotych.\nŁączna suma wypłaconych środków: %.1f " +
                                            "złotych.\nŁączna wartość odsetek: %.1f złotych.",
                                    sa.getAccountBalance(), akuDepoValue, akuWithValue, akuRateValue));
    }
}
