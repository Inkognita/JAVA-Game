import org.junit.Test;

import static org.junit.Assert.*;

public class TestKnight {
    @Test
    public void testInitialisation() {
        for (int i = 0; i < 100; i++) {
            Knight knight = new Knight();
            assertEquals(true, ((2 <= knight.getHp()) && (12 >= knight.getHp())));
            assertEquals(true, ((2 <= knight.getPower()) && (21 >= knight.getPower())));
            assertEquals(true, knight.isAlive());
        }
    }

    @Test
    public void testKick() {
        Knight KnightKicker = new Knight();
        Knight KnightVictim = new Knight();
        KnightVictim.setHp(100);
        KnightKicker.setHp(5);
        KnightKicker.kick(KnightVictim);
        assertEquals(true, KnightVictim.isAlive());
        for (int i = 0; i < 100; i++) {
            KnightVictim.setHp(100);
            KnightKicker.kick(KnightVictim);
            assertEquals(true, (KnightKicker.getPower() >= (100 - KnightVictim.getHp())));
        }
    }
}
