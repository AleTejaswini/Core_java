package files;      //using file output stream

import java.io.File; 
import java.io.FileOutputStream;
import java.io.IOException;

public class Program5 { 

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		FileOutputStream fos = new FileOutputStream(file);
		if(file.exists()) {
			file.delete();
			file.createNewFile();
			String str = "teja";
			for(char c : str.toCharArray())
				fos.write((int)c);
			
//			fos.write(77);
//			fos.write(67);
//			fos.write(78);
//			fos.write(87);
//			fos.write(89);
			fos.flush(); //compulsory
			fos.close();
		}

	}

}
