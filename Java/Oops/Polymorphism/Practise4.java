package method_overloading;
interface Notification{
	public void send(String message);
}
class EmailNotify implements Notification{
	@Override
	public void send(String message) {
		System.out.println("Email Notification: " +message);
	}
	
}
class SmsNotify implements Notification{

	@Override
	public void send(String message) {
		System.out.println("Sms Notification: " +message);
	}
	
}
class PushNotify implements Notification{

	@Override
	public void send(String message) {
		System.out.println("Push Notification: " +message);	
	}
	
}
class User{
	Notification notifier;
	public void setmessage(Notification notifier) {
		this.notifier =notifier;
	}
	public void notifyuser(String msg) {
		notifier.send(msg);
	}
}
public class Practise4 {

	public static void main(String[] args) {
		User user = new User();
		
		
		Notification email = new EmailNotify();
		user.setmessage(email);
		user.notifyuser("Hello");
		
		
		Notification sms = new SmsNotify();
		user.setmessage(sms);
		user.notifyuser("Hello");
		
		
		Notification push = new PushNotify();
		user.setmessage(push);
		user.notifyuser("Hello");
		
		}
	}


