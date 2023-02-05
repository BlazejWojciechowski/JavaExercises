package Zadania.KlasyDziedziczenie;

public class PreferredCustomer extends  Customer
{
    private double valueofPurchases;
    private int bonusLevel;

    public PreferredCustomer()
    {}
    public PreferredCustomer(String name, String address, String phone, StringBuilder clientNumber, boolean status)
    {
        super(name, address, phone, clientNumber, status);
    }
    public void setValueofPurchases(double valueofPurchases)
    {
        this.valueofPurchases += valueofPurchases;
    }
    public double getValueofPurchases()
    {
        return valueofPurchases;
    }
    public void setBonusLevel()
    {
        if (valueofPurchases >= 2000)
            this.bonusLevel = 10;
        else if (valueofPurchases >= 1500)
            this.bonusLevel = 7;
        else if (valueofPurchases >= 1000)
            this.bonusLevel = 6;
        else if (valueofPurchases >= 500)
            this.bonusLevel = 5;
        else
            this.bonusLevel = 0;
    }
    public int getBonusLevel()
    {
        return bonusLevel;
    }

}
