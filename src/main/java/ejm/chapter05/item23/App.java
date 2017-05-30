package ejm.chapter05.item23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Don't use raw types in new code.
 */
public class App {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		unsafeAdd(names, new Integer(42));

		Set<String> fruitNames = new HashSet<>(Arrays.asList("Apple", "Orange", "Mango"));
		Set<String> colorNames = new HashSet<>(Arrays.asList("Red", "Blue", "Orange"));

		System.out.println(fruitNames);
		System.out.println(colorNames);

		System.out.println(String.format("Number of Common Elements: %d", numOfCommonElements(fruitNames, colorNames)));

	}

	public static void unsafeAdd(List list, Object o) {
        // Raw Type List allows addition.
		list.add(o);
	}

	public static void saferAddNoAdd(List<?> list, Object o) {
		// List with type set to unbounded Wildcard. 
        // Addition not Allowed
		// list.add(o);
	}

	public static int numOfCommonElements(Set<?> s1, Set<?> s2) {
		int count = 0;
		for (Object o : s1) {
			if (s2.contains(o))
				count++;
		}

		return count;
	}

}
