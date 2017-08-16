package ejm.chapter06.item32;

import java.util.Set;

public class Text {

    public enum Style {
        BOLD, ITALICS, UNDERLINED;
    }

    public void applyStyles(Set<Style> styles) {
        for (Style style : styles) {
            System.out.println(String.format("Applying style: %s", style));
        }
    }

}
