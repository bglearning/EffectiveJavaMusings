package ejm.chapter04.item21;

import java.util.Comparator;

public class StringWordComparator implements Comparator<String> {
    private StringWordComparator() {
    }

    public static final StringWordComparator INSTANCE = new StringWordComparator();

    @Override
    public int compare(String s1, String s2) {
        return s1.split(" ").length - s2.split(" ").length;
    }

}
