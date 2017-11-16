import org.junit.Test;

import static org.junit.Assert.*;

public class TestKing {
    @Test
    public void testInitialisation() {
        for (int i = 0; i < 100; i++) {
            King king = new King();
            assertEquals(true, ((5 <= king.getHp()) && (15 >= king.getHp())));
            assertEquals(true, ((5 <= king.getPower()) && (15 >= king.getPower())));
            assertEquals(true, king.isAlive());
        }
    }

    @Test
    public void testKick() {
        King kingKicker = new King();
        King kingVictim = new King();
        kingVictim.setHp(100);
        kingKicker.setHp(5);
        kingKicker.kick(kingVictim);
        assertEquals(true, kingVictim.isAlive());
        for (int i = 0; i < 100; i++) {
            kingVictim.setHp(100);
            kingKicker.kick(kingVictim);
            assertEquals(true, (kingKicker.getPower() >= (100 - kingVictim.getHp())));
        }
        kingKicker.setHp(100);
        kingKicker.kick(kingVictim);
        assertEquals(false, kingVictim.isAlive());
    }
}
