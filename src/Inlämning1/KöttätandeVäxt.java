package Inlämning1;

import javax.swing.*;

public class KöttätandeVäxt extends Växt {
        public KöttätandeVäxt(Double höjd, String namn) {
            super(höjd, namn);
            setVäxtNäring(EnumNäring.PROTEINDRYCK);
        }

        @Override
        public void beräknaNäring() {//POLYMORPHISM! Här använder jag min metod från interface till en sak och den har används till andra saker i andra klasser.
            setMängdNäring(EnumNäring.PROTEINDRYCK.bas + EnumNäring.PROTEINDRYCK.gånger * getHöjd());        //Metod för att beräkna mat
            JOptionPane.showMessageDialog(null, getNäring() + EnumNäring.PROTEINDRYCK.typ + ".");//Print getnäring ger mig allt förutom typen av näring, Enum ger mig typen av näring.

        }

    }

