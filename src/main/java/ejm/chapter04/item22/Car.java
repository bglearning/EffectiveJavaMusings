package ejm.chapter04.item22;

public class Car {

	// Weight in kgs
	private final double weight;

	private final String model;

	public Car(String model, double weight) {
		this.model = model;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public String getModel() {
		return model;
	}

	public class ProjectileAdapter implements Projectile {
		private final static double KG_TO_POUND = 2.20462;

		@Override
		public double getWeight() {
			return weight * KG_TO_POUND;
		}
	}

}
