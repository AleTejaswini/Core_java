package library;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String original = s.nextLine();
 String reversed = new StringBuilder(original).reverse().toString();  // String builder is mutable version of string which has built-in reverse method 
 
 if(original.equals(reversed)) {
	 System.out.println("it is a palindrome");
 }
 else {
	 System.out.println("not a palindrome");
 }

	
	

	}

}
