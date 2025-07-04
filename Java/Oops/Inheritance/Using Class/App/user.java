package inheritance;

public class user {

	public static void main(String[] args) {
		
	Guest guest =new Guest();
	Developer  dev = new Developer();
	Admin admin = new Admin();
	guest.read();
	dev.read();
	dev.write();
	admin.read();
	admin.write();
	admin.manage();
	
	

	}

}
