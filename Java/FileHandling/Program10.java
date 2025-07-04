package files;    // no of words in text file

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program10 {

	public static void main(String[] args) throws IOException {
		File file = new File("./example.txt");
		if(!file.exists()) 
		{
			
			file.createNewFile();
		}
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line;
		int count =0;
		String text = new String();
	    while( (line= br.readLine()) != null) {
	    	text +=line+"\n"  ;
	    	count =text.length();
	    	 }
	    System.out.println(text.toUpperCase());	
	    System.out.println(count);
    	br.close();	
		

	}

}
