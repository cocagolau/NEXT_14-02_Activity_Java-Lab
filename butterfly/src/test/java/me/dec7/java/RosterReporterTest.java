package me.dec7.java;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;

public class RosterReporterTest extends TestCase {
	
	public void testRosterReport() {
		
		CourseSession session = new CourseSession("ENGL", "101", createDate(2003, 1, 6));
		
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String rosterReport = new RosterReporter(session).getReport();
		
		assertEquals(
				RosterReporter.ROSTER_REPORT_HEADER +
				RosterReporter.NEWLINE +
				"A" +
				RosterReporter.NEWLINE +
				"B" +
				RosterReporter.NEWLINE +
				RosterReporter.ROSTER_REPORT_FOOTER +
				RosterReporter.NEWLINE +
				"2" +
				RosterReporter.NEWLINE
				
				, rosterReport);
		
	}

	private Date createDate(int year, int month, int date) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, date);
		
		return calendar.getTime();
	}
}
