package learningsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseManager {

	public void addSubjectArea(int id, String name) {

		String sql = "insert into subjectarea (SubjectID,Subject_Name) values (?,?)";
		try (Connection con = DBConnection.getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			int rows = preparedStatement.executeUpdate();
			System.out.println("SubjectArea added successfully . Rows affected: " + rows);
		} catch (SQLException e) {
			System.out.println("Error in adding subjectarea: " + e.getMessage());
		}
	}

	public void getAllSubjectAreas() {
		String sql = "select * from subjectarea";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("Subject_Name"));
			}
		} catch (SQLException e) {
			System.out.println("Error in retriving all subjectareas: " + e.getMessage());
		}

	}

	public void isSubjectAreaAvailable(int id) {
		String ABC = "select * from subjectarea where SubjectID = ?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(ABC)) {
			ps.setInt(1, id);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					System.out.println("SubjectArea : [ID: " + rs.getInt("SubjectID") + ", Name: "
							+ rs.getString("Subject_Name") + "] is available");
				} else {
					System.out.println("SubjectArea with ID " + id + " is not available");
				}
			}
		} catch (SQLException e) {
			System.out.println("Error in checking subjectarea: " + e.getMessage());
		}
	}

	public void updateSubjectArea(int id, String name) {
	
		String sql = "update  subjectarea set Subject_Name =? where SubjectID =?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, name);
			ps.setInt(2, id);

			int rows = ps.executeUpdate();
			System.out.println("SubjectArea updated successfully . Rows affected: " + rows);
		} catch (SQLException e) {
			System.out.println("Error in updating subjectarea: " + e.getMessage());
		}
	}

	public void deleteSubjectArea(int id) {
		String sql = "delete from subjectarea where SubjectID =?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, id);

			int rows = ps.executeUpdate();
			if(rows>0) {
			System.out.println("SubjectArea deleted successfully . Rows affected: " + rows);
			}
			else {
				System.out.println("SubjectArea with ID: " + id +" is not available.Rows affected : "+rows);
			}
		} catch (SQLException e) {
			System.out.println("Error in deleting subjectarea: " + e.getMessage());
		}
	}

	// course
	public void addCourse(int id, String name, int subjectid) {
		
		String sql = "insert into course (CourseID, CourseName, SubjectID) values (?,?,?)";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, subjectid);
			int rows = ps.executeUpdate();
			System.out.println("Course inserted successfully. Rows affected: " + rows);
		} catch (SQLException e) {
			System.out.println("Error in adding course: " + e.getMessage());
		}
	}

	public void getAllCourses() {
		String sql = "select * from course";
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				System.out.println(rs.getString("CourseName"));

			}
		} catch (SQLException e) {
			System.out.println("Error in retriving all courses: " + e.getMessage());
		}
	}

	public void isCourseAvailable(int id) {
		String sql = "select * from course where CourseID =?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, id);
			try (ResultSet rs = ps.executeQuery()) {

				if (rs.next()) {
					System.out.println("Course with ID " + rs.getInt("CourseID") + " , Name : "
							+ rs.getString("CourseName") + " is available");
				} else {
					System.out.println("Course with ID " + id + " is not available");
				}
			}
		} catch (SQLException e) {

			System.out.println("Error in checking course : " + e.getMessage());
		}

	}

	public void updateCourse(int id, String name) {
		
		String sql = "update course set CourseName = ? where CourseID = ?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, name);
			ps.setInt(2, id);
			int rows = ps.executeUpdate();
			System.out.println("Course name is successfully updated. Rows affected : " + rows);
		} catch (SQLException e) {
			System.out.println("Error in updating Course : " + e.getMessage());
		}
	}

	public void deleteCourse(int id) {
		String sql = "delete from course where CourseID = ?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, id);
			int rows = ps.executeUpdate();
			if(rows >0) {
			System.out.println("Course deleted successfully. Rows affected :" + rows);}
			else {
				System.out.println("Course with ID: "+id + "is not available.Rows affected :" +rows);
			}
		} catch (SQLException e) {
			System.out.println("Error in deleting course : " + e.getMessage());
		}
	}

	// Chapters
	public void addChapter(int id, String name, int courseid) {
		String sql = "insert into chapters (ChapterID, ChapterName, CourseID) values(?,?,?)";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, courseid);
			int rows = ps.executeUpdate();
			System.out.println("Chapter inserted successfully. Rows affected: " + rows);
		} catch (SQLException e) {
			System.out.println("Error in inserting chapters: " + e.getMessage());

		}
	}

	public void getAllChapters() {
		String sql = "select * from chapters";
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				System.out.println(rs.getString("ChapterName"));
			}
		} catch (SQLException e) {
			System.out.println("Error in retriving all chapters : " + e.getMessage());
		}
	}

	public void isChapterAvailable(int id) {
		String sql = "select * from chapters where ChapterID =?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, id);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					System.out.println("Chapters [id=" + rs.getInt("ChapterID") + ", name="
							+ rs.getString("ChapterName") + ", CourseID=" + rs.getInt("CourseID") + "] is available");
				} else {
					System.out.println("Chapter with id : " + id + " is not available");
				}
			}
		} catch (SQLException e) {
			System.out.println("Error in checking chapters: " + e.getMessage());
		}

	}

	public void updateChapter(int id, String name) {
		
		String sql = "update chapters set ChapterName = ? where ChapterID = ?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, name);
			ps.setInt(2, id);
			int rows = ps.executeUpdate();
			System.out.println("Chapter name is successfully updated. Rows affected : " + rows);
		} catch (SQLException e) {
			System.out.println("Error in updating chapters : " + e.getMessage());
		}
	}

	public void deleteChapter(int id) {
		String sql = "delete from chapters where ChapterID = ?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, id);
			int rows = ps.executeUpdate();
			if(rows>0) {
			System.out.println("Chapter deleted successfully. Rows affected :" + rows);}
			else {
				System.out.println("Chapter with ID: "+id + "is not available.Rows affected :" +rows);
			}
		} catch (SQLException e) {
			System.out.println("Error in deleting chapters : " + e.getMessage());
		}
	}

// Topic
	public void addTopic(int id, String name, int chapterid) {
		String sql = "insert into topics (TopicID, TopicName, ChapterID) values(?,?,?)";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, chapterid);
			int rows = ps.executeUpdate();
			System.out.println("Topic inserted successfully. Rows affected: " + rows);
		} catch (SQLException e) {
			System.out.println("Error in inserting topics: " + e.getMessage());

		}
	}

	public void getAllTopics() {
		String sql = "select * from topics";
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				System.out.println(rs.getString("TopicName"));
			}
		} catch (SQLException e) {
			System.out.println("Error in retriving all topics : " + e.getMessage());
		}
	}

	public void isTopicAvailable(int id) {
		String sql = "select * from topics where TopicID =?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, id);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					System.out.println("Topics [id=" + rs.getInt("TopicID") + ", name=" + rs.getString("TopicName")
							+ ", ChapterID=" + rs.getInt("ChapterID") + "] is available");
				} else {
					System.out.println("Topics with ID : " + id + " is not available");
				}
			}
		} catch (SQLException e) {
			System.out.println("Error in checking topics: " + e.getMessage());
		}

	}

	public void updateTopic(int id, String name) {
		
		String sql = "update topics set TopicName = ? where TopicID = ?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, name);
			ps.setInt(2, id);
			int rows = ps.executeUpdate();
			System.out.println("Topic name is successfully updated. Rows affected : " + rows);
		} catch (SQLException e) {
			System.out.println("Error in updating topic : " + e.getMessage());
		}
	}

	public void deleteTopic(int id) {
		String sql = "delete from topics where TopicID = ?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, id);
			int rows = ps.executeUpdate();
			if(rows> 0) {
			System.out.println("Topic deleted successfully. Rows affected :" + rows);}
			else {
				System.out.println("Topic with ID: "+id + " is not available.Rows affected : "+rows);
			}
		} catch (SQLException e) {
			System.out.println("Error in deleting topic : " + e.getMessage());
		}
	}

}
