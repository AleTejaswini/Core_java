package demo;

public class SwitchExpression {
	public static void main(String[] args) {
		
		// switch case statement
//		int num =67;
//		switch(Integer.compare(num, 0)) {
//		case -1:
//			System.out.println("Negative");
//			break;
//		case 0:
//			System.out.println("Zero");
//			break;
//		case 1:
//			System.out.println("positive");
//			break;
//   }
		
		// switch Expression
		int num= 450;
//		String result ="";
//		switch(Integer.compare(num, 0)) {
//		case -1 -> result ="Negative" ;
//		case  0 -> result = "Zero";
//		case 1 ->  result = "Positive";
//		}
//        System.out.printf("the given number %s is %s " ,num, result );
		
		
//		String result = "";
//		result = switch(Integer.compare(num, 0)) {
//		case -1 -> result ="Negative" ;
//		case  0 -> result = "Zero";
//		case 1 ->  result = "Positive";
//		default -> throw new IllegalArgumentException("Unexpected value: " + Integer.compare(num, 0));
////	    default -> "hsrxut";
//		};
//        System.out.printf("the given number %s is %s " ,num, result );
		
		
		// if positive and even
//		String result = "";
//		result = switch(Integer.compare(num, 0)) {
//		case -1 ->"Negative" ;
//		case  0 -> "Zero";
//		case 1 ->   {
//				if (num%2==0)
//			    yield "positive and even";
//				else
//					yield "positive and odd";
//		}
//		default -> throw new IllegalArgumentException("Unexpected value: " + Integer.compare(num, 0));
////	    default -> "hsrxut";
//		};
//        System.out.printf("the given number %s is %s " ,num, result );
        
        
        // weekdays and weekends
        String day = "mon";
        String result =   switch(day) {   // if you keep day then compulsory you need to add default statement
        case "mon","tue","wed","thur","fri" -> "its a weekday";
        case "sun","sat" -> "yaahh its weekend";
	    default -> throw new IllegalArgumentException("Unexpected value: " + day);
       
        };
		
		System.out.println(result);
	}}
