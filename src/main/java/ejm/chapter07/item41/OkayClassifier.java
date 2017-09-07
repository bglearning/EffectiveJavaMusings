package ejm.chapter07.item41;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class OkayClassifier {

	public String classify(Collection<?> c) {

		return c instanceof Set ? "Set" : c instanceof List ? "List" : "Unknown Collection";

	}

}
