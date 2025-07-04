package files;       // using buffered  reader

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program4 {

	public static void main(String[] args) throws IOException {
	File f = new File("./sample.txt");
	if( !(f.exists())) {
		f.createNewFile();
	}
	
	FileReader fr = new FileReader(f);
	FileInputStream file = new FileInputStream(f);// optional
	InputStreamReader isr = new InputStreamReader(file); //optional
    BufferedReader br = new BufferedReader(isr);
    String line = new String();
    String text = new String();
    while( (line= br.readLine()) != null) {
    	text +=line;
    }
    System.out.println(text);
	
     fr.close();
     br.close();
     file.close();
     isr.close();
	} 
}
