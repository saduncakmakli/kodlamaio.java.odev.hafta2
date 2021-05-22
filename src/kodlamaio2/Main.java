package kodlamaio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstructorManager instructorManager = new InstructorManager();
		CourseManager courseManager = new CourseManager();
		
		Instructor instructor = new Instructor("Engin", "Demiro�");
		instructorManager.addTrainee(instructor);
		instructorManager.deleteTrainee(instructor);
		instructorManager.addTrainee(new Instructor("�mer", "�olako�lu"));

		Course course = new Course("Fullstack Yaz�l�m Geli�tici Kursu");
		courseManager.addCourse(course);
		courseManager.addCourse(new Course("C# Yaz�l�m Geli�tirici Kursu"));
		courseManager.editCourse(course);
		courseManager.removeCourse(course);
	}

}
