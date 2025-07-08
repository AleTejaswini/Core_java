package inner_class;
// Local classes
public class LocalOuter {
	
private int id =100;
	
public void show() {
		System.out.println("show method");
	}
	
	public static void main(String[] args) {
		int salary = 50000;
		  LocalOuter l = new LocalOuter();
		  System.out.println(l.id);
		
		// local class
		class A{
			
			public void print() {
				System.out.println(salary);
				 l.show();  // outer class methods can access inner class but not vice verse
				
			}}
		   
			A a1 = new A();
		   a1.print();
		  
		   
		   
		 
		  
			
		}
	
	
}