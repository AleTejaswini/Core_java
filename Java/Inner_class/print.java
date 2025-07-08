package inner_class;

public class print{
	public static void main(String[] args) {
		ACInterface ac = new ACInterface() {

			@Override
			public void show() {
				System.out.println("show in Interface");
				
			}

			@Override
			public void demo() {
				System.out.println("demo in Interface");
				
			}
			
		};
		ac.demo();
		ac.show();
		
	}}