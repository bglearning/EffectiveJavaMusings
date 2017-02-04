package ejm.chapter04.item13;

import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Selected {
    private static final Element[] PRIVATE_ELEMENTS = {Element.FIRE, Element.EARTH, Element.AIR, Element.WATER};

    public static final List<Element> ELEMENTS = 
        Collections.unmodifiableList(Arrays.asList(PRIVATE_ELEMENTS));

    public static void main(String[] args) {
        for (Element element : Selected.ELEMENTS) {
            System.out.println(element);
        }
    }
}
