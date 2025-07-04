package demo;

import java.io.Serializable;

public class Std implements Serializable { // Java Bean Class
	private int id;
	private int marks;
	private String name;
	
	
	public Std() {
		System.out.println("no args");
	}
	public  Std(int id,int marks) {
		this.id=id;
		this.marks= marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
