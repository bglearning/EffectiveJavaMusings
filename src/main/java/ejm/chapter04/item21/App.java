package ejm.chapter04.item21;

public class App {
    public static void main(String[] ars) {
        String[] stringArray = {"I love you", "Extensive psychoanalysis", "I am not really sure"};

        StringSorter lengthBasedSorter = new StringSorter(StringLengthComparator.INSTANCE);
        StringSorter wordBasedSorter = new StringSorter(StringWordComparator.INSTANCE);

        System.out.println("Length based sort:");
        for (String s : lengthBasedSorter.sortStrings(stringArray)) {
            System.out.println("> " + s);
        }

        System.out.println();

        System.out.println("Word based sort:");
        for (String s : wordBasedSorter.sortStrings(stringArray)) {
            System.out.println("> " + s);
        }

    }
}
