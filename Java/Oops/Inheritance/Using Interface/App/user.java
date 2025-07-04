
 public class user implements Admin{
	public  void read()
	{
		System.out.println("read");
	}
	public  void write()
	{
		System.out.println("write");
	}
	public  void manage()
	{
		System.out.println("manage");
	}
	
	
	

	public static void main(String[] args) {
	user demo = new user();
			demo.read();
			demo.write();
			demo.manage();
		
		
		// TODO Auto-generated method stub

	}

}
