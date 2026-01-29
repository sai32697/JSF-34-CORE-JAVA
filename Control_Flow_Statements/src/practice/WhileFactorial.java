package practice;

import java.util.Scanner;

public class WhileFactorial {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number :- ");
		if(obj.hasNextInt()) {
			int number=obj.nextInt();
			int i=1;
			if(number >=0) {
			int fact =1;
			while (i<=number) {
				fact=fact *i;
				i++;
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
