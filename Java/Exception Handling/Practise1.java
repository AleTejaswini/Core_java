//handles Arithmetic exception
public class Practise1 {
	

 public static int division(int a,int b) {
	
		try {
			return a/b;
		}
		catch(ArithmeticException e){
			System.out.println("cant divide a number with zero");
			return -1;

			}

 }
	public static void main(String[] args) {
		Practise1 p = new Practise1();
		int result= p.division(10,0);
		System.out.println(result);
			
		}
	

}
