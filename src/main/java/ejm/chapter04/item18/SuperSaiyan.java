package ejm.chapter04.item18;

public class SuperSaiyan implements Saiyan {
    private Saiyan saiyan;

    public SuperSaiyan(Saiyan saiyan) {
        this.saiyan = saiyan;
    }

    @Override
    public void attack() {
        System.out.printf("Super ");
        saiyan.attack();
    }

    @Override
    public int getAttackPower() {
        return 1000 + saiyan.getAttackPower();
    }
}
