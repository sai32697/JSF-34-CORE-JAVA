package Constructors6;

public class Employee {
	public Employee() {
		this(10);
		System.out.println("Default Constructor.....");
	}
	public Employee(int x) {
		this("Sai");
		System.out.println("int Constructor.....");
	}
	public Employee(String y) {
	
		System.out.println("String Constructor.....");
	}

}
