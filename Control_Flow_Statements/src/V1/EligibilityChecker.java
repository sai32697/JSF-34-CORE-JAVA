package V1;

import java.util.Scanner;

public class EligibilityChecker {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Your AGE :- ");
		if(obj.hasNextInt()) {
			int age = obj.nextInt();
			if (age >=0 && age <= 100) {
				if(age >= 18) {
					System.out.println("You are Eligible to vote .......");
					
				}else {
					System.out.println("Your are not eligible to vote.");
				}
				
			}
			else {
				System.out.println("Please enter valid age between 0 to 100");
			}
				
		}else {
			System.out.println("please enter valid integer.");
		}
	}

}
