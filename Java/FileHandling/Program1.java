package files; //using FileInputStream

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) throws IOException {
		File f = new File("./sample.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileInputStream file = new FileInputStream(f);
	
//		System.out.println(file.read()); // reads only first letter in ascii code 
//		System.out.println((char)file.read()); // reads  next ascii code  in character 
		
		
		// printing all character 
//		int ascii;
//		
//		while((ascii=file.read())!= -1 )
//		{
//	       System.out.print((char)ascii);
//			
//		}
		
		//printing all characters(alternate)
		  int asc;
		  String text = new String();
		  
		  while ((asc = file.read())!= -1) {
		  text += String.valueOf((char)asc);
		 }
		  System.out.println(text);
		
		  
		  
		file.close(); // compulsory should close to avoid damages in file
	}

}
