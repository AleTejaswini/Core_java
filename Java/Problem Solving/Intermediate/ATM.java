package intermediate;

import java.util.Scanner;

public class ATM {
	int pin =1324;
	double balance =10000;
	int attempts =3;
	Scanner sc= new Scanner(System.in);
	public void start() {
	
		System.out.println("Welcome to Afsheen  ATM machine");
		
			System.out.println("Enter your pin");
			
				
				while(attempts>0) {
					int enteredpin = sc.nextInt();
				if( enteredpin == pin) {
					System.out.println("login successful");
					menu();

				}
				else {
					attempts--;
					System.out.println("Incorrect pin number");
					
				}
		
			
				
	}System.out.println("No of attempts are completed");
				}
	
	private void menu() {
		System.out.println("---Options---");
		System.out.println("1.Deposite");
		System.out.println("2.Withdraw" );
		System.out.println("3.Check Balance");
		System.out.println("Enter your option");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			deposite();
			menu();
			break;
		
		case 2:
			withdraw();
			menu();
			break;
		case 3:
			checkbalance();
			menu();
			break;
		default:
			System.out.println("Invalid option");
			menu();
			break;
			
			
		
	}}
	private void deposite() {
		System.out.println("Enter deposite amount");
	double Damt = sc.nextDouble();
	balance +=  Damt ;
	System.out.println("your balance is " +balance);
	}
	private void withdraw() {
		System.out.println("Enter withdraw amount");
		double Wamt = sc.nextDouble();
		if(Wamt > 0 && Wamt <balance) {
		balance -= Wamt;
		System.out.println("your balance is " +balance);}
		else {
			System.out.println("invalid amount");
		}
		
	}
	private void checkbalance() {
		System.out.println("Available balance is " +balance);
	}
	public static void main(String[] args) {
		ATM a1 =new ATM();
		a1.start();
	
		
	}

}
