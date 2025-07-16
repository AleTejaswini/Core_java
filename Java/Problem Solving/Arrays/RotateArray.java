package arrays;

public class RotateArray {

//	public static void main(String[] args) {
//		 int[] arr = {1, 2, 3, 4, 5, 6, 7};
//		 int k=3;
//		 rotateRight(arr,k);
//		 for(int num: arr) {
//			 System.out.print(num +" ");
//		 }
//		 
//		
//	}
//	 public static void rotateRight(int arr[], int k) {
//		 int n= arr.length;
//		 k=k%n;
//		 reverse(arr ,0, n-1);
//		 reverse(arr,0,k-1);
//		 reverse(arr,k,n-1);
//		 
//				 
//	 }
//  public static void reverse(int arr[], int start,int end) {
//	  while(start<end) {
//		  int temp = arr[start];
//		  arr[start] = arr[end];
//		  arr[end] = temp;
//		  start++;
//		  end--;
//		  
//	  }
//  }
	
	
	
	
	
	
	public static void main(String[] args) {
		int arr[] = {1,4,7,3,9,2,0,4,6};
		int k=2;
		rotateRight(arr,k);
		for(int num:arr) {
			System.out.println(num);
		}
		
	}
	public static void rotateRight(int arr[] ,int k) {
		int n= arr.length;
		k=k%n;
		// reverse whole array
		reverse(arr,0,n-1);
		// reverse k array
		reverse(arr,0,k-1);
		// reverse n-k array
		reverse(arr,k,n-1);
		
		
	}
	public static void reverse(int arr[],int start,int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
