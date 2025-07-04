package files;     // no of occurrence of a given string

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program11 {

	public static void main(String[] args) throws IOException {
		File file = new File("./example.txt");
		if(!file.exists()) 
		{
			
			file.createNewFile();
		}
		BufferedReader br = new BufferedReader(new FileReader(file));
		String find = "i";
		
		
		String line ;
		int count =0;
		
	    while( (line= br.readLine()) != null) {
	    	String[] words =line.split("\\s+");
	    	for (String word : words) {
                if (word.equalsIgnoreCase(find)) {
                    count++;
	           
                } 
	    	}   
	    }  
	    br.close();
	    System.out.println(count);


	}
	
}
