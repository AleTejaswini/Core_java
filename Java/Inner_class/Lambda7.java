package inner_class;
@FunctionalInterface
interface cal1{
	void execute(int a, int b);
}
public class Lambda7 {

	public static void main(String[] args) {
		cal1 add = (a,b) -> System.out.println(a+b);
		cal1 sub = (a,b)-> System.out.println(a-b);
		cal1 mul = (a,b)-> System.out.println(a*b);
		cal1 div = (a,b) -> System.out.println(b!=0 ? a/b :0 );
		
		add.execute(10, 5);
		sub.execute(10, 5);
		mul.execute(10, 5);
		div.execute(10, 5);
		
	}

}
