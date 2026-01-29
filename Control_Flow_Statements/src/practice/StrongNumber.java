package practice;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		Factorial factorial = new Factorial();
		System.out.println("Enter a Number");
		if(obj.hasNextInt()) {
			int number= obj.nextInt();
			int original_number =number;
			int sum =0;
			while(number >0) {
				int digit = number%10;
				sum =sum+factorial.fact(digit);
				number =number/10;
			}
			if(sum == original_number) {
				System.out.println("Given Number is a Strong Number");
				
			}else {
				System.out.println("Given Number is Not A Strong Number");
			}
			
		}
		
	}

}
