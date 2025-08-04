package intermediate;

import java.util.Scanner;

class Question {
	String question;
	String OptionA ,OptionB,OptionC,OptionD;
	char correctOption;
	public Question(String question, String optionA, String optionB, String optionC, String optionD,
			char correctOption) {
	
		this.question = question;
		this.OptionA = optionA;
		this.OptionB = optionB;
		this.OptionC = optionC;
		this.OptionD = optionD;
		this.correctOption = correctOption;
	}
	public boolean isCorrect(char useranswer) {
		return Character.toUpperCase(useranswer) == correctOption;
	}
	public void display() {
		System.out.println(question);
		System.out.println("A." +OptionA);
		System.out.println("B." +OptionB);
		System.out.println("C." +OptionC);
		System.out.println("D." +OptionD);
		System.out.println("select options(A/B/C/D)");
	}}
 
 
	public class QuizApp{
	public static void main(String[] args) {
		
		Question[] quiz = new Question[5];
		Scanner sc =  new Scanner(System.in);
		quiz[0] = new Question("What is the capital of India?" , "Telangana","New Delhi" , "Maharastra","AndhraPradesh",'B');
		
		quiz[1] =new Question("Which company developed Java" , "Microsoft","SunMicrosystem" ,"Apple","Google" ,'B');
		
		quiz[2] = new Question("Which keyword is used to inherit class in java" , "extends" , "implements","while","for",'A');
		
		quiz[3] = new Question("Which data structure is used LIFO" ,"Queue" ,"Array","Tree","Stack" ,'D');
		
		quiz[4] = new Question("Which one of the following doesnt belongs to oops concept" ,"Inheritance","Abstraction","Collection","Polymorphism",'C');
		
		int score =0;
		
		
		
		for(int i =0 ;i<quiz.length;i++) {
			System.out.println("Question  "  + (i+1));
			quiz[i].display();
			char useranswer = sc.next().charAt(0);
			if(quiz[i].isCorrect(useranswer)) {
				System.out.println("Correct answer");
			}
			else {
				System.out.println("Wrong answer");
			}
		}
		
		int total = quiz.length;
		double percentage = (score /total)*100;
		String result = percentage>=50? "Pass" :"Fail";
		
		System.out.println("Result: " +result);
		
	}

}
