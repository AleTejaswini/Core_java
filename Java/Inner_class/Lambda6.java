package inner_class;
@FunctionalInterface
interface printer{
	 void print(String msg);
}
public class Lambda6 {

	public static void main(String[] args) {
		printer p = msg->System.out.println(msg);
		p.print("Hello");
	}

}
