import org.junit.Test;

import static org.junit.Assert.*;

public class TestElf {
    @Test
    public void testInitialisation() {
        Elf testElf = new Elf();
        assertEquals(10, testElf.getHp());
        assertEquals(10, testElf.getPower());
        assertEquals(true, testElf.isAlive());
        testElf.setHp(0);
        assertEquals(false, testElf.isAlive());
    }

    @Test
    public void testEquals() {
        Elf testElf = new Elf();
        Elf resultElf = new Elf();
        assertEquals(testElf, resultElf);
    }

    @Test
    public void testKick() {
        Elf testElf = new Elf();
        Elf kicker = new Elf();
        kicker.kick(testElf);
        assertEquals(kicker.getPower() - 1, testElf.getPower());
        kicker.kick(testElf);
        assertFalse(testElf.isAlive());
    }
}
