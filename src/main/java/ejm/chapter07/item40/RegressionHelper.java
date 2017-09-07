package ejm.chapter07.item40;

public class RegressionHelper {

	public static class RegressionParameters {
		private double theta0;
		private double theta1;

		public RegressionParameters(double theta0, double theta1) {
			this.theta0 = theta0;
			this.theta1 = theta1;
		}

		public double getTheta0() {
			return theta0;
		}

		public double getTheta1() {
			return theta1;
		}
	}

	private RegressionHelper() {
		throw new AssertionError();
	}

	public static double calculate(RegressionParameters params, double x) {

		return params.getTheta0() + params.getTheta1() * x;

	}

}
