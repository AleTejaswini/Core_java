import java.util.Scanner;
public class Nested_if {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("what is your exam status");
		String examstatus = N.nextLine();
		String examStatus ="fail";
		if(examStatus=="pass") {
			System.out.println("please wait for next round");
		
			String round1="pass";
			if(round1=="pass") {
				System.out.println("you are qualified for final round");
				
				String round2="fail";
				if(round2=="pass") {
					System.out.println("you are selectd for interview");
				}		
				else {
					System.out.println("you can go home");
					}}
			else {
			System.out.println("you can go home");
		    }}
			else {
				System.out.println("you can go home");
			    }
			

	}

}
