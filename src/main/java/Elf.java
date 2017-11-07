public class Elf extends Character {
    public Elf() {
        setHp(10);
        setPower(10);
    }

    void kick(Character c) {
        if (c.getPower() < getPower()) {
            c.setHp(0);
        } else {
            c.setPower(c.getPower() - 1);
        }
    }
}
