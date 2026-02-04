package com.practice;

public class Test {

	public static void main(String[] args) {
		House obj;
		
		obj=new WoodHouse();
		obj.pillars();
		obj.walls();
		
		obj=new GlassHouse();
		obj.pillars();
		obj.walls();
		
		obj=new ConcreteHouse();
		obj.pillars();
		obj.walls();
		
		obj.basement();
		obj.windows();
		
		

	}

}
