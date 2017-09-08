package ejm.chapter07.item44;

/**
 * Simple {@link ejm.chapter07.item44.CatClassifier}.
 * 
 * Only considers the number of legs.
 * 
 */
public class SimpleCatClassifier implements CatClassifier {

	/**
	 * {@inheritDoc}
	 * 
	 * Only looks at the number of legs.
	 */
	@Override
	public boolean isCat(Animal animal) {
		return animal.getNumOfLegs() == 4;
	}

}
