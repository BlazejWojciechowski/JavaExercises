package Zadania.KlasyDziedziczenie;

import javax.swing.*;

public class SavingsAccount extends BankAccount
{
    private boolean status;

    public SavingsAccount()
    {}

    public SavingsAccount(double accountBalance, double annualyearRate)
    {
        super(accountBalance, annualyearRate);
    }
    @Override
    public void withdraw(double withdraw)
    {
        if (getAccountBalance() < 25)
            status = false;
        else
            status = true;

        if (status)
            super.withdraw(withdraw);
        else
            JOptionPane.showMessageDialog(null,String.format("Konto jest nieaktywne ponieważ stan konta " +
                    "wynosi: %.2f złotych.", getAccountBalance()));
    }
    @Override
    public void deposit(double deposit)
    {
            super.deposit(deposit);
    }
    @Override
    public void monthlyProcess()
    {
        int withdrawCount = getWithdrawCount();
        int summ = withdrawCount - 4;

        if (summ >= 1)
            setMonthlyFees(5 * summ);

        super.monthlyProcess();

        if (getAccountBalance() < 25)
            status = false;
        else
            status = true;
    }
}
