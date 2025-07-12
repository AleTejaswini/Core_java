package demo;

public class Enum {

	public static void main(String[] args) {
		 Week day = Week.MONDAY;
		 Week[] arr = Week.values();
		 for(Week w : arr) {
//			 System.out.println(w);
			 System.out.println(w+ " " +w.ordinal()); // prints indexes 
		 }
		System.out.println( Week.valueOf("MONDAY"));
		
//         days d = days.MONDAY;   // user input
//          // if else
//         if(d == days.MONDAY ||  d ==days.TUESDAY || 
//        		 d==days.WEDNESDAY || d == days.THURSDAY || d==days.FRIDAY) {
//        	 System.out.println("Its a weekday ,it is a " +d.index + "day" + "and it is " +d.status);
//         }
//         else if(d ==days.SATURDAY || d==days.SUNDAY) {
//        	 System.out.println("Its a weekend ,it is a " +d.index + "day" + "and it is " +d.status);
//         }
//         
//         
//         // switch case
//         switch(d) {
//         case MONDAY:
//         case TUESDAY:
//         case WEDNESDAY:
//         case THURSDAY:
//         case FRIDAY:
//        	 System.out.println("itsa weekday ,it is a " +d.index + "day"  + "and it is " +d.status);
//        	 break;
//         case SATURDAY:
//         case SUNDAY:
//        	 System.out.println("it s a weekend ,it is a " +d.index + "day" + "and it is " +d.status);
//        	 break;
//         }
         
         
         
         // using switch expression
//         switch(d) {
//         case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY  -> System.out.println("its a weekday ,and it is work from" +d.opentime +"to" +d.closingtime );
//         case SATURDAY,SUNDAY -> System.out.println("its a weekend ,and it is work from " +d.opentime +"to" +d.closingtime);
//         }
	}

}
