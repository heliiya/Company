package company;

import java.util.Date;

import department.Department;

public class Bussiness extends Employee{

	private String media;

	public Bussiness(String name, Date hireDate, Department department,
			String media) {
		super(name, hireDate, department);
		this.media = media;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	@Override
	public long getSalary() {
		return 3000;
	}

	@Override
	public String toString() {
		return "Bussiness [name= " + getName() + ", media= " + media + ", salary= " + getSalary()
				+ ", department= " + getDepartment().getName() + ", hireDate= " + getHireDate() + "]";
	}

	
}
