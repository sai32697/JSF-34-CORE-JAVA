package Constructors5;

public class Employee {
	int id;
	String name;
	double salary;
	final static String company="Codegnan it Solutions";

	public Employee(int id, String name, double salary) {
		
		this.id =id;
		this.name=name;
		this.salary=salary;
	}
	public Employee(Employee obj) {
		
		this.id=obj.id;
		this.name=obj.name;
		this.salary=obj.salary;
		

		
	}
	public void getDetails(){
		System.out.println(id + " "+ name+" "+ salary+" "+company);
	}

}
