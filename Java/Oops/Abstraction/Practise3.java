package Abstract_class;
abstract class Notifier{
	abstract void send(String message);
	 void ratelimit() {
		 System.out.println("should not exceed 1000 msgs");
		
	}
	
}
class email extends Notifier{

	@Override
	void send(String message) {
	      System.out.println(message);
	}
	
}
class sms extends Notifier{

	@Override
	void send(String message) {
		System.out.println(message);
	}
	
}
public class Practise3 {

	public static void main(String[] args) {
		email e = new email();
		e.send("hello");
		e.ratelimit();
	}

}
