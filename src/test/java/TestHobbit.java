import org.junit.Test;
import static org.junit.Assert.*;

public class TestHobbit {
    @Test
    public void testInitialisation(){
        Hobbit hobbit = new Hobbit();
        assertEquals(3, hobbit.getHp());
        assertEquals(0, hobbit.getPower());
        assertEquals(true, hobbit.isAlive());
        hobbit.setHp(0);
        assertEquals(false, hobbit.isAlive());
    }

    @Test
    public void testKick(){
        Hobbit hobbit = new Hobbit();
        Hobbit kickHobbit = new Hobbit();
        hobbit.kick(kickHobbit);
        assertEquals(3, kickHobbit.getHp());
        assertEquals(0, kickHobbit.getPower());
    }
}
