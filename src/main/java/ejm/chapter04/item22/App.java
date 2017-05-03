package ejm.chapter04.item22;

public class App {

	public static void main(String[] args) {
		Cannon cannon = new Cannon();

		CannonBall cannonBall = new CannonBall(2.0d);
		Car.ProjectileAdapter carProjectileAdapter = new Car("ES42", 400.0d).new ProjectileAdapter();

		cannon.fire(cannonBall);
		cannon.fire(carProjectileAdapter);
	}

}
