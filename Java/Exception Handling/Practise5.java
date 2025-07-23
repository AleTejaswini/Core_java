// Error=>memory overflow
public class Practise5 {

	public static void main(String[] args) {
		Error(); // recursive call
}

	public static void Error() { // method
		Error(); //calling itself
	}

}



