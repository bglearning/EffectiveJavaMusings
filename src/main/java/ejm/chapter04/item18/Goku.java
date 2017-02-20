package ejm.chapter04.item18;

public class Goku implements Saiyan {
    @Override
    public void attack() {
        System.out.println("Kamehameha!");
    }

    @Override
    public int getAttackPower() {
        return 7000;
    }
}
