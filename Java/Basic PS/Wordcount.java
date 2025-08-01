package ps;

public class Wordcount {
   // count number of words in a sentence
	public static void main(String[] args) {
		String sentence = "Java is fun";
		String[] words = sentence.split(" ");
		System.out.println(words.length);

	}

}
