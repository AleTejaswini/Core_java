package library;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your age: ");
	
	int age= s.nextInt() ;
	if(age >= 18) {
		System.out.println("Eligible for voting");
	}
	else {
		System.out.println("No eligible");
	}

	}

}
