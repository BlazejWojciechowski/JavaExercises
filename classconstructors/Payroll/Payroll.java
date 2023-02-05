package Zadania.KlasyKonstruktory;

import Zadania.Wyjątki.WrongHours;
import Zadania.Wyjątki.WrongID;
import Zadania.Wyjątki.WrongName;
import Zadania.Wyjątki.WrongPayRate;

public class Payroll
{
    double paidValue;
    private String name;
    private int idNumber;
    private double payRate;
    private double hours;

    public Payroll()
    {}
    public Payroll(String nam, int number)
    {
        name = nam;
        idNumber = number;
    }

    public void setName(String n)
    {
        if (n.equalsIgnoreCase(""))
            throw new WrongName();

        name = n;
    }

    public void setIdNumber(int id)
    {
        if (id == 0 || id < 0)
            throw new WrongID();

        idNumber = id;
    }

    public void setPayRate(double pay) throws WrongPayRate
    {
        if (pay < 0 || pay > 25)
            throw new WrongPayRate();

        payRate = pay;
    }

    public void setHours (double h) throws WrongHours
    {
        if (h < 0 || h > 84)
            throw new WrongHours();

        hours = h;
    }

    public String getName()
    {
        return name;
    }

    public int getIdNumber()
    {
        return idNumber;
    }

    public double getPayRate()
    {
        return payRate;
    }

    public double getHours()
    {
        return hours;
    }

    public double getPaidValue()
    {
        return payRate * hours;
    }
}
