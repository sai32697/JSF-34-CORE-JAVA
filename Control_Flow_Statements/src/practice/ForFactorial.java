package practice;

import java.util.Scanner;

public class ForFactorial {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number :- ");
		if(obj.hasNextInt()) {
			int number=obj.nextInt();
			if(number >=0) {
			int fact =1;
			for (int i=1;i<=number;i++) {
				fact=fact *i;
			}
			System.out.println("Factorial is "+fact);
			
		}else {
			System.out.println("Please enter positive values");
		}}
			else {
			System.out.println("Only enter numbers ");
		}
		
	}

}
