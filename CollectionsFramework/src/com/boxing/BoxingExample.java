package com.boxing;

public class BoxingExample {

	public static void main(String[] args) {
		int a = 10; // primitive type
		
//		Integer b =(Integer)a;
		Integer b = a; // AutoBoxing
		
		Integer obj = new Integer(1200);
//		int x = (int)obj;
		int x = obj; // Auto Unboxing.........

	}

}