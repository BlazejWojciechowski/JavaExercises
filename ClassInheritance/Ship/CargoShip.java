package Zadania.KlasyDziedziczenie;

public class CargoShip extends Ship
{
    private int loadMax;

    public CargoShip()
    {}
    public CargoShip(String nameShip, String yearBuilt, int loadMax)
    {
        super(nameShip, yearBuilt);
        this.loadMax = loadMax;
    }
    public int getLoadMax()
    {
        return loadMax;
    }
    @Override
    public String toString()
    {
        String str;
        str = "Nazwa statku: " + getNameShip() + "\tMaksymalna ładowność w tonach: " + loadMax;
        return str;
    }
}
