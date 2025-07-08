package inner_class;

public class AnonymousOuter {

	public static void main(String[] args) {
		
		Class1 c = new Class1()
		{
			public void print() {
				System.out.println("updated print");
			}
			
		};
		
		c.print();
	}
	}
	class Class1{
		public void show() {
			System.out.println("show");
		}
		public void print() {
			System.out.println("print");
		}
		
	}
//   class class2 extends Class1{
//	   public void print() {                          // instead of creating a  new class for  
//		   System.out.println("updated print");          one method overriding we use anonymous class
//	   }
//   }

