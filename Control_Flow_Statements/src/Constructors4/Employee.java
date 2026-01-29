package Constructors4;

public class Employee {
	int id;
	String name;
	double salary;
	final static String company="Codegnan it Solutions";
public Employee() {
	// TODO Auto-generated constructor stub
	System.out.println("Default Constructor......");
}

	public Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

	public void getDetails(){
		System.out.println(id + " "+ name+" "+ salary+" "+company);
	}

}
