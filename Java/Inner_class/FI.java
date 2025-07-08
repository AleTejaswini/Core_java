package inner_class;

@FunctionalInterface
public interface  FI {
	
	abstract void drive();  
	default void demo() {
		System.out.println("new vehicle");
	}
	

}
