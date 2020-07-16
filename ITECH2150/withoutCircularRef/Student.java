package withoutCircularReference;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int studentID;
	private String gender; 
	private String classification;
	
	//original constructor
	public Student(String name, int studentID, String gender, String classification) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.gender = gender;
		this.classification = classification;
	}
	
	public String getName() {
		return name;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public String getGender() {
		return gender;
	}
	
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentID=" + studentID + ", gender=" + gender + ", classification="
				+ classification + "]";
	}

	
	
	
	
	
}