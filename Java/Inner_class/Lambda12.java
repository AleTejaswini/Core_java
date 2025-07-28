package inner_class;


import java.util.HashMap;
import java.util.Map;

public class Lambda12 {

	public static void main(String[] args) {
	Map<String,Integer> demo = new HashMap<>();
	demo.put("Teja", 60);
	demo.put("Affu", 70);
	demo.put("Renuka", 80);
	demo.put("Mahesh", 50);
	demo.put("uma", 40);
	demo.put("VAsu", 90);
	
	demo.entrySet().stream().filter(entry -> entry.getValue() >50).forEach( entry -> System.out.println(entry.getKey() + ">>" +entry.getValue()));
		
	}

}
