package files;     // adding words to existing words in text file 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program7 {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("./sample.txt");
		
		// adding text to file
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		if(file.exists()) {
			file.delete();
			file.createNewFile();
			}
             bw.write("teja");
	         bw.flush();
	         bw.close();
	         
	         
		
		//updating text for existing file
//		String Existing = new String();
//		String line = "";
//		BufferedReader  br = new BufferedReader( new FileReader (file));
//		while((line = br.readLine()) != null)
//		{
//			Existing += line + "\n";
//		}
//		
//		
//		String s = "rishi";
//		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//		bw.write(Existing+s);
//	    bw.flush();
//	   
//	    bw.close();
//		br.close();
	}

}
