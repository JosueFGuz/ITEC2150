package withoutCircularReference;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
	private String firstName;
	private String lastName;
	private String department;
	private int age;
	
	// original constructor 
	public Faculty(String firstName, String lastName, String department, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public String getDepartment() {
		return department;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Faculty [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + ", age="
				+ age + "]";
	}
	
	
	

	
	
	
	
	

	
	
	
}