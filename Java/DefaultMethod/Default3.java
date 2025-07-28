package inner_class;
interface Printer{
	default void print() {
		System.out.println("uses printer");
	}
}
interface Scanner{
	default void print() {
		System.out.println("uses scanner");
	}
}
class multifun implements Printer,Scanner{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Printer.super.print();
		Scanner.super.print();
	}
	}
public class Default3 {

	public static void main(String[] args) {
		multifun mul = new multifun();
		mul.print();
	}

}
