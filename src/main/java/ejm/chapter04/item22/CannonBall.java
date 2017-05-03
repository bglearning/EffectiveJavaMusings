package ejm.chapter04.item22;

public class CannonBall implements Projectile {

	private final double weight;

	public CannonBall(double weight) {
		this.weight = weight;
	}

	@Override
	public double getWeight() {
		return weight;
	}

}
