package single;

public class Single_1 {

	public static void main(String[] args) {
		// sum of integers
		int i[]= {1,2,3,4,5}; // int i[] = new int[5];
		System.out.println(i[0] + i[2] + i[3] +i[1] +i[4]);
	     
	     // avg of integers 
		int j[] = new  int[5];
	    j[0]= 5;
	    j[1]=3;
	    j[2]=5;
	    j[3]=9;
	    j[4]=3;
	    int avg = (j[0]+j[1]+j[2]+j[3]+j[4])/5;
	    System.out.println(avg);
	    
	    
	     //Merging of two arrays
	    String[] fru = new String[] {"banana", "apple","graphs"};
	    String[]  veg = new String[] {"potato", "beans","cabbage"};
	     String[] merge = new String[fru.length + veg.length];
	     
	     for(int a=0; a<fru.length; a++) {
	    	 merge[a]=fru[a];
	    	  }
	     for(int b =0 ;b<veg.length;b++) {
	    	 
			 merge[fru.length + b]= veg[b];
	     }
	     
	     System.out.println("Merged array:");
	    for(String item :merge) {
	    	
	    	   System.out.println(item);
	     }
	    

	    
	    
		
	
	}

}
