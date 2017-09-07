package ejm.chapter07.item42;

public class App {

	public static int min(int first, int... nums) {

		int min = first;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}

		return min;

	}

	public static void main(String[] args) {

		System.out.println(min(2));
		System.out.println(min(6, 1, 9));

	}

}
