package Zadania.KlasyKonstruktory;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SavingAccountDepoWith {
    public static void main(String[] args) throws IOException {
        String input;
        double number, amount, yearRate, monthRate, akuDepo = 0, extra, akuWith = 0, sumAKu;

        SavingAccounts zad2 = new SavingAccounts();

        File file = new File ("Deposits.txt");
        Scanner inputFile = new Scanner(file);

        input = JOptionPane.showInputDialog("Podaj początkowy stan konta:");
        amount = Double.parseDouble(input);
        zad2.setAccountBalance(amount);

        input = JOptionPane.showInputDialog("Podaj roczną stopę oprocentowania:");
        yearRate = Double.parseDouble(input);
        yearRate = yearRate / 100;
        monthRate = yearRate / 12;
        zad2.setMonthRate(monthRate);

        while (inputFile.hasNext()) {
            number = inputFile.nextDouble();
            zad2.deposit(number);
            extra = number * zad2.getMonthRate();
            akuDepo += extra;
        }
        inputFile.close();

        File file2 = new File ("Withdrawals.txt");
        Scanner outpuFIle = new Scanner(file2);

        while (outpuFIle.hasNext()) {
            number = outpuFIle.nextDouble();
            zad2.withdraw(number);
            extra = number * zad2.getMonthRate();
            akuWith += extra;
        }
        sumAKu = akuDepo - akuWith;
        JOptionPane.showMessageDialog(null, String.format(
                                        "Stan końcowy: %.1f złotych.\nOtrzymane odsetki: " +
                                        "%.1f złotych.", zad2.getAccountBalance(), sumAKu));
    }
}
