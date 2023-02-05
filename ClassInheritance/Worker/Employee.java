package Zadania.KlasyDziedziczenie;

import Zadania.Wyjątki.InvalidEmployeeNumber;

import javax.swing.*;

public class Employee extends InvalidEmployeeNumber
{
    private String workerName;
    private String hireDate;
    private String workerID;

    public Employee()
    {}

    public Employee(String workerName,String hireDate, String workerID) throws InvalidEmployeeNumber
    {
        this.workerName = workerName;
        this.hireDate = hireDate;

        char ch;
        boolean status = false;
        for (int i = 0; i < 3; i++)
        {
            ch = workerID.charAt(i);
            if (!(Character.isDigit(ch)))
                status = true;
        }
        if (!(workerID.charAt(3) == '-'))
            status = true;

        ch = workerID.charAt(workerID.charAt(4));

        if (!(Character.isLetter(ch)))
            status = true;

        if (status)
            throw new InvalidEmployeeNumber();

        this.workerID = workerID;
    }

    public String getWorkerName()
    {
        return workerName;
    }
    public String getWorkerID()
    {
        return workerID;
    }
    public String getHireDate()
    {
        return hireDate;
    }

    public String toString()
    {
        String str;

        str = "Nazwisko pracownika " + getWorkerName() + ".\nID pracownika " + getWorkerID() + ".\nData zatrudnienia "
                + getHireDate();

        return str;
    }
}
