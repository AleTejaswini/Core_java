package files; // using file writer

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program6 {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		FileWriter fw = new FileWriter(file);
		if(file.exists()) {
			file.delete();
			file.createNewFile();
			}
		String s = "ART";
		fw.write(s);
		fw.flush();
		fw.close();

	}

}
