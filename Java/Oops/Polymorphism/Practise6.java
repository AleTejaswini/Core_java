package method_overloading;
abstract class Discount{
	double applydiscount(double price) {
		return price;
	}
}
class Regular extends Discount{
	double applydiscount(double price) {
		return price - price *0.05;
	}
	
}
class Premium extends Discount{
	double applydiscount(double price) {
		return price - price * 0.15;
	}
	
}
class VIP extends Discount{
	double applydiscount(double price) {
		return price -price * 0.25;
	}
}


public class Practise6 {

	public static void main(String[] args) {
		Discount dis = new Regular();
		System.out.println(dis.applydiscount(500));
		
	}

}
