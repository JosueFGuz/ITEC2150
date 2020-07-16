package chapter10;

public class Faculty {
	private String firstName;
	private String lastName;
	private String department;
	private int age;
	
	
	
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
	public void addCourse(Course course1, Course course2) {
		// TODO Auto-generated method stub
		
	}
	
	

}
