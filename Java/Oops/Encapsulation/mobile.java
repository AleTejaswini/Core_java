package encapsulation;

public class mobile {
	private  String OS;
	private int  memory;
	private int battery;

	public void setvalues( String os , int M, int B) {
		OS =os;
		memory = M;
		battery = B;
	}
		public String getos() {
			return OS;
			
		}
		public int getmem() {
			return memory;
		
	}
		public int getbat() {
			return battery;
		}
		public void text() {
			System.out.println("we can message");
		}
		public void calling() {
			System.out.println("calls are permmited");
		}
		public class phone{
			public static void main(String args[]) {
				mobile demo = new mobile();
				demo.setvalues("android", 25, 3000);
				demo.text();
				demo.calling();
			System.out.println("Operating system: " +demo.getos() + "\n Memory: "+ demo.getmem() + "\n Battery: " + demo.getbat());
			}
		}

}
