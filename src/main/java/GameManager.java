import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GameManager {
    public void fight(Character c1, Character c2) {
        if (c1.getClass().equals(c2.getClass()) &&
                (c1.getClass().equals(Hobbit.class) || c2.getClass().equals(Elf.class))) {
            System.out.println("Both enemies are safe for each other");
            return;
        }
        System.out.println("The battle has started!");
        int temp_hp;
        int rand_int;
        ArrayList<Character> characters = new ArrayList<>(Arrays.asList(c1, c2));

        while (c1.isAlive() && c2.isAlive()) {
            rand_int = new Random().nextInt(2);
            c1 = characters.get(1 - rand_int);
            c2 = characters.get(rand_int);
            temp_hp = c2.getHp();
            c1.kick(c2);
            temp_hp -= c2.getHp();
            System.out.println(c1.getClass().getName() + (2 - rand_int) + " kicked " + c2.getClass().getName()
                    + (1 + rand_int) + " for " + temp_hp);
            System.out.print(c1.getClass().getName() + (2 - rand_int) + ": " + c1.getHp() + "HP; ");
            System.out.print(c2.getClass().getName() + (1 + rand_int) + ": " + c2.getHp() + "HP\n");

        }
        if (characters.get(0).isAlive()) {
            System.out.println(characters.get(0).getClass().getName() + "1 won!");
        } else {
            System.out.println(characters.get(1).getClass().getName() + "2 won!");
        }
    }
}
