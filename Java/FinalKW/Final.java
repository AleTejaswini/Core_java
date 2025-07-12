package demo;

//final int a = 5;              // valid
//final static String name;     // invalid - must initialize final variable
//final void run();             // invalid abstract or interface method can't be final
//final int x;                  // invalid if not initialized in constructor or block


////give compile time error
//public class Final {
//	final int a =100;
//	void show() {
////		a =100;     
//		System.out.println(a);
//	}
//
//	public static void main(String[] args) {
//		
//     Final f = new Final();
//    	 System.out.println(f.a);
//    	 f.show();
//     
//	}
//
//}


//final method can't be override
// public class Final {
//    final void sound() {
//        System.out.println("Animal sound");
//    }
////class Dog extends Final {
////    void sound() {   
////        System.out.println("Dog barks");
////    }
//// } 
//    public static void main(String[] args) {
//		Final f = new Final();
//		f.sound();
//		
////		Dog d = new Dog();
////		d.sound();
//	}
//}
 
 
  // cant inherit final class
//final class Final {
//    void run() {
//        System.out.println("Vehicle is running");
//    }
//
////class Car extends Final {
////    void run() {
////        System.out.println("Car is running");
////    }
//    public static void main(String[] args) {
//    	Final f = new Final();
//    	f.run();
//		
////    	Car c = new Car();
////    	c.run();
//	}
//}



//// no reassignment of values
//public class Final {
//    void display(final int num) {
//        // num = num + 10;
//        System.out.println("Number: " + num);
//    }
//}



		
