package me.dec7.java;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class CourseSession {

	private String department;
	private String number;
	private List<Student> students;
	private Date startDate;
	
	// 생성자
	public CourseSession(String department, String number) {
		this.department = department;
		this.number = number;
		this.students = new ArrayList<Student>();
	}
	
	public CourseSession(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
		this.students = new ArrayList<Student>();
	}



	public String getDepartment() {
		
		return department;
		
	}

	public String getNumber() {
		
		return number;
	}

	public int getNumberOfStudents() {
		
		return students.size();
	}

	public void enroll(Student student) {
		students.add(student);
		
	}

	public Student get(int index) {
		
		return students.get(index);
		
	}

	public Date getEndDate() {
		
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		
		int numberOfDays = 16 * 7 - 3;
		
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		Date endDate = calendar.getTime();
		
		return endDate;
	}

}
