public class Main {
    public static void main(String[] args) {
        GameManager game = new GameManager();
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        game.fight(c1, c2);
    }
}
