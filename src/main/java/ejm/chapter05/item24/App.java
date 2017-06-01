package ejm.chapter05.item24;

/**
 * Eliminate unchecked warnings.
 *
 * If you eliminate all warnings, you are assured that your code is typesafe, which is a very
 * good thing. It means that you won’t get a ClassCastException at runtime
 */

public class App { 
	
	public static void main(String[] args) {
		
		ArrayHandler<String> arrayHandler = new ArrayHandler<>(new String[]{"Harry", "Ron"});
		ArrayHandler<String> arrayHandler2 = new ArrayHandler<>(new String[]{"Harry", "Ron"});
		ArrayHandler<String> arrayHandler3 = new ArrayHandler<>(new String[]{"Harry", "Dele"});
		
		System.out.println(arrayHandler.equals(arrayHandler2));
		System.out.println(arrayHandler.equals(arrayHandler3));

	}
}
