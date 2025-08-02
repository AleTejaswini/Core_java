package ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDup {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,6,7,2,1,9,6,0,3);
		List<Integer> unique = new ArrayList<>();
		for(Integer num :list) {
			if(!unique.contains(num)) {
				unique.add(num);
				}
			
		}
		System.out.println(unique);
		
		//or else using set
		// or using java8  features
		List<Integer> uni = list.stream().distinct().collect(Collectors.toList());
		System.out.println(uni);
	}
	

}
