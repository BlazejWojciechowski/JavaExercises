package Zadania.KlasyTabliceArrayList;

public class Payroll {
    private int[] employeeId;
    private int[] hours;
    private double[] payRate;
    private double[] wages;

    public Payroll(int[] iD, int[] h, double[]pay, double[] wag) {
        employeeId = iD;
        hours = h;
        payRate = pay;
        wages = wag;
    }
    public void setEmployeeId(int[] eiD) {
        employeeId = eiD;
    }
    public void setHours(int[] hou) {
        hours = hou;
    }
    public void setPayRate(double[] payR) {
        payRate = payR;
    }
    public void setWages(double[] wa) {
        wages = wa;
    }
    public int[] getEmployeeId() {
        return employeeId;
    }
    public int[] getHours() {
        return hours;
    }
    public double[] getPayRate(int id) {
        return payRate;
    }
    public double[] getWages(int id) {
        return wages;
    }
}
