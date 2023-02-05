package Zadania.KlasyObiekty;

public class ZooDemo
{
    public static void main(String[] args)
    {
        enum Pets {PSY, KOTY, PTAKI, CHOMIKI};

        Pets owczarek = Pets.PSY;
        Pets dachowiec = Pets.KOTY;
        Pets mewa = Pets.PTAKI;
        Pets chomik = Pets.CHOMIKI;

        System.out.println(owczarek.ordinal());
        System.out.println(dachowiec.ordinal());
        System.out.println(chomik.ordinal());
    }
}
