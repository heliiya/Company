package enums;

public enum DeveloperLanguage {
	JAVA("Java"), C_PLUS_PLUS("C++"), C_SHARP("C#"), PYTHON("Python"), JAVA_SCRIPT("JavaScript");
	
	private String name;

	private DeveloperLanguage(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
