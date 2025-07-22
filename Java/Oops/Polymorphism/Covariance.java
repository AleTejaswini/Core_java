package method_overloading;
/* Number -> int,short,double
 * Object -> String, integer
 * 
 */
class A{
	Object GetA() {
		System.out.println("Object");
		return 4;
		
	}
}
class B extends A{
	@Override
	Short GetA() {
		System.out.println("Short");
		return 8;
	}
}


public class Covariance {

	public static void main(String[] args) {
	A a = new A();
	a.GetA();
	
	A b = new B();
	b.GetA();
	
	
	
	 
	}

}
