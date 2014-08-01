package me.dec7.java;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
	
	public void testCreate() {
		
		Student student1 = new Student("Jane Doe");
		assertEquals("Jane Doe", student1.getName());
		
		
		Student student2 = new Student("Dec7");
		
		student2.setName("donggyu");
		
		assertEquals("donggyu", student2.getName());
		
		
		
	}

}
