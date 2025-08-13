package arrays;

public class MulArray {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 3, 4 } };
		int[][] arr2 = { { 5, 6 }, { 7, 8 } };
		int[][] result = new int[2][2];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				for (int k = 0; k < arr1[j].length; k++) {

					result[i][j] += arr1[i][k] * arr2[k][j];

				}
				System.out.print(result[i][j] + " ");

			}
			System.out.println();
		}

//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0 ;j<arr2[i].length;j++) {
//				result[i][j] = arr1[i][j] + arr2[i][j];
//				System.out.println(result[i][j]);
//			}
//			System.out.println();
//		}

	}
}