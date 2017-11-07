import java.util.Random;

public abstract class Character {
    private int power;
    private int hp;

    public Character(){ }
    protected Character(int min_hp, int max_hp, int min_pwr, int max_pwr){
        hp = new Random().nextInt(max_hp - min_hp + 1) + min_hp;
        power = new Random().nextInt(max_pwr - min_pwr + 1) + min_pwr;
    }

    abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

    public int getHp() {
        return hp;
    }

    public int getPower(){
        return power;
    }

    public void setHp(int hp) {
        if (hp < 0){this.hp=0;}else{
        this.hp = hp;}
    }

    public void setPower(int power) {
        if (power < 0){this.power=0;}else{
        this.power = power;}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character)) return false;

        Character character = (Character) o;

        return power == character.power && hp == character.hp;
    }

    @Override
    public int hashCode() {
        int result = power;
        result = 31 * result + hp;
        return result;
    }
}
