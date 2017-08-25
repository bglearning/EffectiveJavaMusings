package ejm.chapter06.item35;

public class SampleTest {

	@Test
	public static void m1() {
	}

	public static void m2() {
	}

	@Test
	public void m3() {
	}

	@Test
	public static void m4() {
		throw new RuntimeException("Crash");
	}

}
