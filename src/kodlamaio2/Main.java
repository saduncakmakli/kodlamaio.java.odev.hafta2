package kodlamaio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstructorManager instructorManager = new InstructorManager();
		CourseManager courseManager = new CourseManager();
		
		Instructor instructor = new Instructor("Engin", "Demiroğ");
		instructorManager.addTrainee(instructor);
		instructorManager.deleteTrainee(instructor);
		instructorManager.addTrainee(new Instructor("Ömer", "Çolakoğlu"));

		Course course = new Course("Fullstack Yazılım Geliştici Kursu");
		courseManager.addCourse(course);
		courseManager.addCourse(new Course("C# Yazılım Geliştirici Kursu"));
		courseManager.editCourse(course);
		courseManager.removeCourse(course);
	}

}
