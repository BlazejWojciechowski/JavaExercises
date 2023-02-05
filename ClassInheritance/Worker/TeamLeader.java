package Zadania.KlasyDziedziczenie;

import Zadania.Wyjątki.InvalidEmployeeNumber;
import Zadania.Wyjątki.InvalidPayRate;
import Zadania.Wyjątki.InvalidShift;

public class TeamLeader extends ProductionWorker
{
    private double monthBonus;
    private final int requiredHours = 20;
    private int doneHours;

    public TeamLeader(String workerName,String hireDate, String workerID, int shift, double payrate, int doneHours) throws InvalidPayRate, InvalidShift, InvalidEmployeeNumber {
        super(workerName, hireDate, workerID, shift, payrate);
        this.doneHours = doneHours;

        if (this.doneHours >= requiredHours)
            this.monthBonus = 1000.0;
    }

    public double getMonthBonus()
    {
        return monthBonus;
    }


}
