package inner_class;

public class Test1 {
	public static void main(String[] args) {
		Test2 d = new Test2();  // can access one class methods in another class of same java file
		d.demo();
		
	}
		
	}
class Test2{       // can have multiple class in java file (but it should not be public )
	public static void main(String[] args) {  // we can create main method for every class
		
	}
	public void demo() {
		System.out.println("Demo");
	}	}
class Test3{     // these are not inner class
	public static void main(String[] args) {
		
	}
}


