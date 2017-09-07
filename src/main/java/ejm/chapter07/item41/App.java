package ejm.chapter07.item41;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class App {

	public static void main(String[] args) {

		Collection<?>[] collections = { new HashSet<String>(), new ArrayList<BigInteger>(),
				new HashMap<String, String>().values() };

		FaultyClassifier faulty = new FaultyClassifier();
		OkayClassifier okay = new OkayClassifier();

		for (Collection<?> c : collections) {
			System.out.println("Faulty says: " + faulty.classify(c));
			System.out.println("Okay says: " + okay.classify(c));
		}

	}

}
