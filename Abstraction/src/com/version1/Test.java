package com.version1;

public class Test {
	public static void main(String[] args) {
		User sai =new User();
		sai.getFood(new Zomato());
		
		User rohi =new User();
		rohi.getFood(new Swiggy());
		
		User lalitha =new User();
		lalitha.getFood(new KFC());
			
	}

}
