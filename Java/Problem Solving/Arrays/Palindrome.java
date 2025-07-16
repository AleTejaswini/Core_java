package arrays;

public class Palindrome {

	public static void main(String[] args) {
	int arr[] = {1,3,5,5,3,1};
	int start=0;
	int end =arr.length-1;
	Boolean isPalindrome= true;
	while(start<end) {
		if(arr[start] != arr[end]) {
			isPalindrome =false;
			break;
		}
		start++;
		end--;
		
	}
	if(isPalindrome) {
		System.out.println("it isa palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
	}

}
