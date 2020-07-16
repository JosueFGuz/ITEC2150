package chapter10;

import java.util.List;

public class Chapter10Tester {

	public static void main(String[] args) {
		
	List<Course> courseList = new List<Course>;
	Course noneCourse = new Course (0, "Currently not teaching a course");
	Course intro = new Course (2150,"Intermediate Programming");
	Course intermediate = new Course (2140,"Fundamentals of Programming");
	Course advanced = new Course (3150, "IT Course");
	
	Faculty faculty1 = new Faculty ("Josue","Guzman","IT Department", 24);
	Faculty faculty2 = new Faculty ("Joe","Schmoe", "Chemistry Department", 50);
	Faculty faculty3 = new Faculty ("John", "Doe", "Math Department", 65);
	
	Student student1 = new Student ("Josue Guzman", 90011879, "Male","Junior",26);
	Student student2 = new Student ("Guzman Josue", 90011896, "Male","Sophomore",27);
	
	courseList.add(intro);
	courseList.add(intermediate);
	courseList.add(advanced);
	
	course2.addStudent(student1, student2, faculty1);
	course3.addStudent(student2, faculty2);
	
	faculty1.addCourse(course1, course2);
	faculty2.addCourse(course1, course2);
	faculty3.addCourse(course3);
	
	System.out.println(course2);
	System.out.println(faculty3);
	System.out.println(student2);
	

	}
	public static List<Course> findCourses(int studentId, List<Course> courseList){
		List<Course> studentCourseList = new ArrayLIst<>();
		for (Course course : courseList) {
			for(Student s : course.getStudentList()) {
				if (s.getStudentId()== studentId) {
					studentCourseList.add(course);
					break;
					
				}
			}
		}
	}
}
