package ejm.chapter06.item32;

import java.util.EnumSet;

public class App {

    public static void main(String[] args) {
        Text text = new Text();

        text.applyStyles(EnumSet.of(Text.Style.BOLD, Text.Style.ITALICS));

    }

}
