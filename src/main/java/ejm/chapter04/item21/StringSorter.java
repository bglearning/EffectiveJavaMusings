package ejm.chapter04.item21;

import java.util.Arrays;
import java.util.Comparator;

public class StringSorter {
    private final Comparator<String> comparator;

    public StringSorter(Comparator<String> comparator) {
        this.comparator = comparator;
    }

    public String[] sortStrings(String[] stringArray) {
        String[] sortedArray = Arrays.copyOf(stringArray, stringArray.length);
        Arrays.sort(sortedArray, comparator);
        return sortedArray;
    }
}
