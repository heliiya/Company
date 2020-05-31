package company;

import java.util.Date;

import department.Department;

public abstract class Employee {
	
	private String name;
	private Date hireDate;
	
	public Employee(String name, Date hireDate) {
		super();
		this.name = name;
		this.hireDate = hireDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public abstract long getSalary();

	public abstract Department getDepartment();

	@Override
	public String toString() {
		return "Employee [name= " + name + ", hireDate= " + hireDate
				+ ", salary= " + getSalary() + ", department= "
				+ getDepartment() + "]";
	}
	
}