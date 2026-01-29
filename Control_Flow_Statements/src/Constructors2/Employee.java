package Constructors2;

public class Employee {
	int id;
	String name;
	double salary;
	final static String company="Codegnan it Solutions";

	public Employee(int x, String y, double z) {
		// TODO Auto-generated constructor stub

		id =x;
		name=y;
		salary=z;
	}
	public void getDetails(){
		System.out.println(id + " "+ name+" "+ salary+" "+company);
	}

}
