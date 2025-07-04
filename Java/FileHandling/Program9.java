package files; // find largest line in text

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program9 {

	public static void main(String[] args) throws IOException {
		File file = new File("./example.txt");
		if(!file.exists()) 
		{
			
			file.createNewFile();
		}
		BufferedReader br = new BufferedReader(new FileReader(file));
		int maxlength =0;
		String longestline = "";
		String currentLine;
		
	
		
		
	    while( (currentLine = br.readLine()) != null) {
	    	if(currentLine.length() > maxlength) {
	    		maxlength = currentLine.length();
                longestline = currentLine;
	    		}
	    }
	    
	    br.close();
	    System.out.println("Longest line is " + maxlength + " characters");
        System.out.println(longestline);
	}
}
