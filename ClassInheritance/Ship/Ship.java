package Zadania.KlasyDziedziczenie;

public class Ship
{
    private String nameShip;
    private String yearBuilt;

    public Ship()
    {}
    public Ship(String nameShip, String yearBuilt)
    {
        this.nameShip = nameShip;
        this.yearBuilt = yearBuilt;
    }
    public String getNameShip()
    {
        return nameShip;
    }
    public String getYearBuilt()
    {
        return yearBuilt;
    }
    public String toString()
    {
        String str;
        str = "Nazwa statku: " + nameShip + "\nRok budowy: " + yearBuilt;
        return str;
    }

}
