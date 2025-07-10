package demo;
// this keyword   //Differentiate Between Instance and Local Variables
public class Student {
//	int id;
//	String name;
//	Student (int id, String name){
//		this.id=id;
//		this.name= name;
//		}
//	public static void main(String[] args) {
//		Student s1 = new Student(01,"Teja");
//		Student s2 = new Student(02,"Affu");
//		Student s3 = new Student(03,"Renu");
//		
//		System.out.println(s1.id);
//		System.out.println(s2.name);	
//		System.out.println(s3.name);
		
	
	
//	 Call One Constructor from Another
	
//	    int id;
//	    String name;
//
//	    Student() {
//	        this(100, "Teja"); 
//	    }
//
//	    Student(int id, String name) {
//	        this.id = id;
//	        this.name = name;
//	    }
//	public static void main(String[] args) {
//		Student s = new Student();
//		System.out.println(s.id);
//	}
		
		// Pass Current Object as Argument
	     String name = "Teja";
	    void display(Student s) {
	        System.out.println("Name: " + s.name);
	    }

	    void show() {
	        display(this); 
	    }
	    public static void main(String[] args) {
	    	Student s1 = new Student();
	    	
	    	s1.show();
		}
	}
      
		
		

	
