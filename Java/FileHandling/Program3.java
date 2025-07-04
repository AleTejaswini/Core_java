package files; // using file reader // same as FileInputStream

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) throws IOException {
		File f = new File("./sample.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileReader file = new FileReader(f);
		int ascii;
		
		while((ascii=file.read())!= -1 )
		{
	       System.out.print((char)ascii);
			
		}
		
             file.close();
	}

}
