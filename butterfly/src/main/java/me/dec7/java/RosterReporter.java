package me.dec7.java;

public class RosterReporter {

	public static final String ROSTER_REPORT_HEADER = "##########";
	public static final String ROSTER_REPORT_FOOTER = "**********";
	public static final String NEWLINE = "\n";
	
	private CourseSession session;

	public RosterReporter(CourseSession session) {
		this.session = session;
	}

	

	public String getReport() {
		StringBuilder buffer = new StringBuilder();
		
		buffer.append(ROSTER_REPORT_HEADER);
		buffer.append(NEWLINE);
		
		for (Student s : session.getAllStudents()) {
			buffer.append(s.getName());
			buffer.append(NEWLINE);
		}
		
		buffer.append(ROSTER_REPORT_FOOTER);
		buffer.append(NEWLINE + session.getNumberOfStudents() + NEWLINE);
		
		return buffer.toString();
	}
}
