package ps;

import java.util.Scanner;

public class SimpleInterest {
    	long principle;
    	int rate;
    	int time;
    	

public void calculate() {
	double   SI = (principle*rate*time)/100;
	System.out.println("Simple Interest is " +SI);
	
}
	public static void main(String[] args) {

		SimpleInterest si = new SimpleInterest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount");
		si.principle = sc.nextLong();               // should using obj.variable
		System.out.println("Enter rate of interest");
		si. rate = sc.nextInt();
		System.out.println("Enter time in years");
		si. time =sc.nextInt();
		
		
		si.calculate();
		
		
		
		
		
//		SimpleInterest si = new SimpleInterest(5000,5,2);
	}
//	public SimpleInterest(long principle, int rate, int time) {
//		
//		this.principle = principle;
//		this.rate = rate;
//		this.time = time;
//	}

}
