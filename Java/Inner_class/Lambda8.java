package inner_class;

public class Lambda8 {

	public static void main(String[] args) {
		
		// using anonymous function
	Runnable task  = new Runnable() {

		@Override
		public void run() {
			System.out.println("using anonymous class");
		}
		
	};
	task.run();
	
	
	// using lambda function
	
	Runnable task1  = ()-> System.out.println("using anonymous class");
		
	task1.run();

	}

}
