import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter the day number");
//		int day=s.nextInt();
//	
//
//		switch (day) {
//		    case 1:
//		        System.out.println("Sunday");
//		        break;
//		    case 2:
//		        System.out.println("Monday");
//		        break;
//		    case 3:
//		        System.out.println("Tuesday");
//		        break;
//		    case 4:
//		        System.out.println("Wednesday");
//		        break;
//		    case 5:
//		        System.out.println("Thursday");
//		        break;
//		    case 6:
//		        System.out.println("Friday");
//		        break;
//		    case 7:
//		        System.out.println("Saturday");
//		        break;
//		    default:
//		        System.out.println("Enter a valid  day");
//		}
//		
		
		//simple calculator
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the operator");
//		String operator = s.nextLine();
//		// case names should be any thing based on variable if it is int then write case names intergers 
//		switch(operator) {
//		case "+" : 
//			System.out.println("Addition");
//		break;
//			
//		case "-" :
//			System.out.println("sub");
//		break;
//		case "*" : 
//			System.out.println("mul");
//		break;
//		case "/": 
//			System.out.println("div");
//		break;
//		default: System.out.println("MOd");
//		break;
//		}
		
		// traffic light
		Scanner s = new Scanner(System.in);
		System.out.println("Enter color");
		String color = s.nextLine();
		switch(color) {
		case "Red":  // case sensitive
			System.out.println("Stop");  
			break;
		case "yellow":
			System.out.println("Wait");
			break;
		case "Green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Enter a valid color");
			break;
		}
		
		
		
		
		}

}
