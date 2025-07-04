package single;

public class Multi {

	public static void main(String[] args) {
//		int[][] a = new int[3][2];
//		a[0][0]=1;
//		a[0][1]=3;
//		a[1][0]= 7;
//		a[1][1]=6;
//		a[2][0]= 7;
//		a[2][1]=9;
//		//size
//		int size = 0;
//		for( int i=0;i<a.length;i++)
//			size+=a[i].length;
//		System.out.println(size);
//		
//		//printing elements
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				System.out.print(a[i][j] + "  ");
//			}
//			System.out.println();
//		}

		
		
		
		
		// sum of two arrays
//		int [][] arr1 = { {1,2,3},{4,5,6},{7,8,9}};
//		int[][] arr2 = {{9,8,7},{6,5,4},{3,2,1}};
//		int[][] sum = new int[3][3];
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2[i].length;j++) {
//				sum[i][j] = arr1[i][j]+arr2[i][j];
//			}
//		}
//		System.out.println("sum of array");
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2[i].length;j++) {
//				System.out.print(sum[i][j] + "  ");
//		}
//			System.out.println();
//		}
		
		
		
		
		
		
		//sum of elements in the array
//		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//		int sum =0;
//		for(int i =0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				sum += arr[i][j];
//				}}
//		System.out.println("sum of elements in array:" +sum);
//	
	
	
		//Multiplication of four arrays
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = {{4,5,6},{7,8,9},{3,8,9}};
	
		int[][] result =new int[3][3];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[i].length ;j++) {
				for(int k=0;k<arr2[j].length;k++) {
					result[i][j] = arr1[i][k] * arr2[k][j];
				}System.out.print(result[i][j] + " ");
			}
		System.out.println();
		
		}
		
		
	
	
	
	
	}
	

}
