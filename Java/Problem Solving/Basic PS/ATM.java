package ps;

import java.util.Scanner;

/* ATM Cash Withdrawal Simulation
Problem:
Write a program to simulate an ATM.
The user enters an amount to withdraw. The ATM has ₹2000, ₹500, ₹200, and ₹100 notes.

Input: Amount (multiple of 100)
Output: Number of notes for each denomination
  * 
  */
public class ATM {
	static int amt;
	int bal;
	
	public ATM(int bal) {
	
		this.bal = bal;
	}
	
	public void withdraw() {
		if(amt %100 ==0) {
		bal -= amt;
		System.out.println(bal);
	}
		else {
			System.out.println("enter amount which is multiple of 100");
		}
	}
	public static void main(String[] args) {
		ATM a = new ATM(10000); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amt to withdraw");
		
		 amt = sc.nextInt();
		 a.withdraw();
		 
		
			
	
		
}}
