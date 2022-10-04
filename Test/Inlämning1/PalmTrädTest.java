package Inlämning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTrädTest {
    public PalmTräd pheobe = new PalmTräd(1.0,"Pheobe");

    @Test
    public final void palmTrädTest() {
        assert (pheobe.getNamn().equalsIgnoreCase("Pheobe"));
        assert (pheobe.getHöjd() == 1.0);
        assert (!pheobe.getNamn().equalsIgnoreCase("Anton"));
        assert (pheobe.getHöjd() != 0.2);
    }
    @Test
    void beräknaNäring() {
        pheobe.setMängdNäring(EnumNäring.KRANVATTEN.bas * pheobe.getHöjd());
        assert(pheobe.getMängdNäring() == 0.5);
        assert(pheobe.getMängdNäring() != 2.5);

    }
}