package inner_class;
// we this keyword reference in lambda by creating a class instance ..not in lambda like anonymous class
public class Lambda1 {
	String name ="lambda";
	public void lambda() {
		Runnable lamda = () -> {
//			String name = "LAmbda";      this will not come
			System.out.println(this.name);
		};
		lamda.run();
		
	}
 public void anonymos() {
	 Runnable anonymous = new Runnable() {
		 String name = "anonymous";

		 @Override
		public void run() {
		System.out.println(this.name);
			
		}
			 
	 };
	 anonymous.run();
	 
 }
	public static void main(String[] args) {
		Lambda1 test = new Lambda1();
		
		test.lambda();
		test.anonymos();

	}

}
