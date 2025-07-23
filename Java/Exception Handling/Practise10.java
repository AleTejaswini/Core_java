

public class Practise10 {

			public static void main(String[] args) {
				try {
					System.out.println("inside try");
					int result = 10/0;
					System.out.println(result);
							
				}
				catch(ArithmeticException ae) {
					System.out.println("Caught exeption " +ae);
					throw ae; // re-throw exception
					
				}
				finally {
					System.out.println("inside final");
					String a1 = null;
					System.out.println(a1.length());
					
					
				}
			}

			}
	

	


