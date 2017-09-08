package ejm.chapter07.item44;

public class App {

    public static void main(String[] args) {
        CatClassifier classifier = new SimpleCatClassifier();

        System.out.println("Three legs. isCat = " + classifier.isCat(new Animal(3)));
        System.out.println("Four legs. isCat = " + classifier.isCat(new Animal(4)));
    }

}
