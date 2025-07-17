package single;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class ArraysEx {
	public static void main(String[] args) {
        // reverse of array  
//		int[] arr = {5,7,3,7,2,6,9};
		
//	    int left = 0, right = arr.length - 1;
//		while (left < right) {
//		    int temp = arr[left];
//		    arr[left] = arr[right];
//		    arr[right] = temp;
//		    left++;
//		    right--;
//		}
//		for (int num :arr) {
//			System.out.println(num );
//		}
		
		// check if array is sorted
//				boolean isSorted = true;
//				for(int i=1 ;i<arr.length;i++) {
//					if(arr[i] < arr[i-1]) {
//						isSorted = false;
//						break;
//				}}
//		
//			System.out.println(isSorted);
		
		
		
		
		// second largest number
//		int first = Integer.MIN_VALUE ;
//		int second = Integer.MIN_VALUE;
//		for(int num:arr) {
//			if(num>first) {
//			
//			second = first;
//			first = num;}
//			else if(num>second && num!= first)
//				second = num;
//			}
//		System.out.println(second);
	
		
		
		//min amd max 
//		int max = arr[0], min = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//		    if (arr[i] > max) 
//		    	max = arr[i];
//		    if (arr[i] < min) 
//		    	min = arr[i];
//		}
//             System.out.println(min);
//             System.out.println(max);
        
     // search
//		int[] arr = {5,7,3,7,2,6,9};
//			Scanner s = new Scanner(System.in);
//			System.out.println("enter your search element");
//			int search = s.nextInt();
//			boolean found = false;
//			for(int i=0 ;i<arr.length;i++) {
//			if(arr[i] == search) {
//				found =true;
//				System.out.println("Element is found at index " + i);
//				break;
//				}}
//			if(!found) {
//				System.out.println("not found");
//				}
		
		
		// even odd count
//		int[] arr = {5,7,3,7,2,6,9};
//		int ecount = 0;
//		int ocount= 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] %2 == 0) {
//				ecount ++;}
//			else if(arr[i] % 2 ==  1)
//					ocount++;
//			}
//		System.out.println(ecount );
//		System.out.println(ocount);
		
		
		// remove duplictes
//		int[] arr = {5,7,3,7,2,6,9};
//	   Arrays.sort(arr);
//	   int j=0;
//	   for(int i=0;i<arr.length;i++) {
//		   if(arr[i] != arr[j]) {
//			     j++;
//			   arr[j]= arr[i];
//		   }
//		   
//	   }
//	   for(int i=0;i<=j;i++) {
//		   System.out.println(arr[i]);
//	   }
		
		
	// find missing number 
//		int arr[] = {1,2,4,5};
//		int n= arr.length +1;
//		int expectedsum = (n *(n+1))/2;
//		int actualsum= 0;
//		
//		for(int i=0;i<arr.length ;i++) {
//			actualsum += arr[i];		
//			}
//		System.out.println(actualsum);
//		int missingnum = expectedsum-actualsum;
//		System.out.println(missingnum);
		
		
		
//		// find all pairs with given sum
//		Set<Integer> seen = new HashSet<>();
//		int[] arr = {2, 4, 3, 5, 7, 8, 9};
//		int target =10;
//		for(int num: arr) {
//			if(seen.contains(target-num)) {
//				System.out.println(num + "," +(target-num));
//			}
//			seen.add(num);
//		}
		
		
//		Print 2D array
//		int[][] arr = {{1,2,3},{1,6,8},{5,8,9}};
//		for(int i=0;i<arr.length;i++) { // arr.length
//			for(int j=0;j<arr[i].length ;j++) { //arr[i].length
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();	
//			
//			}
		// transpose
//		int[][] arr={{1,2,3},{1,6,8},{5,8,9}};
//		for(int i=0;i<arr[0].length;i++) {        //arr[0].length
//			for(int j=0;j<arr.length;j++) {       //arr[i].length
//				System.out.print(arr[j][i] + " ");     //arr[j][i]
//			}
//			System.out.println();
//		}
//		
		
		//addition 
		int[][] arr1={{1,2,3},{1,6,8},{5,8,9}};
		int[][] arr2 = {{3,2,1} ,{5,8,6},{5,9,3}};
		int[][] sum= new int[3][3];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				
				 sum[i][j] = arr1[i][j] + arr2[i][j]; // same for mul sub
				 System.out.print(sum[i][j] +" ");
				 
				 
			}
			System.out.println();
		}
		
	
	
	}}	
	
