package playermaker;

public abstract class MultimedialElement {
	protected String title;
	
	public MultimedialElement(String title) {
		this.title = title;
	}
	
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}

}
