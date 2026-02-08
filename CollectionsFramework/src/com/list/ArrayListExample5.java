package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5 {
	public static void main(String[] args) {
		List<String> List =new ArrayList<String>();
		List.add("Bashi Rocky");
		List.add("Divya Sree");
		List.add("Gnana Sai");
		List.add("akash");
		List.add("Gnana Sai");
		List.add("akash");
		
		System.out.println(List.size());
		
		List.remove(4);
		List.remove("akash");
		
		System.out.println(List.size());
		
		
		for(String name :List) {
			System.out.println(name+ " ");
		}
	}

}
