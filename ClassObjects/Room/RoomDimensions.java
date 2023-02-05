package Zadania.KlasyObiekty;

public class RoomDimensions
{
    private static double length;
    private static double width;

    public RoomDimensions(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    public RoomDimensions(RoomDimensions object2)
    {
        this.length = object2.length;
        this.width = object2.width;
    }
    public static double getArea()
    {
        return length * width;
    }
    public String toString()
    {
        String str = "Pomieszczenie o długości " + length + " oraz szerokości " + width +
                        " ma pole " + getArea() + " metrów kwadratowych.";

        return str;
    }
}
