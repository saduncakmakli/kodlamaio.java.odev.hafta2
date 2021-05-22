package kodlamaio2;

public class CourseStage {
	
	public CourseStage(CourseContent[] courseContents) {
		super();
		this.courseContents = courseContents;
	}

	private CourseContent courseContents[];

	public CourseContent[] getCourseContents() {
		return courseContents;
	}

	public void setCourseContents(CourseContent[] courseContents) {
		this.courseContents = courseContents;
	}
}
