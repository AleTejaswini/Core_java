package encapsulation;

public class camera {
	private String CPU;
	private String OS;
	public void set(String c,String o) {
		CPU = c;
		OS = o;
		
	}
	public String getc() {
		return CPU;
	}
	public String geto() {
		return OS;
		
	}
	public void input() {
		System.out.println(" touch input");
	}
public class demo{
	public static void main(String arg[]) {
		camera cam = new camera();
		cam.input();
		cam.set("Start camera process", "sends instructions to cpu");
		System.out.println("CPU is used to  :" +cam.getc() + "\n OS is used for:" +cam.geto() );
		
	}
}
}
