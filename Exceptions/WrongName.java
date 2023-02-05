package Zadania.Wyjątki;

public class WrongName extends NullPointerException
{
    public WrongName()
    {
        super("Imię jest puste.");
    }
}
