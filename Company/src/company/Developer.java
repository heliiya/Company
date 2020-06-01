package company;

import java.util.Date;

import department.Department;
import enums.*;

public class Developer extends Employee{
	
	private DeveloperLanguage developerLanguage;
	private DeveloperType developerType;
	
	public Developer(String name, Date hireDate, Department department,
			DeveloperLanguage developerLanguage, DeveloperType developerType) {
		super(name, hireDate, department);
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

	@Override
	public long getSalary() {
		return 4000;
	}

	@Override
	public String toString() {
		return "Developer [name= " + getName() + ", language= " + developerLanguage.getName() + ", type= " + developerType.getName()
				+ ", salary= " + getSalary() + ", department= "
				+ getDepartment().getName() + ", hireDate= " + getHireDate() + "]";
	}

}
