package learningsystem;

public class Course {
	private int id;
	private String name;
	private int SubjectAreaID;

	public Course(int id, String name, int subjectAreaID) {
		super();
		this.id = id;
		this.name = name;
		this.SubjectAreaID = subjectAreaID;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSubjectAreaID() {
		return SubjectAreaID;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSubjectAreaID(int subjectAreaID) {
		SubjectAreaID = subjectAreaID;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", SubjectAreaID=" + SubjectAreaID + "]";
	}

}
