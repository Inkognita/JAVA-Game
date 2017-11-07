public class Hobbit extends Character {
    public Hobbit() {
        setHp(3);
        setPower(0);
    }

    private void toCry() {
        System.out.println("I am crying");
    }

    void kick(Character c) {
        toCry();
    }
}

