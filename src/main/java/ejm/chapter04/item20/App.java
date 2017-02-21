package ejm.chapter04.item20;

import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(1.0d));
        figures.add(new Rectangle(2.0d, 1.0d));
        figures.add(new Square(1.0d));

        for (Figure figure : figures) {
            System.out.println(figure.area());
        }

    }
}
