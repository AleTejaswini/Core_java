import java.util.Scanner;

public class GradeNested {

	public static void main(String[] args) {
//		90-100 => A
//				80-89  => B
//				70-79  => C
//				<70    => Fail
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter your marks");
		int marks =s.nextInt();
		
		if(marks >= 90 && marks <= 100) {
			System.out.println("A");
		}
		else if(marks >=80 && marks<= 89){
			System.out.println("B");
		}
		else if(marks >=70 && marks <=79){
			System.out.println("C");
			
		}
		else {
			System.out.println("fail");
		}

		
		
		
		
	}

}
