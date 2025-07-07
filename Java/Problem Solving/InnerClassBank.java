package collections;



public class InnerClassBank {
	private String BName;
	public InnerClassBank(String n) {
		this.BName =n;
	}
	
	public  class Account{
		private int Acc_num;
		private double balance;
		
		public Account(int num ,double b) {
			this.Acc_num = num;
			this.balance =b;
		}
		
		public void display() {
			System.out.println("Bank name: " +BName);
			System.out.println("Account number: " +Acc_num);
			System.out.println("Balance: " +balance);
		}
		
			
			
		}
	public static void main(String[] args) {
		InnerClassBank bank =new InnerClassBank("SBI");
		
		Account a = bank.new Account(12365287, 12000);
		Account b = bank.new Account(27854278, 12563);
		
	a.display();
	b.display();
	}}
	