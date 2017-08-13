package ejm.chapter06.item31;

public enum Ensemble {

    SOLO(1), DUET(2), TRIO(3);

    private int numberOfMusicians;

    private Ensemble(int numberOfMusicians) {
        this.numberOfMusicians = numberOfMusicians;
    }

    public int numberOfMusicians() {
        return numberOfMusicians;
    }

}
