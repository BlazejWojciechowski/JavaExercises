package Zadania.KlasyKonstruktory;

public class SavingAccounts
{
    private double monthRate;
    private double accountBalance;
    private int monthsNumber;

    public SavingAccounts( double yearR, double accountB,  int monthsN)
    {
        monthRate = yearR;
        accountBalance = accountB;
        monthsNumber = monthsN;
    }
    public SavingAccounts()
    {
        accountBalance = 0;
    }

    public void setMonthRate(double year)
    {
        monthRate = year;
    }
    public void setAccountBalance(double account)
    {
        accountBalance = account;
    }
    public void setMonthsNumber(int month)
    {
        monthsNumber = month;
    }
    public void deposit(double amount)
    {
        accountBalance += amount;
    }
    public void withdraw(double amount)
    {
        accountBalance += amount;
    }
    public double getMonthRate()
    {
        return monthRate;
    }
    public double getAccountBalance()
    {
        return accountBalance;
    }
    public int getMonthsNumber()
    {
        return monthsNumber;
    }
}
