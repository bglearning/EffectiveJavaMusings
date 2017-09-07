package ejm.chapter07.item41;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class FaultyClassifier {

	public String classify(Set<?> set) {
		return "Set";
	}

	public String classify(List<?> list) {
		return "List";
	}

	public String classify(Collection<?> collection) {
		return "Unknown Collection";
	}

}
