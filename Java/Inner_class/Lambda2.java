package inner_class;
interface checked{
	public void perform() throws Exception;
}

public class Lambda2 {
	
	public static void main(String[] args) {
		checked c = ()->{
			throw new Exception("checked exception from lambda");
		};
		try {
			c.perform();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
