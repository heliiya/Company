package company;

import java.util.Date;

import department.Department;

public class Bussiness extends Employee{

	private String media;
	private Department department;

	public Bussiness(String name, Date hireDate, String media) {
		super(name, hireDate);
		this.media = media;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public Department getDepartment() {
		return department;
	}

	@Override
	public long getSalary() {
		return 3000;
	}

	@Override
	public String toString() {
		return "Bussiness [name= " + getName() + ", media= " + media + ", salary= " + getSalary()
				+ ", department= " + department.getName() + ", hireDate= " + getHireDate() + "]";
	}

	
}