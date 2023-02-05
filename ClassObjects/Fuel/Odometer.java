package Zadania.KlasyObiekty;

public class Odometer
{
    private int meterStatus;

    public Odometer(int meterStatus)
    {
        this.meterStatus = meterStatus;
    }
    public void depositMeter(int meterStatus)
    {
        this.meterStatus += meterStatus;
    }
    public int getMeterStatus()
    {
        return meterStatus;
    }

}
