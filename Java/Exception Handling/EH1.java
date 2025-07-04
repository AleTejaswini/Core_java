
public class EH1 {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		int k;
		try {
		k= i/j;
		System.out.println(k);
		}
		catch(ArithmeticException  E){
			System.out.println(E.toString());
			System.out.println(E.getLocalizedMessage());
			System.out.println(E.getStackTrace());
			throw E;
		}
		finally {
			System.out.println("finally code is executed");
		}
		


	}

}
