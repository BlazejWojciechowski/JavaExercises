package Zadania.KlasyKonstruktory;

import Zadania.KlasyKonstruktory.Car;

public class CarDemo
{
    public static void main(String[] args)
    {
        Car c = new Car(2000, "Porsche");

        for (int i = 1; i <= 5; i++)
        {
            c.accelerate();
            System.out.println(c.getSpeed());
        }
        for (int b = 1; b <= 5; b++)
        {
            c.brake();
            System.out.println(c.getSpeed());
        }
    }
}
