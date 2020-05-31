package company;

import java.util.Date;

import department.Department;
import enums.*;

public class Developer extends Employee{
	
	private DeveloperLanguage developerLanguage;
	private DeveloperType developerType;
	private Department department;
	
	public Developer(String name, Date hireDate, DeveloperLanguage developerLanguage, DeveloperType developerType) {
		super(name, hireDate);
		this.developerLanguage = developerLanguage;
		this.developerType = developerType;
	}

	public DeveloperLanguage getDeveloperLanguage() {
		return developerLanguage;
	}

	public void setDeveloperLanguage(DeveloperLanguage developerLanguage) {
		this.developerLanguage = developerLanguage;
	}

	public DeveloperType getDeveloperType() {
		return developerType;
	}

	public void setDeveloperType(DeveloperType developerType) {
		this.developerType = developerType;
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
		return 4000;
	}

	@Override
	public String toString() {
		return "Developer [name= " + getName() + ", language= " + developerLanguage.getName() + ", type= " + developerType.getName()
				+ ", salary= " + getSalary() + ", department= "
				+ department.getName() + ", hireDate= " + getHireDate() + "]";
	}

}