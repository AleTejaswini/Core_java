
public class EH5main {

	public static void main(String[] args) throws Exception{
		try {
			System.out.println(1/0);
		}
		catch(ArithmeticException ae) {
			throw new EH5LoginException("Login failed");
		}
		

	}

}
