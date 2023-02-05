package Zadania.KlasyObiekty;

import javax.swing.*;

public class FuelMeterDemo
{
    public static void main(String[] args)
    {
        String input;

        int gasoline, meterStatus;

        input = JOptionPane.showInputDialog("Podaj ilość benzyny w baku");
        gasoline = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Podaj stan licznika");
        meterStatus = Integer.parseInt(input);

        FuelGauge gauge = new FuelGauge(gasoline);
        Odometer meter = new Odometer(meterStatus);


        while (gasoline >= 1)
        {
            meter.depositMeter(20);
            gauge.withdrawGasoline(1);
            JOptionPane.showMessageDialog(null, "Aktualny przebieg " + meter.getMeterStatus() +
                                            "\nPozostało paliwa " + gauge.getGasoline());
            gasoline = gauge.getGasoline();
            if (gasoline == 1)
            {
                input = JOptionPane.showInputDialog("Brak paliwa.\nJeśli chcesz zatankować podaj cyfrę większa od 0." +
                                                    "\nJeśli nie to wpisz 0.");
                gasoline = Integer.parseInt(input);
                gauge.depositGasoline(gasoline);
                gasoline = gauge.getGasoline();
            }
        }
        JOptionPane.showMessageDialog(null,"Brak paliwa");
    }
}
