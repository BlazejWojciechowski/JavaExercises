package Zadania.KlasyObiekty;

public class BankAccountDemo
{
    public static void main(String[] args)
    {
        BankAccount object1 = new BankAccount(1000);

        BankAccount object2 = new BankAccount(object1);

        System.out.println("Konto 1: " + object1);
        System.out.println("Konto 2: " + object2);

        if (object1 == object2)
            System.out.println("Wskazuja ten sam obiekt");
        else
            System.out.println("Różne obiekty.");
    }
}
