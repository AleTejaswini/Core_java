package inner_class;

import java.time.LocalDate;

interface util{
	static  LocalDate getcurrentDate() {
		 return LocalDate.now();
	}
	default String printAppName() {
		return "MyApp 1.0";
	}
}
public class Default5 implements util{

	public static void main(String[] args) {
		
		Default5 def = new Default5();
		String app = def.printAppName();
		System.out.println(app);
		
		LocalDate date= util.getcurrentDate();
		System.out.println(date);
	}

}
