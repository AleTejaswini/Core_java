package oops;

public class bank {
	String account_name; //data members
	String bank_type; //data members
	int acc_number; //data members
	String branch; //data members
	int savings;//data members
	int deposits;//data members
	
	public bank(String account_name,String t,int num,String b,int s, int d) {
		this.account_name = account_name;
				bank_type=t;
				acc_number=num;
				branch=b;
				savings=s;
				deposits=d;
				
		// TODO Auto-generated constructor stub
	}
	public  void tejaswini()
	{
		System.out.println("hello");
	}
	
	
	
	public static void main(String[] args) {
		bank holder = new bank("teja","SBI",1234567,"Nalgonda",3000,5000);
		
		System.out.println(holder.account_name);
		System.out.println(holder.bank_type);
		System.out.println(holder.branch);
		System.out.println(holder.savings);
		System.out.println(holder.deposits);
		System.out.println(holder.acc_number);
	     holder.tejaswini();
		
		
		
		// TODO Auto-generated method stub

	}

}
