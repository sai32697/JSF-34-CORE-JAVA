package com.list;


import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<String> List =new Vector<String>();
		List.add("Bashi Rocky");
		List.add("Divya Sree");
		List.add("Gnana Sai");
		List.add("akash");
		List.add("Gnana Sai");
		List.add("akash");
		
		System.out.println(List.indexOf("akash"));
		System.out.println(List.indexOf("Gnana Sai"));
		System.out.println(List.lastIndexOf("Divya Sree"));
		
		System.out.println((List.contains("akash")));
		
		for(String name :List) {
			System.out.println(name+ " ");
		}
	}

}
