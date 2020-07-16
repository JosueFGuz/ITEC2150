package chapter10;
import java.util.ArrayList;
import java.util.List;

public class Course {
	private int courseID;
	private String courseName;
	private Faculty faculty;
	private List<Student> studentList = new ArrayList<>();
	private Student student;
	
	
	public Course(int courseID, String courseName) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
	}
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
	public void addFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + "]n\";
	}
	public void addStudent(Student student1, Student student2, Faculty faculty1) {
		// TODO Auto-generated method stub
		this.student = student;
	}
	
	
	
}