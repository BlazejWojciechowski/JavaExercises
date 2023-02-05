package Zadania.KlasyDziedziczenie;

public class CruiseShip extends Ship
{
    private int passengersNumber;

    public CruiseShip()
    {}
    public CruiseShip(String nameShip, String yearBuilt, int maxPassengers)
    {
        super(nameShip, yearBuilt);
        this.passengersNumber = maxPassengers;
    }
    public int getMaxPassengers()
    {
        return passengersNumber;
    }
    @Override
    public String toString()
    {
        String str;
        str = "Nazwa statku: " + getNameShip() + "\tMaksymalna liczba pasażerów: " + passengersNumber;
        return str;
    }
}
