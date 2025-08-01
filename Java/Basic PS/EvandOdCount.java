package ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvandOdCount {

	public static void main(String[] args) {
		List<Integer>  list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		int ecount=0;
		int ocount=0;
  		
		for(Integer num : list) {
			if(num % 2 == 0) {
				even.add(num);
				ecount++;
			}
			else {
				odd.add(num);
				ocount++;
			}
		}
		System.out.println("Even count is : "+ ecount);
		System.out.println("Odd count is : "+ ocount);
	}

}
