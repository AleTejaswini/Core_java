package learningsystem;

public class Topics {
	private int id;
	private String name;
	private int ChaptersID;

	public Topics(int id, String name, int chaptersID) {
		super();
		this.id = id;
		this.name = name;
		this.ChaptersID = chaptersID;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getChaptersID() {
		return ChaptersID;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setChaptersID(int chaptersID) {
		ChaptersID = chaptersID;
	}

	@Override
	public String toString() {
		return "Topics [id=" + id + ", name=" + name + ", ChaptersID=" + ChaptersID + "]";
	}

}
