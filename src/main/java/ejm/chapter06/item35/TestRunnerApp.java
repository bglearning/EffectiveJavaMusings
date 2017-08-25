package ejm.chapter06.item35;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunnerApp {

	public static void main(String[] args) {

		int tests = 0;
		int passed = 0;

		for (Method m : SampleTest.class.getDeclaredMethods()) {
			if (m.isAnnotationPresent(Test.class)) {
				tests++;
				try {
					m.invoke(null);
					passed++;
				} catch (InvocationTargetException wrappedExc) {
					Throwable exc = wrappedExc.getCause();
					System.out.println(m + " failed: " + exc);
				} catch (Exception exc) {
					System.out.println("INVALID @Test: " + m);
				}
			}

		}

		System.out.println(String.format("Total tests: %s; Passed: %s, Failed: %s", tests, passed, tests - passed));

	}

}
