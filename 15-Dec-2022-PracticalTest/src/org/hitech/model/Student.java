package org.hitech.model;

import java.util.Objects;

public class Student {
	int studentId;
	String studentName;
	String qualification;

	
	Student(){
		
	}
	
	Student(int studentId ,String studentName, String Qualification){
		this.studentId=studentId;
		this.studentName = studentName;
		this.qualification = qualification;
	}
		
	
	public void setStudentId(int studentId) {

		this.studentId = studentId;

	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;

	}

	public void setQualification(String qualification) {
		this.qualification = qualification;

	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getQualification() {
		return qualification;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", qualification=" + qualification
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(qualification, studentId, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(qualification, other.qualification) && studentId == other.studentId
				&& Objects.equals(studentName, other.studentName);
	}

}
