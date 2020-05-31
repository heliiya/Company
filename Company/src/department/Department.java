package department;

import java.util.ArrayList;

import company.Bussiness;
import company.Developer;

public class Department {
	
	private String name;
	private ArrayList<Developer> developers;
	private ArrayList<Bussiness> bussinesses;
	
	public Department(String name) {
		this.name = name;
		developers = new ArrayList<>();
		bussinesses = new ArrayList<>();
	}

	public void addDeveloperToDepartment(Developer developer){
		developers.add(developer);
		developer.setDepartment(this);
	}
	
	public void addBussinessToDepartment(Bussiness bussiness){
		bussinesses.add(bussiness);
		bussiness.setDepartment(this);
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", \n developers=" + getDevelopersNameList().toString()
				+ ", \n bussinesses=" + getBussinessesNameList().toString() + "]";
	}
	
	private ArrayList<String> getDevelopersNameList(){
		ArrayList<String> developersNameList = new ArrayList<>();
		for (Developer developer : developers) {
			developersNameList.add(developer.getName());
		}
		return developersNameList;
	}

	private ArrayList<String> getBussinessesNameList(){
		ArrayList<String> bussinessesNameList = new ArrayList<>();
		for (Bussiness bussiness : bussinesses) {
			bussinessesNameList.add(bussiness.getName());
		}
		return bussinessesNameList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
