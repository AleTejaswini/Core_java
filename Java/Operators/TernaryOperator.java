package demo;

public class TernaryOperator {

	public static void main(String[] args) {
		int i = 235;
		int j =40;
//		if(i>j)
//			System.out.println("i is larger");
//		else
//			System.out.println("j is larger");
		
		//  using Ternary operator
		System.out.println(i>j? "i is larger" : "j is larger");

		
		int num =54;
		if(num==0) 
			System.out.println("Zero");
		else if(num>0)
		System.out.println("positive");
		else
			System.out.println("Negative");
		
		// ternary operator
		System.out.println((num==0) ? "Zero" : (num>0) ? "positive" : "negative");
		
		
		// even numbers
		System.out.println((num %2 == 0) ? "Even" : "odd") ;
		 
	}

}
