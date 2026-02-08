package com.set;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
	public static void main(String[] args) {
		Set<String>set =new TreeSet<String>();
		set.add("Gnana Sai");
		set.add("Gali AKash");
		set.add("Sri Divya");
		//set.add(null);
		set.add("Aravind");
		//set.add(null);
		set.add("Gali AKash");
		set.add("Sri Divya");
		
		for(String name : set) {
			System.out.println(name);
		}
		
	}

}
