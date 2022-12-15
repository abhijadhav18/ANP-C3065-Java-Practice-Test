package org.hitech.dao;

import java.util.HashMap;

import org.hitech.model.Course;
import org.hitech.model.Student;

public class Student_Course_DAO {
	





	public class ProductDAO {
		private static HashMap<Student,Course> hash = new HashMap<Student,Course>();
		
		public boolean addStudentCourseDetail(Student std,Course crs) {
			boolean addStatus=false;
			hash.put(std, crs);
			
			
			addStatus=true;
			return addStatus;
			
		}
		
		public HashMap<Student,Course>getStudentcourseDetail(){
			return hash;
		}
		public HashMap<Student,Course> deleteStudentCourseDetails(String c)
		{
			
		}

		
		
		

	}


}
