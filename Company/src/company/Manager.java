package company;

import java.util.Date;

import department.Department;

public class Manager extends Employee {
	
	public Manager(String name, Date hireDate, Department department) {
		super(name, hireDate, department);
	}

	@Override
	public long getSalary() {
		return 5000;
	}

	@Override
	public String toString() {
		return "Manager [name= " + getName() + ", department= " + getDepartment().getName() + ", salary= "
				+ getSalary() + ", hireDate= " + getHireDate() + "]";
	}

}
