package comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator6 implements Comparable<Comparator6>{
	 String title;
	 String author;
	 long year;
	 public Comparator6(String title, String author, long year) {
			
			this.title = title;
			this.author = author;
			this.year = year;
		}
	 
	public String getTitle() {
		return title;
	}

	 public String getAuthor() {
		 return author;
	 }

	 public double getYear() {
		 return year;
	 }
	 public String toString() {
		 return title + "->" +author + "->"+ year     ;
	 }

	public static void main(String[] args) {
		List<Comparator6> library = Arrays.asList(new Comparator6("Antarvahini", "Yandamoori Veerendranath", 2023),
			    new Comparator6("Maro Prastanam", "Kinnera Vijayalakshmi", 2023),
			    new Comparator6("Jeevana Vedam", "Gurajada Apparao", 2024),
			    new Comparator6("Antharmukham - Self Discovery", "Yandamoori Veerendranath", 2022),
			    new Comparator6("Manasulo Maata", "Bapu-Ramana", 2023),
			    new Comparator6("Chivaraku Migiledi", "Buchi Babu", 2022),
			    new Comparator6("Jeevana Satyam", "Jandhyala Papayya Sastry", 2024),
			    new Comparator6("Amma Chettu Chepa Chiluka", "Volga", 2022));
    Comparator<Comparator6> comp = Comparator.comparing(Comparator6 ::getAuthor,Comparator.naturalOrder());
    
    Collections.sort(library);		
	library.sort(comp);
	
	library.forEach(System.out::println);
}

	@Override
	public int compareTo(Comparator6 anotheryear) {   // comparable on year
		
		return Long.compare(this.year, anotheryear.year);
	}

}
