package Zadania.KlasyDziedziczenie;

import javax.swing.*;

public abstract class BankAccount
{
    private double accountBalance;
    private int depositCount;
    private int withdrawCount;
    private double annualyearRate;
    private double monthlyFees;

    public BankAccount()
    {}
    public BankAccount(double accountBalance, double annualyearRate)
    {
        this.accountBalance = accountBalance;
        this.annualyearRate = annualyearRate;
    }
    public void deposit(double deposit)
    {
        this.accountBalance += deposit;
        this.depositCount++;
        JOptionPane.showMessageDialog(null, String.format("Wpłacono na konto %.2f złotych.\nAktualny stan " +
                "konta to %.2f złotych.", deposit, accountBalance));
    }
    public void withdraw(double withdraw)
    {
        this.accountBalance -= withdraw;
        this.withdrawCount++;
        JOptionPane.showMessageDialog(null, String.format("Wybrano z konta %.2f złotych.\nAktualny stan " +
                                    "konta to %.2f złotych.", withdraw, accountBalance));
    }
    public void setMonthlyFees(double monthlyFees)
    {
        this.monthlyFees = monthlyFees;
    }
    public void calcInterest()
    {
        double yearRate = this.annualyearRate;
        double monthlyRate = (yearRate / 100) / 12;
        double monthlyInterest = this.accountBalance * monthlyRate;
        this.accountBalance += monthlyInterest;
    }
    public void monthlyProcess()
    {
        this.accountBalance -= this.monthlyFees;
        calcInterest();
        this.depositCount = 0;
        this.withdrawCount = 0;
        this.monthlyFees = 0;
    }

    public double getAccountBalance()
    {
        return accountBalance;
    }
    public int getDepositCount()
    {
        return depositCount;
    }
    public int getWithdrawCount()
    {
        return withdrawCount;
    }
}
