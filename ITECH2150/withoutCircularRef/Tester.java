package withoutCircularReference;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Course> courseList = new ArrayList<>();

		Student student1 = new Student ("Jovany", 20010, "male", "junior" );
		Student student2 = new Student ("Joana", 21150, "female", "senior" );

		
		Course intro = new Course (2140, "Java Introduction");
		Course intermediate = new Course (2150, "Java Intermediate");
		Course advanced = new Course (3150, "Java Professional");

		
		Faculty member1 = new Faculty("Jake", "Paul", "ITEC", 40);
		Faculty member2 = new Faculty("Bong", "Kwon", "ITEC", 42);
		Faculty member3 = new Faculty("Peter", "Do", "ITEC", 33);

		intro.addStudent(student1);
		intro.addStudent(student2);
		intro.addFaculty(member1);
		advanced.addFaculty(member1);
		advanced.addStudent(student2);
		
		courseList.add(intro);
		courseList.add(intermediate);
		courseList.add(advanced);
		
	}
	
	public static List<Course> findCourses(int studentId, List<Course> courseList){
		List<Course> studentCourseList = new ArrayList<>();
		for(Course course : courseList) {
			for(Student s : course.getStudentList()) {
				if(s.getStudentID() == studentId) {
					studentCourseList.add(course);
					break;
				}
			}
		}
		return studentCourseList;
	}

}