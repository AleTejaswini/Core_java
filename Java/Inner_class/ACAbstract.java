package inner_class;
// anonymous inner class
public abstract class ACAbstract {
	
	public abstract void show();
	public abstract void print();
	public abstract void demo();


	public static void main(String[] args) {
		ACAbstract a1 = new ACAbstract() {

			@Override
			public void show() {
				System.out.println("show method");
				
			}

			@Override
			public void print() {
				System.out.println("print method");
			}

			@Override
			public void demo() {
				System.out.println("Demo");
				
			}
			
		};
		
		a1.show();
		a1.print();
		a1.demo();
		}
		

	}


