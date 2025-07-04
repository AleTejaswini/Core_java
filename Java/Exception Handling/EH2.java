import java.util.Scanner;
public class EH2 {

	public static void main(String[] args)   {
		Scanner S= new Scanner(System.in);
		System.out.println("Enter you amount");
		int amt= S.nextInt();
	 try {
	  if(amt % 100 == 0)
			System.out.println("amount: "+ amt);
	  else {
		  throw  new IllegalArgumentException("Amount must be multiple of 100");
	  }
	 }	 
	 catch( IllegalArgumentException L) {
		 System.out.println(L.toString());
	     
	 }
	    
		

	}

}
