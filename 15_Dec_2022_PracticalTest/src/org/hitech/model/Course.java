package org.hitech.model;

import java.util.Objects;

public class Course {
	int courseId;
	String courseName;
	double coursePrice;
	
	public Course(){
		
	}
	
	Course(int courseId,String courseName,double coursePrice){
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	

	public void setCOurseId(int courseId) {
		this.courseId = courseId;

	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;

	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;

	}

	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coursePrice=" + coursePrice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseId, courseName, coursePrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseId == other.courseId && Objects.equals(courseName, other.courseName)
				&& Double.doubleToLongBits(coursePrice) == Double.doubleToLongBits(other.coursePrice);
	}

}
