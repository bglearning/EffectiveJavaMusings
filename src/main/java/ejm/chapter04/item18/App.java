package ejm.chapter04.item18;

import java.util.List;
import java.util.Collections;

public class App {
    public static void main(String[] args) {

        // IntArrays Demo
        System.out.println("=========== IntArrays Demo =================");
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) 
            a[i] = i;
        List<Integer> list = IntArrays.intArrayAsList(a);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println();

        // Skeletal Decorator Demo
        System.out.println("=========== Skeletal Decorator Demo =================");
        System.out.println("Normal Goku:");
        Saiyan goku = new Goku();
        System.out.print("Attack:>>>>>>>>>  ");
        goku.attack();
        System.out.printf("Power: %d\n\n", goku.getAttackPower());
        System.out.println("God SuperSaiyan Goku:");
        Saiyan godSuperSaiyanGoku = new GodSaiyan(new SuperSaiyan(new Goku()));
        System.out.print("Attack:>>>>>>>>>  ");
        godSuperSaiyanGoku.attack();
        System.out.printf("Power: %d\n\n", godSuperSaiyanGoku.getAttackPower());

    }
}
