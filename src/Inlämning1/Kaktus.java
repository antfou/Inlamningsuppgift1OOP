package Inlämning1;

import javax.swing.*;

public class Kaktus extends Växt {
    public Kaktus(Double höjd, String namn) {
        super(höjd, namn);
        setVäxtNäring(EnumNäring.MINERALVATTEN);
    }

    @Override
    public void beräknaNäring() { //POLYMORPHISM! Här använder jag min metod från interface till en sak och den har används till andra saker i andra klasser.
        setMängdNäring(EnumNäring.MINERALVATTEN.bas);        //Metod för att beräkna mat
        JOptionPane.showMessageDialog(null, getNäring() + EnumNäring.MINERALVATTEN.typ + "."); //Print getnäring ger mig allt föruto typen av näring, Enum ger mig typen.

    }
}
