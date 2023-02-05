package Zadania.KlasyKonstruktory;

import Zadania.Wyjątki.WrongQuantity;
import Zadania.Wyjątki.WrongValue;

public class RetailItem
{
    private String description;
    private int unitsOnHand;
    private double price;
    private int buyUnits;

    public RetailItem()
    {}
    public RetailItem(double price, int unitsOnHand) throws WrongValue, WrongQuantity
    {
        if (price < 0)
            throw new WrongValue(price);

        this.price = price;

        if (unitsOnHand < 0)
            throw new WrongQuantity(unitsOnHand);

        this.unitsOnHand = unitsOnHand;
    }
    public RetailItem (String desc, int units,double pric)
    {
        description = desc;
        unitsOnHand = units;
        price = pric;
    }
    public RetailItem(RetailItem object, int buyUnits)
    {
        this.description = object.description;
        this.unitsOnHand = object.unitsOnHand;
        this.price = object.price;
        this.buyUnits = buyUnits;
    }

    public void setDescription(String des)
    {
        description = des;
    }

    public void setUnitsOnHand(int uni)
    {
        unitsOnHand = uni;
    }

    public void setPrice(double pr)
    {
        price = pr;
    }

    public String getDescription()
    {
        return description;
    }

    public int getUnitsOnHand()
    {
        return unitsOnHand;
    }

    public double getPrice()
    {
        return price;
    }
    public int getBuyUnits()
    {
        return buyUnits;
    }
    public double getSubtotal()
    {
        return price * buyUnits;
    }
    public double getTax()
    {
        return 0.23 * getSubtotal();
    }
    public double getTotal()
    {
        return getSubtotal() + getTax();
    }

}
