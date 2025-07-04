package list;

import java.util.HashMap;
import java.util.Map;

public class Practise10 {

	public static void main(String[] args) {
		Map<String ,Integer> s = new HashMap<>();
		s.put("Teja", 98);
		s.put("Affu", 99);
		s.put("Renuka", 100);
		
		System.out.println(s.get("Teja"));
		
		for(Map.Entry< String ,Integer> e : s.entrySet()){
			
			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//			System.out.println(e.getClass());
		}
		
		
		

	}

}
