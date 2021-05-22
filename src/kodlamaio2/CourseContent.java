package kodlamaio2;

public class CourseContent {
	
	
	public CourseContent(String contentName, String contentURL) {
		super();
		this.contentName = contentName;
		this.contentURL = contentURL;
	}
	
	public String getContentName() {
		return contentName;
	}
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}
	public String getContentURL() {
		return contentURL;
	}
	public void setContentURL(String contentURL) {
		this.contentURL = contentURL;
	}

	private String contentName;
	private String contentURL;
}
