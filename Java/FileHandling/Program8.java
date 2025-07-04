package files; //number of lines in a text file

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program8 {

	public static void main(String[] args) throws IOException {
		File file = new File("./example.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		BufferedReader br = new BufferedReader(new FileReader(file));
		int linecount =0;
		
		String text = new String();
		String line = new String();
	    while( (line= br.readLine()) != null) {
	    	text +=line;
	    	linecount++;
	    	
	    	
	    }
	    System.out.println(linecount);
		br.close();

	}

}
