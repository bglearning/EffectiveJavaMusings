package ejm.chapter05.item25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Prefer lists to arrays.
 */
public class App {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 4));
		
		Reducers reducers = new Reducers();
		
		System.out.println(reducers.reduce(numbers, Reducers.SUM, 0));
	}

}
