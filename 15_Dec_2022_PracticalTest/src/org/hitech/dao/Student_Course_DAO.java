package org.hitech.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.hitech.model.Course;
import org.hitech.model.Student;

public class Student_Course_DAO {
	
	private static HashMap<Student,Course> hashMap=new HashMap<Student,Course>();
	
	Student student=new Student();
	Course course=new Course();
	
	public void addStudentCourseDetails(Student s,Course c){
		hashMap.put(s,c);
	}
	public HashMap<Student,Course> getStudentCourseDetails() {
		return hashMap;
	}
	public void deleteStudentCourseDetails(Student s)
	{
			hashMap.remove(student);
	}

}