package ps;

public class MinMax {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=max) {
				max=arr[i];
				i++;
				}
			
		}	
		System.out.println("Max element in arr is " +max);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=min) {
				min= arr[i] ;
				i++;
				}
			
		}
		System.out.println("Min element in arr is " +min);
	}

}
