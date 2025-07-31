package comparable;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparator7 {
	String priority;
	LocalDate deadline;
	String taskname;
	public String getPriority() {
		return priority;
	}
	public LocalDate getDeadline() {
		return deadline;
	}
	public String getTaskname() {
		return taskname;
	}
	public Comparator7(String priority, LocalDate deadline, String taskname) {
		super();
		this.priority = priority;
		this.deadline = deadline;
		this.taskname = taskname;
	}
	public String toString() {
		return priority + "->"+ deadline + "->" +taskname;
	}
	public static void main(String[] args) {
		List<String> prio = Arrays.asList("High","Medium","Low");
		List<Comparator7> list = Arrays.asList(new Comparator7("High", LocalDate.of(2024, 8, 20), "Implement Login"),
			    new Comparator7("Medium", LocalDate.of(2024, 8, 18), "Write API Docs"),
			    new Comparator7("Low", LocalDate.of(2024, 8, 25), "Refactor Codebase"),
			    new Comparator7("High", LocalDate.of(2024, 8, 19), "Fix Critical Bug"),
			    new Comparator7("Medium", LocalDate.of(2024, 8, 18), "Team Meeting"),
			    new Comparator7("High", LocalDate.of(2024, 8, 21), "Deploy to Production"),
			    new Comparator7("Low", LocalDate.of(2024, 8, 22), "Clean Up Repositories"));
		Comparator<Comparator7> com = Comparator.comparing(Comparator7 ::getPriority,Comparator.comparing(prio :: indexOf))
				.thenComparing(Comparator.comparing(Comparator7::getDeadline).thenComparing(Comparator.comparing(Comparator7::getTaskname)));
		
		list.sort(com);
		
		list.forEach(System.out::println);
	}

}
