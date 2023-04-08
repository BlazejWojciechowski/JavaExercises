package Zadania.KlasyObiekty;

public class Area {
    private double radius;
    private double length;
    private double width;
    private int height;
    private static double area;
    public static void Area(double rad) {
        area = Math.PI * (rad * rad);
    }
    public static void Area(double len, double wid) {
        area = len * wid;
    }
    public static void Area(double r, int h) {
        area = Math.PI * (r * r) * h;
    }
    public static double getArea() {
        return area;
    }
}
