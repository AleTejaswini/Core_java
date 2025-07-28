package inner_class;
interface APIService{
	default double getAPIversion() {
		return 1.0;
	}
}
public class Default2 implements APIService {

	public static void main(String[] args) {
	Default2 demo = new Default2();
	double version =demo.getAPIversion();
	System.out.println(version);
	}

}
