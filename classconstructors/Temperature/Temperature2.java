package Zadania.KlasyKonstruktory;

public class Temperature2
{
    private double temperature;

    public Temperature2(double temp)
    {
        temperature = temp;
    }

    public void setTemperature(double tem)
    {
        temperature = tem;
    }

    public double getTemperature()
    {
        return temperature;
    }
    public boolean isEthylFreezing(double te)
    {
        boolean status;
        if (te <= -114)
            status = true;
        else
            status = false;
        return status;
    }
    public boolean isEthylBoiling(double te)
    {
        boolean status;
        if (te >= 78)
            status = true;
        else
            status = false;
        return status;
    }
    public boolean isOxygenFreezing(double to)
    {
        boolean status;
        if (to <= -218)
            status = true;
        else
            status = false;
        return status;
    }
    public boolean isOxygenBoiling(double to)
    {
        boolean status;
        if (to >= -183)
            status = true;
        else
            status = false;
        return status;
    }
    public boolean isWaterFreezing(double tw)
    {
        boolean status;
        if (tw <= 0)
            status = true;
        else
            status = false;
        return status;
    }
    public boolean isWaterBoiling(double tw)
    {
        boolean status;
        if (tw >= 100)
            status = true;
        else
            status = false;
        return status;
    }
}
