import org.reflections.Reflections;
import java.lang.reflect.InvocationTargetException;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCharacterFactory {
    @Test
    public void testCreatedCharacters(){
        CharacterFactory characterFactory = new CharacterFactory();
        List<Class> arr = new ArrayList<>(Arrays.asList(Hobbit.class, Knight.class, King.class, Elf.class));
        for (int i = 0; i < 25; i++) {
            Character res = characterFactory.createCharacter();
            if (res != null){
            assertEquals(true,arr.contains(res.getClass()));}}
    }
}
