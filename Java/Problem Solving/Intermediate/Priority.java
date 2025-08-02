package intermediate;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Priority {
	String priority;
	LocalDate deadline;
	String taskname;
	public Priority(String priority, LocalDate deadline, String taskname) {
		
		this.priority = priority;
		this.deadline = deadline;
		this.taskname = taskname;
	}
	public String getPriority() {
		return priority;
	}
	public LocalDate getDeadline() {
		return deadline;
	}
	public String getTaskname() {
		return taskname;
	}
	
	public String toString() {
		return priority +"->"+deadline+"->"+taskname;
				
	}
	public static void main(String[] args) {
		List<String> p = Arrays.asList("High","Medium","Low");
		List<Priority> list = Arrays.asList(new Priority("High", LocalDate.of(2024, 8, 20), "Implement Login"),
			    new Priority("Medium", LocalDate.of(2024, 8, 18), "Write API Docs"),
			    new Priority("Low", LocalDate.of(2024, 8, 25), "Refactor Codebase"),
			    new Priority("High", LocalDate.of(2024, 8, 19), "Fix Critical Bug"),
			    new Priority("Medium", LocalDate.of(2024, 8, 18), "Team Meeting"),
			    new Priority("High", LocalDate.of(2024, 8, 21), "Deploy to Production"),
			    new Priority("Low", LocalDate.of(2024, 8, 22), "Clean Up Repositories"));
		
		Comparator<Priority> com = Comparator.comparing(Priority :: getPriority,Comparator.comparing(p:: indexOf))
				.thenComparing(Comparator.comparing(Priority::getDeadline));
		list.sort(com);
		list.forEach(System.out::println);
		
	}

}
