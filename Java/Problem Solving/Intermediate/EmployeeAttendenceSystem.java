package intermediate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Problem:
Design a system that records daily attendance of employees.

Each employee can check-in and check-out.

Calculate total working hours per day.

Generate a report of employees who worked less than 8 hours in a day.

Concepts Used:
OOP (Class Design), LocalDateTime, Duration, Collections (Map), Streams.
 */
 class Employee {
	int EmployeeId;
	String EmployeeName;
	public Employee(int employeeId, String employeeName) {
		
		this.EmployeeId = employeeId;
		this.EmployeeName = employeeName;
	}
public String toString() {
	return EmployeeName + "(" + EmployeeId + ")";
}
 }
class AttendenceRecord{
	Employee Employee;
	LocalDateTime checkINTime;
	LocalDateTime checkOUTTime;
	public AttendenceRecord(Employee employee, LocalDateTime checkINTime) {
		
		Employee = employee;
		this.checkINTime = checkINTime;
		
	}
	public void checkOUT(LocalDateTime checkOUTTime) {
		this.checkOUTTime=checkOUTTime;
	}
	
	public  Duration getWorkingHours(){
		if(checkINTime!= null && checkOUTTime != null) {
			return Duration.between(checkINTime, checkOUTTime);
		}else {
			return Duration.ZERO;
		}
	}
	
}

class AttendenceManager{
	Map<LocalDate, List<AttendenceRecord>> attendanceData= new HashMap<>();
	
	public void CheckIN(Employee emp) {
		LocalDate today = LocalDate.now();
		LocalDateTime now = LocalDateTime.now();
		AttendenceRecord record = new AttendenceRecord(emp,now);
		attendanceData.computeIfAbsent(today, k->new ArrayList<>()).add(record);
		System.out.println(emp + "checked in " + now.format(DateTimeFormatter .ofPattern("HH : mm :ss")));
		
	}
	public void CheckOUT(Employee emp) {
		LocalDate today = LocalDate.now();
		LocalDateTime now = LocalDateTime.now();
		List<AttendenceRecord> records =attendanceData.getOrDefault(today, new ArrayList<>());
		for(AttendenceRecord record:records) {
			if(record.Employee.EmployeeId ==emp.EmployeeId && record.checkOUTTime==null) {
				record.checkOUT(now);
				System.out.println(emp + "checked out at " + now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
				return;
			}
		}
		System.out.println("No checked-in record found for " +emp);
	}
	
	public void generateShortHoursReport(LocalDate date) {
		List<AttendenceRecord> records =attendanceData.getOrDefault(date, new ArrayList<>());
		System.out.println("\nEmployees who worked less than 8 hours on " +date + ":");
		for(AttendenceRecord record :records) {
			Duration worked = record.getWorkingHours();
			if(worked.toHours() < 8) {
				System.out.println(record.Employee + " | worked: " + worked.toHours() + " hours ");
			}
		}
	}
}
public class EmployeeAttendenceSystem{
	public static void main(String[] args) throws InterruptedException {
		Employee e1 = new Employee(1,"Teja");
		Employee e2 =new Employee(2,"Renu");
		
		AttendenceManager manager = new AttendenceManager();
		manager.CheckIN(e1);
		manager.CheckIN(e2);
		
		Thread.sleep(2000);
		manager.CheckOUT(e1);
		
		Thread.sleep(2000);
		
		manager.CheckOUT(e1);
		
		Thread.sleep(2000);
		manager.CheckOUT(e2);

	}

}
