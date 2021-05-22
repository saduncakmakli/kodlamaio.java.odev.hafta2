package kodlamaio2;

public class Course {
	
	Course (String name)
	{
		this.name = name;
	}
	
	Course (String name, CourseStage courseStages[])
	{
		this.name = name;
		this.courseStages = courseStages;
	}

	private String name;
	private CourseStage courseStages[];
	private int courseCompleteRate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CourseStage[] getCourseStages() {
		return courseStages;
	}
	public void setCourseStages(CourseStage[] courseStages) {
		this.courseStages = courseStages;
	}
	public int getCourseCompleteRate() {
		return courseCompleteRate;
	}
	public void setCourseCompleteRate(int courseCompleteRate) {
		this.courseCompleteRate = courseCompleteRate;
	}

}
