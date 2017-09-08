package ejm.chapter07.item44;

/**
 * A classifier that classifies whether a given {@link Animal} is a cat or not.
 */
public interface CatClassifier {

	/**
	 * Returns whether the given animal is a cat or not.
	 * 
	 * @param animal
	 *            animal to be classified
	 * @return boolean representing whether the given animal is a cat or not.
	 */
	public boolean isCat(Animal animal);

}
