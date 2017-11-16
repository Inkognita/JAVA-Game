import org.junit.Test;
import static org.junit.Assert.*;

public class TestGameManager {
    @Test
    public void testElfs(){
        Elf a = new Elf();
        Elf b = new Elf();
        new GameManager().fight(a, b);
        assertEquals(true, b.isAlive());
        assertEquals(true, a.isAlive());
    }

    @Test
    public void testHobbits(){
        Hobbit a = new Hobbit();
        Hobbit b = new Hobbit();
        new GameManager().fight(a, b);
        assertEquals(true, b.isAlive());
        assertEquals(true, a.isAlive());
    }

    @Test
    public void testKings(){
        King a = new King();
        King b = new King();
        new GameManager().fight(a, b);
        assertEquals(true, a.isAlive() ^ b.isAlive());
    }
}
