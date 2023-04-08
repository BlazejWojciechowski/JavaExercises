package Zadania.KlasyKonstruktory;

public class PoliceOfficer {
    private String officerName;
    private int officerID;
    public PoliceOfficer(String officerName, int officerID) {
        this.officerName = officerName;
        this.officerID = officerID;
    }
    public String getOfficerName() {
        return officerName;
    }
    public int getOfficerID() {
        return officerID;
    }
}