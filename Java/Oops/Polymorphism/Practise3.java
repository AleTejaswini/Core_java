package method_overloading;
interface Document{
	public void open();
	public void close();
}
class WordDoc implements Document{
	@Override
	public void open() {
		System.out.println("opened word document");	
	}

	@Override
	public void close() {
		System.out.println("closed word document");
	}}
class Pdf implements Document{
	@Override
	public void open() {
		System.out.println("opened pdf");
	}

	@Override
	public void close() {
		System.out.println("closed pdf");
		}
	
}

public class Practise3 {

	public static void main(String[] args) {
		Document d[] = {new WordDoc(),new Pdf()};
		for(Document doc :d) {
			doc.open();
			doc.close();
		}
	}

}
