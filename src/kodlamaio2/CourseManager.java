package kodlamaio2;

public class CourseManager {
	
	void addCourse (Course course)
	{
		System.out.println(course.getName() + " eklendi.");
	}
	
	void editCourse (Course course)
	{
		System.out.println(course.getName() + " d�zenlendi.");
	}
	
	void removeCourse (Course course)
	{
		System.out.println(course.getName() + " silindi.");
	}

}
