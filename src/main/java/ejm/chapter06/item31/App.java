package ejm.chapter06.item31;

public class App {

    public static void main(String[] args) {

        for (Ensemble e : Ensemble.values()) {
            System.out.printf("%10s : NumOfMusicians = %d\n", e, e.numberOfMusicians());  
        }

    }

}
