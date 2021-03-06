package me.dec7.java;

import java.util.Date;

import junit.framework.TestCase;

public class CourseSessionTest extends TestCase {
	
	CourseSession session;
	
	public void setUp() {
		session = new CourseSession("ENGL", "101");
	}
	
	public void testCreate() {
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
		
	}
	
	public void testEnrollStudents() {
		Student student1 = new Student("Cain DiVoe");
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
		
		assertEquals(student1, session.get(0));
		
		
		Student student2 = new Student("Coralee");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
		
		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));

	}
	
	public void testCourseDates() {
		int year = 103;
		int month = 0;
		int date = 6;
		
		Date startDate = new Date(year, month, date);
		
		CourseSession session = new CourseSession("ABCD", "200", startDate);
		
		year = 103;
		month = 3;
		date = 25;
		Date sixteenWeeksOut = new Date(year, month, date);
		
		assertEquals(sixteenWeeksOut, session.getEndDate());
		
		
	}
	
//	public void testRosterReporter() {
//		session.enroll(new Student("A"));
//		session.enroll(new Student("B"));
//		
//		String rosterReport = session.getRosterReport();
//		System.out.println(rosterReport);
//		
//		assertEquals(
//				CourseSession.ROSTER_REPORT_HEADER +
//				CourseSession.NEWLINE +
//				"A" +
//				CourseSession.NEWLINE +
//				"B" +
//				CourseSession.NEWLINE +
//				CourseSession.ROSTER_REPORT_FOOTER +
//				CourseSession.NEWLINE +
//				"2" +
//				CourseSession.NEWLINE
//				, rosterReport);
//		
//	}

}
