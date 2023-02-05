package Zadania.KlasyObiekty;

public class Circle
{
    private double radius;

    public Circle(double r)
    {
        radius = r;
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public String toString()
    {
        return getRadius() + "\n" + getArea();
    }
    public boolean equals(Circle object2)
    {
        boolean status;

        if (radius == object2.radius)
            status = true;
        else
            status = false;

        return status;
    }
    public boolean greaterThan(Circle object2)
    {
        double area;
        boolean status;
        area = getArea();
        if (object2.getArea() > area)
            status = true;
        else
            status = false;
        return status;
    }
}
