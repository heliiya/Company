package company;

import java.util.Date;

import department.Department;

public class Manager extends Employee {

	private Department department;

	public Manager(String name, Date hireDate, Department department) {
		super(name, hireDate);
		this.department = department;
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
		return 5000;
	}

	@Override
	public String toString() {
		return "Manager [name= " + getName() + ", department= " + department.getName() + ", salary= "
				+ getSalary() + ", hireDate= " + getHireDate() + "]";
	}

}
