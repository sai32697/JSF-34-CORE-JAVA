package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set<String>set =new LinkedHashSet<String>();
		set.add("Gnana Sai");
		set.add("Gali AKash");
		set.add("Sri Divya");
		set.add(null);
		set.add("aravind");
		set.add(null);
		set.add("Gali AKash");
		set.add("Sri Divya");
		
		for(String name : set) {
			System.out.println(name);
		}
		
	}

}
