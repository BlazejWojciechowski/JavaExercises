package Zadania.KlasyTabliceArrayList;

import java.io.IOException;

public class StepsDemo
{
    public static void main(String[] args) throws IOException
    {
        final int MONTHS = 12;
        final int DAYS = 365;

        int[] arraySteps = new int[DAYS];
        double[]monthSteps = new double[MONTHS];
        double[]avgSteps = new double[MONTHS];

        Steps yearSteps = new Steps(arraySteps, monthSteps, avgSteps);

        yearSteps.setArraySteps();
        yearSteps.setMonthSteps();
        yearSteps.setAvgSteps();
        yearSteps.showValues();

    }
}
