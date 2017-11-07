public class King extends Character {
    private KickBehaviour kickBehaviour = new Sword();

    public King() {
        super(5, 15, 5, 15);
    }

    @Override
    void kick(Character c) {
        if (getHp() < 10) {
            kickBehaviour.kick(this, c);
        } else {
            kickBehaviour = (c1, c2) -> c2.setHp(0);
        }
    }
}
