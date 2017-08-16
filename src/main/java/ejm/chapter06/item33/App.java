package ejm.chapter06.item33;

public class App {

    public static void main(String[] args) {

        System.out.println(Transition.from(Phase.SOLID, Phase.GAS));
        System.out.println(Transition.from(Phase.GAS, Phase.LIQUID));
    }

}
