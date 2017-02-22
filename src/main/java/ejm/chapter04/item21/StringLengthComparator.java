package ejm.chapter04.item21;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    private StringLengthComparator() {
    }

    public static final StringLengthComparator INSTANCE = new StringLengthComparator();

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }

}
