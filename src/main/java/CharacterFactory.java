import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    public static Character createCharacter(){
        Set<Class<? extends Character>> characters = new Reflections().getSubTypesOf(Character.class);
        Class<? extends Character> cls = (Class<? extends Character>) characters.toArray()[new Random().nextInt(characters.size())];
        try {
            return cls.getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
