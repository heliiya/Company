package enums;

public enum DeveloperType {
	JUNIOR("junior"), SENIOR("senior");
	
	private String name;

	private DeveloperType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
