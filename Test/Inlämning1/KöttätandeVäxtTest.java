package Inlämning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeVäxtTest {
    KöttätandeVäxt sixten = new KöttätandeVäxt(0.7,"Sixten");

    @Test
    public final void köttätandeVäxtTest() {
        assert (sixten.getNamn().equalsIgnoreCase( "Sixten"));
        assert (sixten.getHöjd() == 0.7);
        assert (!sixten.getNamn().equalsIgnoreCase("Meatloaf"));
        assert (sixten.getHöjd() != 0.2);

    }
    @Test
    void beräknaNäring() {
        sixten.setMängdNäring((EnumNäring.PROTEINDRYCK.bas + EnumNäring.PROTEINDRYCK.gånger * sixten.getHöjd()));
        assert(sixten.getMängdNäring() == 0.24);
        assert(sixten.getMängdNäring() != 0.25);
    }
}