package inner_class;
@FunctionalInterface  //1
//interface car{
//	public void drive();
//}

//interface car{  // adding speed parameter
//	public void drive(int speed);
//}

//   interface car{  // adding multiple  parameter
//	public void drive(int speed,String model);
//}
interface car{
	public int getSpeed();
}

class Audi implements car{   //2
    @Override
	public int getSpeed() {
		System.out.println("Driving audi" );
		return 50;
	}
	
}

public class LambdaExp { // create class first and main method

	public static void main(String[] args) {
		// in general way
		Audi a = new Audi();  //3
		System.out.println(a.getSpeed());
		
		
		// using anonymous class
		car c = new car() {  // 4
         @Override
			public int getSpeed() {
				System.out.println("AC..driving");
				return 100;
			} 
             };
	          System.out.println(c.getSpeed());
	          
	          
	
      //  lambda expression with anonymous function (LE are used only for FI)
//	car c1 = () ->  System.out.println("Lambda..driving audi");  //5
//	                    c1.drive();
	                    
	             // if we want multiple lines of code        
//	           car c1 = () ->  {
//	        	   int speed =100;
//	        	   System.out.println("Lambda..driving audi");
//	        	   System.out.println("Car is driving smoothly at the speed of " +speed );
//	        	   if(speed >= 100)
//	        		   System.out.println("driving very speed");
//	        	   else
//	        		   System.out.println("driving normally");
//	           };
//	                    c1.drive();
				
	          
	          // after adding speed parameter
//	          car c1 = speed ->  {  // no need to keep type of speed and paranthethis
//	        	  
//	        	   System.out.println("Lambda..driving audi");
//	        	   System.out.println("Car is driving at the speed of " +speed );
//	        	   if(speed >= 100)
//	        		   System.out.println("driving very speed");
//	        	   else
//	        		   System.out.println("driving normally");
//	           };
//	                    c1.drive(110);
				
	          
	          
	          // for multiple parameters
//	 		car c1 = (speed, model) ->  { 
//	      	        	  
//	 	   System.out.println("Lambda..driving" +model);
//    	   System.out.println(model  +" is driving  at the speed of " +speed );
//    	   if(speed >= 100)
//    		   System.out.println("driving very speed");
//    	   else
//    		   System.out.println("driving normally");
//       };
//                c1.drive(110,"Audi");
                
                
	          
	          // with return type
//	          car c1 = () ->  {
//	        	  int speed=100;
//  	        	  
//	   System.out.println("Lambda..driving");
//   System.out.println("car is driving  at the speed " );
//   if(speed >= 100)
//	   System.out.println("driving very speed");
//   else
//	   System.out.println("driving normally");
//   return 100;
//};
//        System.out.println(c1.getSpeed());
	          
	          
	          
			// if above if condition  doesn't perform
	          car c1 = () -> 100;
	          System.out.println(c1.getSpeed());
		
	
	
	
	}
}


