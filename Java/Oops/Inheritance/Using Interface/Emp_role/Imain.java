package Iemp_role;

public class Imain implements IHR {

	
	public void code() {
		System.out.println("writes code");
		
	}


	public void meetings() {
		System.out.println("conducts meetings");
		
	}

	public void salary() {
		System.out.println("Gets salary");

		
	}

	
	public void details() {
		System.out.println("get details");
		
	}

	public void manages() {
		System.out.println("manages every all");
		
	}
	public static void main(String args[])
	{
		Imain demo = new Imain();
		demo.manages();
		demo.code();
		demo.salary();
		demo.meetings();
		demo.details();
	}
	

}
