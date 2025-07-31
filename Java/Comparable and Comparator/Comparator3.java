package comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Comparator3 {
	String filename;
	long size;
	

	public Comparator3(String filename, long size) {
		this.filename = filename;
		this.size = size;
	}


	
	public String toString() {
		return filename + "-" + size + "bytes";
	}


	public static void main(String[] args) {
		List<Comparator3> file = Arrays.asList(new Comparator3("Doc.txt" , 2000),
				new Comparator3("Tej.jpg", 1000),
				new Comparator3("Affu.png",1500),
				new Comparator3("Video.mp3",7000));
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("Sort (1) by Name and (2) by Size");
		int choice = sc.nextInt();
		
//		Comparator<Comparator3> com = ((choice == 1) ? Comparator.comparing(files -> files.filename) : Comparator.comparingLong(files -> files.size));
//		file.sort(com);
//		System.out.println(file);
		
		// using getter 
		if(choice ==1) {
		file.sort(Comparator.comparing(Comparator3::getFilename));
		System.out.println(file);}
		else  {
			file.sort(Comparator.comparing(Comparator3::getSize));
			System.out.println(file);
		}

	}



	public String getFilename() {
		return filename;
	}



	public long getSize() {
		return size;
	}





}
