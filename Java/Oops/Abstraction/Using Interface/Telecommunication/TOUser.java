package Interface;

public class TOUser {

	public static void main(String[] args) {
		Jio j = new Jio();
		Airtel a =new Airtel();
		Bsnl b= new Bsnl();
		j.Calling();
		j.Pho_num();
		j.Spam_calls();
		a.Pho_num();
		a.Sms();
		b.Pho_num();
		
		telecomm_operators.callertunes(); // static method
		
		
		

	}

}
