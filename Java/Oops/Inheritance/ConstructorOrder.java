package inheritance;
class a{
	a(){
		System.out.println("Constructor of class A");
	}
}
class b extends a{
	b(){
		System.out.println("Constructor of class B");
	}
}
class c extends b{
	c(){
		System.out.println("Constructor of class C");
	}
	
}
public class ConstructorOrder {

	public static void main(String[] args) {
		a obja = new a();   
		
		b objb= new b();
		
		c objc = new c();  // parent class constructors are called first and then child 
//		A a = new A();
//		B b = new B();
		

	}

}
