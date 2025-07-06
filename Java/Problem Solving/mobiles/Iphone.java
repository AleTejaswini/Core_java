package mobiles;

public class Iphone extends SmartPhone{

	@Override
	public void call() {
		System.out.println("Calls are permitted in Iphone using app");
		
	}

	@Override
	public void internet() {
		System.out.println("can access network and search using siri in Iphone");
		
	}
	public void specialfeature() {
		System.out.println("clicks hd print photos in Iphone");
	}

}
