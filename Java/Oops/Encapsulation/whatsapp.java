package encapsulation;

public class whatsapp {
	private String keyboard;
	private String sent;
public void set(String K, String S) {
	keyboard = K;
	sent = S;
}
public String getK() {
	return keyboard;
}
public String getS() {
	return sent;
}
public void enter() {
	System.out.println("we enter the text message");
}
public void press() {
	System.out.println("to send a text we just press send ");
}
public  class app{
	public static void main(String args[]) {
		whatsapp w = new whatsapp();
		w.set( "inputs data","sent via internet");
		w.enter();
		w.press();
		System.out.println("Keyboard: " +w.getK() + "\nmessage is: " + w.getS());
		
	}
}
}
