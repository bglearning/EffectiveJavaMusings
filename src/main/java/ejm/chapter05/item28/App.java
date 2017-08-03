package ejm.chapter05.item28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		GroupCollection<Number> nums = new GroupCollection<>();

		// When putting, it can be more specific.
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2));

		nums.putAll(list1);

		// When popping, it can be more general.
		List<Object> list2 = new ArrayList<>();

		nums.popAll(list2);

		for (Object o : list2) {
			System.out.println(o);
		}
	}

}
