package Zadania.KlasyTabliceArrayList;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        int[] arrayList = new int[20];

        ArrayList array = new ArrayList(arrayList);

        array.setArrayList(arrayList);

        System.out.printf("Średnia liczba z tablicy o 20 losowych liczbach to %.1f . " +
                            "\nNajwiększa liczba to %1d .\nNajmniejsza liczba to %1d ." ,
                            array.getAvg(arrayList), array.getHighest(arrayList), array.getLowest(arrayList));
    }
}
