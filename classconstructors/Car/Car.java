package Zadania.KlasyKonstruktory;

public class Car
{
    private int yearModel;
    private String make;
    private int speed;

    public Car(int model, String mak)
    {
        yearModel = model;
        make = mak;
        speed = 0;
    }

    public int getYearModel()
    {
        return yearModel;
    }

    public String getMake()
    {
        return make;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int accelerate()
    {
        speed += 5;
        return speed;
    }

    public int brake()
    {
        speed -= 5;
        return speed;
    }



}
