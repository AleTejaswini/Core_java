package map;

import java.util.Arrays;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,2,1);
	System.out.println(list);
	
	
for(int i =0;i<list.size()/2;i++) {
	if(list.get(i).equals(list.get(list.size() -1 -i))){
		System.out.println(" palindrome");
		break;
	}
	else {
		System.out.println(" not palindrome");
		break;
		
	}

	
}
}}