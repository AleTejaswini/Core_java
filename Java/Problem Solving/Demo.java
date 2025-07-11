// sum of two number in arrays => give target number
//public class Demo {
//
//	public static void main(String[] args) {
//
//		int[] num = {2,7,11,15};
//		int target = 9;
//		boolean found= false;
//		for(int i =0;i<=num.length -1 ;i++){
//			for(int j=1;j<num.length;j++) {
//				if(num[i] + num[j] == target) {
//					System.out.println("you got it");
//					System.out.println("the numbers are " +num[i] + " and " +num[j]);
//					found =true;
//				}
//			}
//		}
//		if(!found)
//		{
//			System.out.println("there are no such numbers that sum's target value");
//		}
//
//	}
//}



// Age calculator

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//public class Demo{
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter your birth year");
//		int y= s.nextInt();
//		System.out.println("Enter your birth month");
//		int m =s.nextInt();
//		System.out.println("Enter your birth date");
//		int d =s.nextInt();
//		
//		
//		LocalDate birthdate = LocalDate.of(y,m,d);
//		LocalDate currentdate = LocalDate.now();
//		
//		if(birthdate.isAfter(currentdate)) {
//			System.out.println("birth date cant be in future");
//		}
//		else {
//			Period age = Period.between(birthdate, currentdate);
//			System.out.println(age.getYears() + "years");
//			System.out.println(age.getMonths() + "months");
//			System.out.println(age.getDays()+ "days");
//		}
//		s.close();
//	}
//}
		
// Armstrong number
//public class Demo{
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num = s.nextInt();
//		int digits = String.valueOf(num).length();
//		int ori =num;
//		int sum=0;
//		 while(num!=0) {
//			  int digit = num%10;
//			 sum += Math.pow(digit, digits);
//			 num = num /10;
//		 }
//		 if(sum == ori)
//			 System.out.println("it is armstrong");
//		 else
//			 System.out.println("not an armstrong number");
//	}
//}

//	Display All Even Numbers till N
public class Demo{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			if(i%2==0)
			System.out.println(i);
			i++;
		}
	}
}

		
	