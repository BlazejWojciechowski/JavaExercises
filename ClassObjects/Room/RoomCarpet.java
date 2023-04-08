package Zadania.KlasyObiekty;

public class RoomCarpet {
    private RoomDimensions size;
    private double carpetCost;
    public RoomCarpet(RoomDimensions dim, double cost) {
        size = new RoomDimensions(dim);
        carpetCost = cost;
    }
    public double gettotalCost() {
        return carpetCost * RoomDimensions.getArea();
    }
    public String toString() {
        String str = "Cena za połozenie przy podanym pomieszczeniu i cenie za metr dywanu wyjdzie " +
                    gettotalCost() + " złotych.";
        return str;
    }
}
