package ejm.chapter06.item34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class App {

    public static void main(String[] args) {
    	
    	List<Operation> ops = new ArrayList<>();
    	
    	ops.addAll(Arrays.asList(BasicOperation.values()));
    	ops.addAll(Arrays.asList(ExtendedOperation.values()));

        test(ops, 5.0, 2.0);

    }

    public static void test(Collection<? extends Operation> opSet, double a, double b) {
        for (Operation op : opSet) {
            System.out.println(String.format("%.6f %s %.6f = %.6f", a, op.toString(), b, op.apply(a,b)));
        }
    }

}
