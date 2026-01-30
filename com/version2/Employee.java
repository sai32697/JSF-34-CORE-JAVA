package com.version2;

public class Employee {

	private int id;
	private String name;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee Object Created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
