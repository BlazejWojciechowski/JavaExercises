package Zadania.KlasyDziedziczenie;

import Zadania.Wyjątki.InvalidEmployeeNumber;

public class ShiftSuperVisor extends Employee
{
    private double yearPay;
    private double bonus;

    public ShiftSuperVisor(String workerName, String hireDate, String workerID, double yearPay, double bonus) throws InvalidEmployeeNumber {
        super(workerName, hireDate,workerID);
        this.yearPay = yearPay;
        this.bonus = bonus;
    }
    public double getYearPay()
    {
        return yearPay;
    }
    public double getBonus()
    {
        return bonus;
    }
}
