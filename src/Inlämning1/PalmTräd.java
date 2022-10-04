package Inlämning1;

import javax.swing.*;

public class PalmTräd extends Växt {
    public PalmTräd(Double höjd, String namn) {
        super(höjd, namn);
        setVäxtNäring(EnumNäring.KRANVATTEN);
    }

    @Override
    public void beräknaNäring() {//POLYMORPHISM! Här använder jag min metod från interface till en sak och den har används till andra saker i andra klasser.
        setMängdNäring(EnumNäring.KRANVATTEN.bas * getHöjd());        //Metod för att beräkna mat
        JOptionPane.showMessageDialog(null, getNäring() + EnumNäring.KRANVATTEN.typ + ".");//Print getnäring ger mig allt föruto typen av näring, Enum ger mig typen.

    }
}