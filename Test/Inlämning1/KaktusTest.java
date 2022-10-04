package Inlämning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {
     Kaktus sture = new Kaktus(0.8,"Sture");

    @Test
    public final void kaktusTest(){
        assert(sture.getNamn().equalsIgnoreCase("Sture"));
        assert(sture.getHöjd() == 0.8);
        assert(!sture.getNamn().equalsIgnoreCase("Igge"));
        assert(sture.getHöjd() != 0.4);
    }

    @Test
    void beräknaNäring() {
        sture.setMängdNäring(EnumNäring.MINERALVATTEN.bas);
        assert(sture.getMängdNäring() == 0.02);
        assert(sture.getMängdNäring() != 0.1);

    }
}