package intermediate;

public class Student {
String name;
int   rollno;
int economicsmarks;
int commercemarks;
int  psychologymarks ;
int totalmarks;

	public Student(String name, int rollno, int economicsmarks, int commercemarks, int psychologymarks) {

	this.name = name;
	this.rollno = rollno;
	this.economicsmarks = economicsmarks;
	this.commercemarks = commercemarks;
	this.psychologymarks = psychologymarks;
	
}
	public int total() {
		   return totalmarks = economicsmarks+psychologymarks+commercemarks ;

	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Teja" ,17,89,85,90);
		System.out.println(s1.name + " achieved " + s1.total()+ " marks" );
	}

}
