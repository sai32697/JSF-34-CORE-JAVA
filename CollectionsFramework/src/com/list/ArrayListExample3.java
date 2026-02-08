package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {
	public static void main(String[] args) {
		List<String> List =new ArrayList<String>();
		List.add("Bashi Rocky");
		List.add("Divya Sree");
		List.add("Gnana Sai");
		List.add("akash");
		List.add("Gnana Sai");
		List.add("akash");
		List.add(1, "Meghana");
		
		
		for(String name :List) {
			System.out.println(name+ " ");
		}
		System.out.println("SAI");
		System.out.println(List.get(4));
	}

}
