public class Knight extends Character {
    private KickBehaviour kickBehaviour = new Sword();

    public Knight() {
        super(2, 12, 2, 21);
    }

    @Override
    void kick(Character c) {
        kickBehaviour.kick(this, c);
    }
}
