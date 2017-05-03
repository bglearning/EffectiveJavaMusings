package ejm.chapter04.item22;

public class Cannon {

	public void fire(Projectile projectile) {
		System.out.println(String.format("Fired a projectile weighing %s pounds", projectile.getWeight()));
	}
}
