package Zadania.KlasyObiekty;

public class FuelGauge
{
    private int gasoline;

    public FuelGauge(int gasoline)
    {
        this.gasoline = gasoline;
    }
    public void depositGasoline(int gasoline)
    {
        this.gasoline += gasoline;
    }
    public void withdrawGasoline(int gasoline)
    {
        this.gasoline -= gasoline;
    }
    public int getGasoline()
    {
        return gasoline;
    }

}

