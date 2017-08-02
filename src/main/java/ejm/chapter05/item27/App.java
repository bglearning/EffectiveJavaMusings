package ejm.chapter05.item27;

public class App {

	private static UnaryFunction<Object> identityFunction = new UnaryFunction<Object>() {
		public Object apply(Object arg) {
			return arg;
		}
	};

	// IDENTITY_FUNCTION is stateless and its type parameter is
	// unbounded so it's safe to share one instance across all types.
	@SuppressWarnings("unchecked")
	public static <T> UnaryFunction<T> identityFunction() {
		return (UnaryFunction<T>) identityFunction;
	}

	public static void main(String[] args) {
		String[] strings = { "Up", "Down", "Right" };

		UnaryFunction<String> sameString = identityFunction();

		for (String string : strings) {
			System.out.println(sameString.apply(string));
		}

		Integer[] integers = { 1, 2, 3 };

		UnaryFunction<Integer> sameInteger = identityFunction();

		for (Integer integer : integers) {
			System.out.println(sameInteger.apply(integer));
		}
	}

}
