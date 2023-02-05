package Zadania.KlasyDziedziczenie;

import Zadania.Wyjątki.InvalidEmployeeNumber;
import Zadania.Wyjątki.InvalidPayRate;
import Zadania.Wyjątki.InvalidShift;

public class ProductionWorker extends Employee
{
    private int shift;
    private double payRate;


    public ProductionWorker(String workerName, String hireDate, String workerID, int shift, double payRate) throws InvalidEmployeeNumber, InvalidShift, InvalidPayRate {
        super(workerName, hireDate, workerID);

        if (shift > 2 || shift < 1)
            throw new  InvalidShift();

        this.shift = shift;

        if (payRate < 0)
            throw new InvalidPayRate();

        this.payRate = payRate;
    }

    public int getShift()
    {
        return shift;
    }
    public double getPayRate()
    {
        return payRate;
    }

}
