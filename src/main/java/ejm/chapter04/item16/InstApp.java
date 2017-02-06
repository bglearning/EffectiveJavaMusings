package ejm.chapter04.item16;

import java.util.Arrays;
import java.util.HashSet;

public class InstApp {
    public static void main(String[] args) {

        System.out.println("### Should output 4 ###");
        System.out.print("Problematic Instrumented HashSet: ");
        ProblematicInstrumentedHashSet<String> p = new ProblematicInstrumentedHashSet<>();
        p.addAll(Arrays.asList("Spring", "Summer", "Fall", "Winter"));
        System.out.println(p.getAddCount());

        InstrumentedSet<String> i = new InstrumentedSet<>(new HashSet<String>());
        i.addAll(Arrays.asList("Spring", "Summer", "Fall", "Winter"));
        System.out.print("Forwarding Instrumented Set: ");
        System.out.println(i.getAddCount());
    }
}
