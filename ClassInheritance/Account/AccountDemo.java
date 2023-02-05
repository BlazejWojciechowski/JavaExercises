package Zadania.KlasyDziedziczenie;

import javax.swing.*;

public class AccountDemo
{
    public static void main (String[] args)
    {
    double accountBalance;
    double annualyearRate;
    double deposit, withdraw;
    String input;
    int choice;
    String answer;

    input = JOptionPane.showInputDialog("Podaj początkowy stan konta");
    accountBalance = Double.parseDouble(input);
    input = JOptionPane.showInputDialog("Podaj roczne oprocentowanie");
    annualyearRate = Double.parseDouble(input);

    SavingsAccount account1 = new SavingsAccount(accountBalance, annualyearRate);

    do
    {
     input = JOptionPane.showInputDialog("1 - stan konta | 2 - wypłata gotówki | 3 - wpłata gotówki");
     choice = Integer.parseInt(input);
     if (choice == 1)
         JOptionPane.showMessageDialog(null,String.format("Stan konta wynosi %.2f złotych.",
                                        account1.getAccountBalance()));
     else if (choice == 2)
     {
         input = JOptionPane.showInputDialog("Ile chcesz wypłacić?");
         withdraw = Double.parseDouble(input);
         account1.withdraw(withdraw);
     }
     else if (choice == 3)
     {
         input = JOptionPane.showInputDialog("Ile chcesz wpłacić?");
         deposit = Double.parseDouble(input);
         account1.deposit(deposit);
     }
     else
         JOptionPane.showMessageDialog(null, "Błędne dane.");

     answer = JOptionPane.showInputDialog("Jeśli chcesz zakończyć to wpisz 'koniec'");

    } while (!answer.equalsIgnoreCase("koniec"));

    account1.monthlyProcess();

    JOptionPane.showMessageDialog(null, String.format("Aktualny stan konta po miesięcznym rozliczeniu to " +
                                    "%.2f złotych.", account1.getAccountBalance()));

    }
}
