import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practise2 {

	public static void main(String[] args) throws IOException {
		
		try {
//		FileReader file = new FileReader("C://Users//alete//OneDrive//Documents//meanings.txt");
		FileReader file1 = new FileReader("mydoc.txt");
		BufferedReader br = new BufferedReader(file1);
		System.out.println(br.readLine()); // throws IOException
		br.close();
	}
		catch(FileNotFoundException f) {
			System.out.println("file not found");
			throw f;
		}
		catch(IOException i) {
			System.out.println("Error while reading");
		}

	}}
