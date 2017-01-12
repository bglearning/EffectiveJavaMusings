package ejm.chapter02.item03;

public enum Life {

    INSTANCE;

    public void shoutMessage() {
        System.out.println("Carpe diem!");
    }

    public static void main(String[] args) {
        Life life = Life.INSTANCE;
        life.shoutMessage();
    }

}
