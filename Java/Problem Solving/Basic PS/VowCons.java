package ps;

import java.util.Scanner;

/*
 * . Vowel or Consonant Checker
Problem:
Ask the user to enter a character. Check if the input character is a vowel, consonant, or not a letter.
 */
public class VowCons {
	static  String input  ;
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet");
		 input =sc.nextLine();
		 
		 if(input.length() != 1 || !Character.isLetter(input.charAt(0))) {
			    System.out.println("Not a letter");}
		 else if( input.equalsIgnoreCase("a") ||  input.equalsIgnoreCase("e") || input.equalsIgnoreCase("i") || input.equalsIgnoreCase("o") || input.equalsIgnoreCase("u")) {
				System.out.println("Vowel");
			}
			else {
				System.out.println("Consonant");
			}
		 
		
			
		
	}

}
