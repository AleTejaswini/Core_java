package arrays;

public class Minmax {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int max = arr[0];
		int min = arr[0];

		for (int a : arr) {
			if (a > max) {
				max = a;
			} else if (a < min) {
				min = a;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
