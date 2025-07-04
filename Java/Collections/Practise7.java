package list;

import java.util.ArrayList;
import java.util.List;

public class Practise7 {

	public static void main(String[] args) {
		// Create list of prime number up to 50
		List<Integer> pm = new ArrayList<>();
		
		 for(int num=2;num<=50;num++) {
			 boolean isprime= true;
			 
			 for(int i=2;i<=Math.sqrt(num);i++) {
				 if(num% i ==0) {
					 isprime = false;
					 break;
				 }
				 }
				 if(isprime) {
					 pm.add(num);
				 }
			 } System.out.println(pm);
			
		 
		 
	        }}


