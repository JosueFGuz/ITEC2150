package withoutCircularReference;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private int courseID;
	private String courseName;
	private Faculty faculty; 
	private List<Student> studentList = new ArrayList<>();
	
	// original constructor
	public Course(int courseID, String courseName) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
	}
	// constructor for list
	
		public Course(int courseID, String courseName, Faculty faculty) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.faculty = faculty;
	
	}
	public int getCourseID() {
		return courseID;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void addFaculty (Faculty faculty) {
		this.faculty = faculty;
	}
	public void addStudent(Student student) {
		studentList.add(student);
	}

	@Override
	public String toString() {
		String result = "Course [courseID=" + courseID + ", courseName=" + courseName + "]\n";
		for(Student student : studentList) {
			result += "    " + student.getName() + "\n";
		}
		return result;
	}



	
	
	
	
	

}
