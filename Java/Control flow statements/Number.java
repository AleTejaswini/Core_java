import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("enter your number");
		int num = N.nextInt();
		
		
		if(num % 2 == 0) {
			System.out.println("even number");
			
		
		}
		else {
			System.out.println("odd number");
			
			
		}
		
	}

}
