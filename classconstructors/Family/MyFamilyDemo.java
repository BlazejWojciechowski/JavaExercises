package Zadania.KlasyKonstruktory;

import Zadania.KlasyKonstruktory.MyFamily;

public class MyFamilyDemo {
    public static void main(String[] args) {
        MyFamily person1 = new MyFamily("Błażej Wojciechowski", "Łąkowa 29/1", 30, 733596457);
        MyFamily person2 = new MyFamily("Karolina Radtke", "Amona 38H", 23, 518893670);
        MyFamily person3 = new MyFamily("Barbara Wojciechowska", "Poznanska 10/50", 1, 590567894);

        System.out.println("Imię i nazwisko\t\tAdres\t\tWiek\t\tnumer telefonu");
        System.out.println("-------------------------------------------------------");
        System.out.println(person1.getPersonalName() + "\t\t" + person1.getAdress() + "\t\t"
                            + person1.getAge() + "\t\t" + person1.getPhone());
        System.out.println(person2.getPersonalName() + "\t\t\t\t" + person2.getAdress() + "\t\t"
                + person2.getAge() + "\t\t" + person2.getPhone());
        System.out.println(person3.getPersonalName() + "\t\t" + person3.getAdress() + "\t\t"
                + person3.getAge() + "\t\t" + person3.getPhone());
    }
}
