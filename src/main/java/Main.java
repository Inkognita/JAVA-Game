public class Main {
    public static void main(String[] args) {
        GameManager game = new GameManager();
        CharacterFactory factory = new CharacterFactory();
        Character c1 = new King();
        Character c2 = new King();
        game.fight(c1, c2);
    }
}
