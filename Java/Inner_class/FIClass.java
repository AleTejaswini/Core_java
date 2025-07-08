package inner_class;
// using anonymous class
//public class FIClass {
//	public static void main(String[] args) {
//		FI f = new FI() {
//
//			@Override
//			public void drive() {
//				System.out.println("car driving");
//			}
//			
//		};
//		
//		f.drive();
//		f.demo();
//  }
//}



// in general way
public class FIClass implements FI{
	
	@Override
	public void drive() {
		System.out.println("car driving");
		
	}
	public static void main(String args[]) {
		FIClass f1 = new FIClass();
		f1.drive();
		f1.demo();
		
	}

}
