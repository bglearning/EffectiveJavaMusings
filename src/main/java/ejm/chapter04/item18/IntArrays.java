package ejm.chapter04.item18;

import java.util.AbstractList;
import java.util.List;

public class IntArrays {
    public static List<Integer> intArrayAsList(final int[] a) {
        if (a == null)
            throw new NullPointerException();

        return new AbstractList<Integer>() {
            public Integer get(int i) {
                return a[i];
            }

            @Override
            public Integer set(int i, Integer val) {
                int tempVal = a[i];
                a[i] = val;
                return tempVal;
            }

            public int size() {
                return a.length;
            }
        };
    }
}
