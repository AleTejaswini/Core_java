// user defined exception

class UnderAge extends Exception{
	UnderAge(String message){
		super(message); // because it is a built in function 
	}
	static void checkAge(int age) throws UnderAge{
		if(age<18) throw new UnderAge("not eligible");
	}
	public class Practise3{
		public static void main(String[] args) {
			try {
				checkAge(16);
				}
			catch(UnderAge u) {
				System.out.println(u.getMessage());
				System.out.println(u.getStackTrace());
			}
		}
		
	}
}