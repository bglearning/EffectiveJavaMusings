package ejm.chapter05.item26;

/**
 * Favor generic types
 */
public class App {

	public static void main(String[] args) {
		Stack<String> stringStack = new Stack<>();

		stringStack.push("Harry");
		stringStack.push("is");
		stringStack.push("Ron");

		while (stringStack.size() > 0) {
			System.out.println(stringStack.pop());
		}

	}

}
