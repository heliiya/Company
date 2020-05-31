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

		Department department1 = new Department("ZOMOROD DEPARTMENT");
		Employee manager = new Manager("Sara", date, department1);
		print(manager.toString());

		Employee developer = new Developer("Heliya", date, DeveloperLanguage.JAVA, DeveloperType.JUNIOR);
		department1.addDeveloperToDepartment((Developer) developer);
		print(developer.toString());
		
		Employee bussiness = new Bussiness("Mahsa", date, "Mahsa's media");
		department1.addBussinessToDepartment((Bussiness) bussiness);
		print(bussiness.toString());
		
		print(department1.toString());
	}

	private static void print(String text) {
		System.out.println(text);
	}

}
