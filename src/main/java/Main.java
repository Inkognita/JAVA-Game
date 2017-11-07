public class Main {
    public static void main(String[] args) {
        GameManager game = new GameManager();
        CharacterFactory factory = new CharacterFactory();
        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();
        game.fight(c1, c2);
    }
}
