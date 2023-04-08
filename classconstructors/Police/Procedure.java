package Zadania.KlasyKonstruktory;

public class Procedure {
    private String nameProcedure;
    private int dataProcedure;
    private String docProcedure;
    private double priceProcedure;
    public Procedure(String name, int data, String doc, double price) {
        nameProcedure = name;
        dataProcedure = data;
        docProcedure = doc;
        priceProcedure = price;
    }
    public void setNameProcedure(String nam) {
        nameProcedure = nam;
    }
    public void setDataProcedure(int dat) {
        dataProcedure = dat;
    }
    public void setDocProcedure(String doc) {
        docProcedure = doc;
    }
    public void setPriceProcedure(double pric) {
        priceProcedure = pric;
    }
    public String getNameProcedure() {
        return nameProcedure;
    }
    public int getDataProcedure() {
        return dataProcedure;
    }
    public String getDocProcedure() {
        return docProcedure;
    }
    public double getPriceProcedure() {
        return priceProcedure;
    }
}
