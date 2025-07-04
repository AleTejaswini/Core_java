package Isim;

public class Imain implements Isim5g {
	public  void sms()

	{
		System.out.println("we can text a message");
	}
	public void calling()
	{
		System.out.println("calling is available");
		
	}
	public void gprs()
	{
		
		System.out.println("we can access internet");
	}
	public void volte()
	{
		System.out.println("voice can be translated using 4g network");
		
	}
	public void network5g()
	{
		System.out.println("unlimited internet");
	}
	

	public static void main(String[] args) {
		Imain demo = new Imain();
		demo.gprs();
		demo.network5g();
		demo.volte();
	}

}
