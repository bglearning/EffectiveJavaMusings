package ejm.chapter04.item18;

public class GodSaiyan implements Saiyan {
    private Saiyan saiyan;

    public GodSaiyan(Saiyan saiyan) {
        this.saiyan = saiyan;
    }

    @Override
    public void attack() {
        System.out.printf("God-mode ");
        saiyan.attack();
    }

    @Override
    public int getAttackPower() {
        return 1001 + saiyan.getAttackPower();
    }
}
