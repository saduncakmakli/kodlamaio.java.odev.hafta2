package kodlamaio2;

public class InstructorManager {
	
	void addTrainee(Instructor instructor)
	{
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+ " eklendi.");
	}
	
	void deleteTrainee(Instructor instructor)
	{
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+ " silindi.");
	}

}
