package learningsystem;

public class Chapters {
	private int id;
	private String name;
	private int CourseID;

	public Chapters(int id, String name, int courseID) {
		super();
		this.id = id;
		this.name = name;
		this.CourseID = courseID;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCourseID() {
		return CourseID;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourseID(int courseID) {
		CourseID = courseID;
	}

	@Override
	public String toString() {
		return "Chapters [id=" + id + ", name=" + name + ", CourseID=" + CourseID + "]";
	}

}
