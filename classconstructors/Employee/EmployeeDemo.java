package Zadania.KlasyKonstruktory;

import Zadania.KlasyKonstruktory.Employee;

public class EmployeeDemo
{
    public static void main(String[] args)
    {
        String name, department, position;
        int idNumber;

        Employee emplo1 = new Employee();
        Employee emplo2 = new Employee();
        Employee emplo3 = new Employee();

        emplo1.setName("Sara Magura");
        emplo2.setName("Marek Janczyk");
        emplo3.setName("Julia Rak");

        emplo1.setIdNumber(47899);
        emplo2.setIdNumber(39119);
        emplo3.setIdNumber(81774);

        emplo1.setDepartment("Rachunkowość");
        emplo2.setDepartment("Informatyka");
        emplo3.setDepartment("Produkcja");

        emplo1.setPosition("Wiceprezes");
        emplo2.setPosition("Programista");
        emplo3.setPosition("Inżynier");

        System.out.println("Imię i nazwisko\t\tIdentyfikator\t\tDział\t\tStanowisko");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(emplo1.getName() + "\t\t\t" + emplo1.getIdNumber() + "\t\t" + emplo1.getDepartment()
                             + "\t" + emplo1.getPosition());
        System.out.println(emplo2.getName() + "\t\t" + emplo2.getIdNumber() + "\t\t" + emplo2.getDepartment()
                             + "\t\t" + emplo2.getPosition());
        System.out.println(emplo3.getName() + "\t\t\t" + emplo3.getIdNumber() + "\t\t" + emplo3.getDepartment()
                             + "\t\t" + emplo3.getPosition());
    }
}
