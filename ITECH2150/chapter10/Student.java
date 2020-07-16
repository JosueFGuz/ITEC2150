package chapter10;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int studentId;
	private String gender;
	private String gradeClass;
	private int age;
	
	public Student(String name, int studentId, String gender, String gradeClass) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.gender = gender;
		this.gradeClass = gradeClass;
	}
	public String getName() {
		return name;
	}
	public int getStudentId() {
		return studentId;
	}
	public String getGender() {
		return gender;
	}
	public String getGradeClass() {
		return gradeClass;
	}
	
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", gender=" + gender + ", gradeClass="
				+ gradeClass + "]";
	}
	
	

}
