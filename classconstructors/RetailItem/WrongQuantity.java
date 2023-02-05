package Zadania.Wyjątki;

public class WrongQuantity extends Exception
{
    public WrongQuantity(int quantity)
    {
        super("Ujemna wartość liczby sztuk: " + quantity);
    }
}
