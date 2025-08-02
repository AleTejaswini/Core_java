package ps;

public class Palindrome {

	public static void main(String[] args) {
		int num = 123;
		int temp=num;
		int rev=0;
		
	
		while(temp!=0){
		int digit = temp%10; 
		rev = rev * 10 + digit; 
		temp= temp/10;
		}
		if(num==rev)
		System.out.println("is palindrome");
		
		else
		
		System.out.println("not palindrome");
		
		
		
		int[] arr = { 1,2,3,2,1,7,1};
		boolean ispalindrome = true;
		int start=0;
		int end =arr.length- 1;
		while(start<end) {
			if(arr[start] != arr[end]) {
				ispalindrome = false;
			break;
		}
			start ++;
			end--;
		}
		if(ispalindrome)
			System.out.println("palindrome");
		else
				System.out.println("not palindrome");
		
		
		
		
		
		
		
		
		
	}		
		
		
		
		

}