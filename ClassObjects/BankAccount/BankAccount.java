package Zadania.KlasyObiekty;

public class BankAccount {
    private final double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public BankAccount(BankAccount object2) {
        balance = object2.balance;
    }
    public BankAccount copy() {
        return new BankAccount(balance);
    }
}
