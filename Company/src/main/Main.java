package main;

import java.time.LocalDateTime;
import java.util.Date;

import company.*;
import department.Department;
import enums.*;

public class Main {

	public static void main(String[] args) {
		LocalDateTime now = java.time.LocalDateTime.now();
		@SuppressWarnings("deprecation")
		Date date = new Date(now.getYear(), now.getMonthValue(), now.getDayOfMonth());

		Department department = new Department("ZOMOROD DEPARTMENT");
		Employee manager = new Manager("Sara", date, department);
		print(manager.toString());

		Employee developer = new Developer("Heliya", date, department, DeveloperLanguage.JAVA, DeveloperType.JUNIOR);
		department.addDeveloperToDepartment((Developer) developer);
		print(developer.toString());
		
		Employee bussiness = new Bussiness("Mahsa", date, department, "Mahsa's media");
		department.addBussinessToDepartment((Bussiness) bussiness);
		print(bussiness.toString());
		
		print(department.toString());
	}

	private static void print(String text) {
		System.out.println(text);
	}

}
