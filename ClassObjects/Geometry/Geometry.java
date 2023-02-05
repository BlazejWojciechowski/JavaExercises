package Zadania.KlasyObiekty;

public class Geometry
{
    private static double radius;
    private static double length;
    private static double width;
    private static double bottom;
    private static double height;

    public static double areaCircle(double radius)
    {
        return Math.PI * (radius * radius);
    }
    public static double areaBox(double length, double width)
    {
        return length * width;
    }
    public static double areaTriangle(double bottom, double height)
    {
        return bottom * height * 0.5;
    }
}
