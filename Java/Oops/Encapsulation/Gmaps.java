package encapsulation;

public class Gmaps {
private String GPS;
private  String network;
public void set(String gps ,String N) {
	GPS = gps;
	network = N;
}
	public String  getgps() {
		return GPS;
	}
	public String getnetwork() {
		return network;
}
	public void display() {
		System.out.println("we need  to enter location");
	}
public class demo{
	public static void main(String args[]) {
		Gmaps g = new Gmaps();
		g.display();
		g.set("locates place" , "fetch maps data");
		g.getgps();
		g.getnetwork();
		System.out.println("GPS :" + g.getgps()+ "\n Network:" + g.getnetwork());
	}
}


}

